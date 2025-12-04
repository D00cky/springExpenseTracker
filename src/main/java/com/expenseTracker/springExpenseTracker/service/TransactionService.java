package com.expenseTracker.springExpenseTracker.service;

import com.expenseTracker.springExpenseTracker.model.TransactionModel;
import com.expenseTracker.springExpenseTracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public TransactionModel getTransactionById(int id) {
        return null;
    }

    public List<TransactionModel> getAllTransactions() {
        return null;
    }

    public void saveOrUpdate(TransactionModel transactionModel) {
    }

    public void deleteTransactionById(int id) {
    }
}
