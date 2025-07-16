package com.Stepik.Stepik.Classes.Bank;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDepositService;
import com.Stepik.Stepik.Interfaces.TransactionDAO;

//Класс осуществляющий передачу средств на счет
public class TransactionDeposit {

    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    //Конструктор класса
    public TransactionDeposit(AccountDepositService accountDepositService, TransactionDAO transactionDAO) {
        this.accountDepositService = accountDepositService;
        this.transactionDAO = transactionDAO;
    }

    //Исполнение транзакции
    public void execute(AccountWithdraw sender, double summa) {

            accountDepositService.deposit(summa, sender);

//            Transaction newTransaction = new Transaction(sender, summa);
//            transactionDAO.addTransaction(newTransaction);


    }

}
