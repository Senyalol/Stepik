package com.Stepik.Stepik.Interfaces;

import com.Stepik.Stepik.Classes.Bank.Transaction;
import java.util.List;

//Интрефейс для транзакций со счета на счет
public interface TransactionDAO {

    //Получить все транзакции
    List<Transaction> getTransactions();

    //Добавить транзакцию в хранилище всех транзакций
    void addTransaction(Transaction transaction);

}
