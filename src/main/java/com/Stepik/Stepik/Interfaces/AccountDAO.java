package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.Account;
import com.Stepik.Stepik.Classes.AccountWithdraw;

import java.util.List;

public interface AccountDAO {

    //Метод для получения аккаунтов по ID клиента
    public List<Account> getClientAccounts(String clientID);

    //Создать новый аккаунт
    public void createNewAccount(Account account);

    //Обновить данные аккаунта
    public void updateAccount(Account account);

    //Получить аккаунт клиента по типу аккаунта
   // public List<Account> getClientAccountsByType(String clientID, AccountType accountType)

    //Получить акаунт через доступ клиента
    public AccountWithdraw getClientWithdrawAccount(String clientID , String accountID);

    //Получить клиент аккаунта
    public Account getClientAccount(String clientID, String accountID);

}
