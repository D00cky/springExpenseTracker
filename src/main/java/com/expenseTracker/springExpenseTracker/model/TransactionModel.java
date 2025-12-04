package com.expenseTracker.springExpenseTracker.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class TransactionModel {

    @Id
    @Column
    private Integer id;

    @Column
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate Date;

    @Column
    private String description;

    @Column
    private double amount;

    //setter/getter methods
    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate expenseDate) {
        this.Date = expenseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
