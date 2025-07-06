package com.Stepik.Stepik.Classes.CLI;

import com.Stepik.Stepik.Classes.Bank.BankCore;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Interfaces.AccountListingService;
import com.Stepik.Stepik.Interfaces.CreateAccountOperationUI;

//Класс отвечающий за базовый ввод счета с консоли
public class AccountBasicCLI {

    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    //Конструктор класса
    AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {

        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;

    }

    //Запрос на создание счета для клиента
    public void createAccountRequest(String clientID){

        AccountType accountTypeForNewAccount = createAccountOperationUI.requestAccountType();
        bankCore.createNewAccount(accountTypeForNewAccount,clientID);

    }

    //Выводит счета конкретного клиента
    public void getAccounts(String clientID){

        System.out.println(accountListing.getClientAccounts(clientID));

    }

}
