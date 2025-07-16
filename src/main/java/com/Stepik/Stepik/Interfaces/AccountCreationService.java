package com.Stepik.Stepik.Interfaces;

//import com.Stepik.Stepik.Classes.ParentClassesAccounts.Account;
import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountType;

//Интерфейс для создания счета
public interface AccountCreationService {

    //Метод для создания счета
    public void create(AccountType accountType, long bankID, String clientID, long accountID);

}
