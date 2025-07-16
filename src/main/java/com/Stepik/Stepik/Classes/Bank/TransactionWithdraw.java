package com.Stepik.Stepik.Classes.Bank;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountWithdrawService;
import com.Stepik.Stepik.Interfaces.TransactionDAO;

//Класс осуществляющий снятие средств со счета
public class TransactionWithdraw {

    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    //Конструктор класса
    public TransactionWithdraw(AccountWithdrawService accountWithdrawService, TransactionDAO transactionDAO) {
        this.accountWithdrawService = accountWithdrawService;
        this.transactionDAO = transactionDAO;
    }

    public void execute(AccountWithdraw certainAccount, double summa){

        if(certainAccount.getBalance() >= summa){

            accountWithdrawService.withdraw(summa, certainAccount);

            Transaction newTransaction = new Transaction(certainAccount, summa);
            transactionDAO.addTransaction(newTransaction);

        }

    }

}