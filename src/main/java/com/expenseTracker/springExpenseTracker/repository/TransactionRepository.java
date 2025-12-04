package com.expenseTracker.springExpenseTracker.repository;

import com.expenseTracker.springExpenseTracker.model.TransactionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionModel, Integer> {
}
