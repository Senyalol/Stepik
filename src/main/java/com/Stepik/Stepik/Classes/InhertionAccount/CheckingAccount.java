package com.Stepik.Stepik.Classes.InhertionAccount;

//import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;

//Можно снимать и пополнять деньги с этого счета
public class CheckingAccount extends AccountWithdraw {

    public CheckingAccount(AccountType accountType , String id, String clientID, double balance, boolean withdraw) {
        super(accountType, id, clientID, balance, withdraw);
    }

    //Пополнить счет
    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }

    //Снять со счета
    @Override
    public double getBalance() {
        return super.getBalance();
    }

}

