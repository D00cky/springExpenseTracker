package com.expenseTracker.springExpenseTracker.controller;

import com.expenseTracker.springExpenseTracker.model.TransactionModel;
import com.expenseTracker.springExpenseTracker.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping(path="/tran")
public class TranscationController {

    @Autowired
    TransactionService transactionService;

    @GetMapping(path="/transactions")
    public List<TransactionModel> getAllTransactions(){
        return null;
    }

    @GetMapping(path="/transactions/{id}")
    public TransactionModel getTransaction(@PathVariable("id") int id)
    {
        return null;
    }

    @DeleteMapping("/transactions/{id}")
    public void deleteTransaction(@PathVariable("id") int id)
    {

    }

    @PostMapping("/transactions")
    public void addTransaction(@RequestBody TransactionModel transactionModel) {
        transactionService.saveOrUpdate(transactionModel);
        if (transactionModel.getDate() == null) {
            transactionModel.setDate(LocalDate.now());
        }
    }

    @PutMapping("/transactions")
    public void updateTransaction(@RequestBody TransactionModel transactionModel) {

    }

}
