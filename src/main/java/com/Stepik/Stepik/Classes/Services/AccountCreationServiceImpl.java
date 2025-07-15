package com.Stepik.Stepik.Classes.Services;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {

    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    /**
     * @param accountType
     * @param bankID
     * @param clientID
     * @param accountID
     */

//    SAVING_ACCOUNT,    // Сберегательный счёт
//    CHECKING_ACCOUNT,

    //Создать счетв банке
    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {

        boolean withdraw = false;

        if(accountType == AccountType.SAVING
                || accountType == AccountType.CHECKING) {

            withdraw = true;

        }

        String accountIDStr = String.valueOf(accountID);
        Account newAccount = new Account(accountType,accountIDStr,clientID,0,withdraw);
        accountDAO.createNewAccount(newAccount);
    }
}
