package com.Stepik.Stepik.Classes.ParentClassesAccounts;

//Счет в котором можно только снимать
public class AccountDeposit extends Account {

    public AccountDeposit(AccountType accountType ,String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType ,id, clientID, balance, withdrawAllowed);
    }

    //Снять со счета
    @Override
    public double getBalance() {
        return super.getBalance();
    }


}
