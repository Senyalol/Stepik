package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;

//Интерфейс для пополнения счета
public interface AccountDepositService {

    void deposit(double amount, AccountWithdraw account);

}
