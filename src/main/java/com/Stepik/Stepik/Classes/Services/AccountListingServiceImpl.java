package com.Stepik.Stepik.Classes.Services;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {

    //Интерфейс для CRUD операций со счетами
    AccountDAO accountDAO;

    //Получить конкретный счет клиента
    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return accountDAO.getClientAccount(clientID, accountID);
    }

    //Получить конкретный отзывной счет клиента
    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return accountDAO.getClientWithdrawAccount(clientID, accountID);
    }

    //Получить все счета для клиента
    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    //Получить все счета определенного типа для клиента
    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return accountDAO.getClientAccountsByType(clientID, accountType);
    }

}
