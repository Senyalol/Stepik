package com.Stepik.Stepik.Classes.Bank;

import com.Stepik.Stepik.Classes.ParentClassesAccounts.AccountWithdraw;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
//Класс транзакции
public class Transaction {

    private AccountWithdraw senderAccount;
    private double summa;

    //Коснтруктор класса для снятия денег со счета
    public Transaction(AccountWithdraw sender, double summa){
        this.senderAccount = sender;
        this.summa = summa;
    }

    @Override
    public String toString() {
        String message = "ID клиента: " + this.senderAccount.getClientID() + " ID счета: " + this.senderAccount.getId() + " Сумма транзакции: " + this.summa;
        return message;
    }

}
