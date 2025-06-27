package com.Stepik.Stepik.Classes;

//Можно снимать и пополнять с этого счета
public class SavingAccount extends AccountWithdraw {

    public SavingAccount(AccountType accountType, String id, String name, double balance, boolean withdrawal) {
        super(accountType, id, name, balance, withdrawal);
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
