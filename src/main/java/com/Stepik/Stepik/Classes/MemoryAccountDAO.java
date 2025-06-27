package com.Stepik.Stepik.Classes;

import com.Stepik.Stepik.Interfaces.AccountDAO;

import java.util.ArrayList;
import java.util.List;

//Класс отвечающий за работу со счетами в памяти
public class MemoryAccountDAO implements AccountDAO {

    private List<Account> accountList = new ArrayList<>();

    //Получить список аккаунтов
    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountList;
    }

    //Создать новый счет
    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    //Обновить текущий счет
    @Override
    public void updateAccount(Account account) {

        int index = accountList.indexOf(account);

        accountList.set(index, account);

    }

    //
    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }



}
