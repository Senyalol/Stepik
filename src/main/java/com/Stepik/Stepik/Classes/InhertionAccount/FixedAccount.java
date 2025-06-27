package com.Stepik.Stepik.Classes.InhertionAccount;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountDeposit;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;

//Нельзя снимать деньги с этого счета
public class FixedAccount extends AccountDeposit {

    public FixedAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawal) {
        super(accountType ,id, clientID, balance, withdrawal);
    }

    //Пополнить счет
    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }

}
