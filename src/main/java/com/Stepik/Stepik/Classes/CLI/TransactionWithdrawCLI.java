package com.Stepik.Stepik.Classes.CLI;

import com.Stepik.Stepik.Classes.Bank.TransactionWithdraw;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountListingService;
import com.Stepik.Stepik.Interfaces.WithdrawDepositOperationCLIUI;

//Класс отвечающий за снятие средств со счета при помощи ввода данных в терминал
public class TransactionWithdrawCLI {

    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    //Коснтруктор класса
    public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw, WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListing) {
        this.transactionWithdraw = transactionWithdraw;
        this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
        this.accountListing = accountListing;
    }

    public void withdrawMoney(String clientID) {

        double summa = withdrawDepositOperationCLIUI.requestClientAmount();

        String accountOperationID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        AccountWithdraw accountO = accountListing.getClientWithdrawAccount(clientID, accountOperationID);

        transactionWithdraw.execute(accountO, summa);

    }

}
