package com.Stepik.Stepik.Classes.Services;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountWithdrawService;

//Аккаунт реализующий интерфейс снятия средств со счета
public class AccountWithdrawServiceImpl implements AccountWithdrawService {

    private AccountDAO accountDAO;

    //Конструктор класса
    public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        account.setBalance(-amount);
        accountDAO.updateAccount(account);
    }

}
