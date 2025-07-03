package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;

import java.util.List;

public interface AccountListingService {

    //Получить конкретный счет клиента
    Account getClientAccount(String clientID, String accountID);

    //Получить конкретный отзывной счет клиента
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    //Получить все счета для клиента
    List<Account> getClientAccounts(String clientID);

    //Получить все счета определенного типа для клиента
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);

}
