package com.Stepik.Stepik.Classes.ParentClassesAccounts;


//import java.util.Objects;

public class Account {

    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;

    //Конструктор класса
    public Account(AccountType accountType1,String id, String clientID, double balance, boolean withdrawAllowed) {
        this.accountType = accountType1;
        this.id = id; //String.format("%03d%06d", Integer.parseInt(clientID), Integer.parseInt(id));
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

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
        return String.format("Account{id=%s, clientID=%s, balance=%.2f}",
                id, clientID, balance);
    }

    //Геттер id клиента
    public String getClientID() {
        return clientID;
    }

    //Сеттер id клиента
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    //Геттер доступа
    public boolean IsWithdrawAllowed() {
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
        this.balance += balance;
    }

}
