package com.expenseTracker.springExpenseTracker.service;

import com.expenseTracker.springExpenseTracker.model.TransactionModel;
import com.expenseTracker.springExpenseTracker.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;

    public TransactionModel getTransactionById(int id) {
        return repository.findById(id).get();
    }

    public List<TransactionModel> getAllTransactions() {
        List<TransactionModel> transactions = new ArrayList<TransactionModel>();
        repository.findAll().forEach(transactionModel -> transactions.add(transactionModel));
        return transactions;
    }

    public void saveOrUpdate(TransactionModel transactionModel) {
        repository.save(transactionModel);
    }

    public void deleteTransactionById(int id) {
        repository.deleteById(id);
    }
}
