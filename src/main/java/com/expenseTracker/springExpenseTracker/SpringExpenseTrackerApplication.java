package com.expenseTracker.springExpenseTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@ComponentScan({"com.expenseTracker.springExpenseTracker.controller",
        "com.expenseTracker.springExpenseTracker.service"})
@EntityScan("com.expenseTracker.springExpenseTracker.model")
@EnableJpaRepositories("com.expenseTracker.springExpenseTracker.repository")
@SpringBootApplication
public class SpringExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExpenseTrackerApplication.class, args);
	}

}
