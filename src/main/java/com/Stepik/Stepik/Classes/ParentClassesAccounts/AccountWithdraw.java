package com.Stepik.Stepik.Classes.ParentClassesAccounts;

//Счет в котором можно снимать и вносить деньги
public class AccountWithdraw extends Account {

    public AccountWithdraw(AccountType accountType ,String id , String clientID, double balance, boolean withdrawal) {
        super(accountType, id, clientID, balance, withdrawal);
    }

    //Внести деньги
    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }

    //Получить деньги
    @Override
    public double getBalance() {
        return super.getBalance();
    }

}

