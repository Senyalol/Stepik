package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;

//Интерфейс для создания операций над счетом
public interface CreateAccountOperationUI {

    //Запросить тип аккаунта
    public AccountType requestAccountType();

}
