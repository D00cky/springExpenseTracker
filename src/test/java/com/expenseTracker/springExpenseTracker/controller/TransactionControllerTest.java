package com.expenseTracker.springExpenseTracker.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.expenseTracker.springExpenseTracker.model.TransactionModel;
import com.expenseTracker.springExpenseTracker.SpringExpenseTrackerApplication;

@SpringBootTest(classes = SpringExpenseTrackerApplication.class)
@AutoConfigureMockMvc
public class TransactionControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockitoBean
    private TransactionModel transactionModel;

    @Test
    public void testGetAllTransatcions() throws Exception {
        TransactionModel transactionModel;
    }
}
