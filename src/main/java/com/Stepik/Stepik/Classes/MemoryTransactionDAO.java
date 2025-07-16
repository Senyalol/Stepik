package com.Stepik.Stepik.Classes;

import com.Stepik.Stepik.Classes.Bank.Transaction;
import com.Stepik.Stepik.Interfaces.TransactionDAO;

import java.util.List;

//Класс с хранилищем всех транзакций
public class MemoryTransactionDAO implements TransactionDAO {

    private List<Transaction> transactions;

    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

}
