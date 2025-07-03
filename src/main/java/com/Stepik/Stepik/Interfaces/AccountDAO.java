package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;

import java.util.List;

//Интерфейс класса отвечающего за CRUD работу со счетами в памяти
public interface AccountDAO {

    //Метод для получения аккаунтов по ID клиента
    public List<Account> getClientAccounts(String clientID);

    //Создать новый аккаунт
    public void createNewAccount(Account account);

    //Обновить данные аккаунта
    public void updateAccount(Account account);

    //Получить акаунт через доступ клиента
    public AccountWithdraw getClientWithdrawAccount(String clientID , String accountID);

    //Получить клиент аккаунта
    public Account getClientAccount(String clientID, String accountID);

    //Получить конкретные виды счетов клиента
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
