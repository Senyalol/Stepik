package com.Stepik.Stepik.Classes;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDAO;

import java.util.ArrayList;
import java.util.List;

//Класс отвечающий за CRUD работу со счетами в памяти реализует интерфейс AccountDAO
public class MemoryAccountDAO implements AccountDAO {

    //Хранилище счетов
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

    //Получить отзывной счет конкретного клиента
    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {

        for (Account account : accountList) {

            if(account.getClientID().equals(clientID) && account.getId().equals(accountID)) {

                if(account.getAccountType() == AccountType.SAVING
                       || account.getAccountType()== AccountType.CHECKING){

                    return (AccountWithdraw)account;

                }

            }

        }

        return null;

    }

    //Получить счет конкретного клиента
    @Override
    public Account getClientAccount(String clientID, String accountID) {

        for(Account account : accountList) {

            if(account.getClientID().equals(clientID) && account.getId().equals(accountID)) {
                return account;
            }

        }

        return null;

    }

    //Получить конкретные виды счетов клиента
    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType){

        List<Account> TempAccountsList = new ArrayList<>();

        for(Account account : accountList) {

            if(account.getClientID().equals(clientID)
                    && account.getAccountType() == accountType){

                TempAccountsList.add(account);

            }

        }

        return TempAccountsList;

    }

}
