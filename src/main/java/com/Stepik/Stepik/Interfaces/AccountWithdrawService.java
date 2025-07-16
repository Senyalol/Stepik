package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;

//Сервис отвечающий за снятие средств со счета
public interface AccountWithdrawService {

    void withdraw(double amount, AccountWithdraw account);

}
