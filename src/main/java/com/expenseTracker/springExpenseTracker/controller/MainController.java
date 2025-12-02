package com.expenseTracker.springExpenseTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.expenseTracker.springExpenseTracker.model.Commands;
import com.expenseTracker.springExpenseTracker.repository.CommandsRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    private boolean isSorted = false;

    @Autowired
    private CommandsRepository commandsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Commands>
    }

}
