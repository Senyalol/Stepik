package com.Stepik.Stepik.Classes.CLI;

import com.Stepik.Stepik.Classes.Bank.TransactionDeposit;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountListingService;
import com.Stepik.Stepik.Interfaces.WithdrawDepositOperationCLIUI;

//Класс отвечающий за манпуляцию с транзакциями при помощи ввода через консоль
public class TransactionDepositCLI {

    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperation;
    private AccountListingService accountListing;

    //Конструктор класса
    public TransactionDepositCLI(TransactionDeposit transactionDeposit, WithdrawDepositOperationCLIUI withdrawDepositOperation, AccountListingService accountListing) {
        this.transactionDeposit = transactionDeposit;
        this.withdrawDepositOperation = withdrawDepositOperation;
        this.accountListing = accountListing;
    }

    //Депнуть деньги на счет
    public void depositMoney(String clientID){

        //Запрашиваем сумму перевода
        double summa = withdrawDepositOperation.requestClientAmount();

        //Запрашиваем счет отправителя
        String senderID = withdrawDepositOperation.requestClientAccountNumber();
        AccountWithdraw sender = accountListing.getClientWithdrawAccount(clientID,senderID);

        transactionDeposit.execute(sender,summa);

    }

}
