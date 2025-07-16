package com.Stepik.Stepik.Classes.Services;


import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountDepositService;

//Класс реализующий интерфейс для пополнение счета
public class AccountDepositServiceImpl implements AccountDepositService {

    private AccountDAO accountDAO;

    //Конструктор класса
    public AccountDepositServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    //Непосредственно метод для пополнения баланса счета
    @Override
    public void deposit(double amount, AccountWithdraw account) {
        account.setBalance(amount);
        accountDAO.updateAccount(account);
    }

}
