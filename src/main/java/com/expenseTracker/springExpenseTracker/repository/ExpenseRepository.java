package com.expenseTracker.springExpenseTracker.repository;

import com.expenseTracker.springExpenseTracker.model.ExpenseModel;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<ExpenseModel, Integer> {

}
