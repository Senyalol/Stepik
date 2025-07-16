package com.Stepik.Stepik.Classes.Services;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountDeposit;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import com.Stepik.Stepik.Interfaces.AccountDAO;
import com.Stepik.Stepik.Interfaces.AccountCreationService;

//Класс реализующий интерфейс для создания счета
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
        String accountIDStr = String.valueOf(accountID);

        if(accountType == AccountType.SAVING
                || accountType == AccountType.CHECKING) {

            withdraw = true;

            AccountWithdraw newAccount = new AccountWithdraw(accountType,accountIDStr,clientID,0,withdraw);
            accountDAO.createNewAccount(newAccount);

        }

        else{

            AccountDeposit newAccount = new AccountDeposit(accountType,accountIDStr,clientID,0,withdraw);
            accountDAO.createNewAccount(newAccount);

        }


    }
}
