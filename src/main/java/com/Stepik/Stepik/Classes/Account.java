package com.Stepik.Stepik.Classes;

enum AccountType {
    SAVING_ACCOUNT,    // Сберегательный счёт
    CHECKING_ACCOUNT,   // Текущий счёт
    FIXED_ACCOUNT,      // Срочный вклад
    DEPOSIT_ACCOUNT,    // Депозитный счёт
    WITHDRAW_ACCOUNT    // Счёт с особыми условиями снятия
}

public class Account {

    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;

    //Узнать какой у этого счета тип
    public AccountType getAccountType(){
        return accountType;
    }

    //Установить какой это тип счета
    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }

    //Геттер баланс
    protected double getBalance() {
        return balance;
    }

    //Вывод данных о классе
    @Override
    public String toString(){
        String accountNumber = String.format("%03d%06d", 1, id);
        return accountNumber;
    }

    //Геттер id клиента
    public String getClientID() {
        return clientID;
    }

    //Сеттер id клиента
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    //Конструктор класса
    public Account(AccountType accountType1,String id, String clientID, double balance, boolean withdrawAllowed) {
        this.accountType = accountType1;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    //Геттер доступа
    public boolean IswithdrawAllowed() {
        return withdrawAllowed;
    }

    //Сеттер доступа
    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    //Геттер id
    public String getId() {
        return id;
    }

    //Сеттер id
    public void setId(String id) {
        this.id = id;
    }

    //Сеттер баланса
    protected void setBalance(double balance) {
        this.balance = balance;
    }

}