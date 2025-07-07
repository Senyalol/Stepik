package com.Stepik.Stepik.Classes.Bank;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;
import com.Stepik.Stepik.Interfaces.AccountCreationService;

public class BankCore {

    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    //Коснтруктор класса банка
    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreation = accountCreationService;
    }

    //Создать новый счет
    public void createNewAccount(AccountType accountType, String clientID) {

        this.incrementLastAccountNumber();
        accountCreation.create(accountType,id,clientID,lastAccountNumber);
    }

    //С каждым созданием нового счета инкрементирует поле (последний номер счета в этом классе)
    private void incrementLastAccountNumber() {
        lastAccountNumber++;
    }

}
