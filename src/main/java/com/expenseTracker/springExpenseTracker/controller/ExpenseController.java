package com.expenseTracker.springExpenseTracker.controller;

import com.expenseTracker.springExpenseTracker.model.ExpenseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.expenseTracker.springExpenseTracker.repository.ExpenseRepository;

import java.time.LocalDate;

@Controller
@RequestMapping(path="/expense")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewExpense(@RequestParam String description, @RequestParam double amount, @RequestParam LocalDate date){

        ExpenseModel newExpense = new ExpenseModel();
        newExpense.setDescription(description);
        newExpense.setAmount(amount);
        newExpense.setDate(date);
        expenseRepository.save(newExpense);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ExpenseModel> summary() {
        return expenseRepository.findAll();
    }

}
