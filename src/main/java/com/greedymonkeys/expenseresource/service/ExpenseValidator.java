package com.greedymonkeys.expenseresource.service;

import com.greedymonkeys.expenseresource.model.Expense;
import com.greedymonkeys.expenseresource.repository.ExpenseRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ExpenseValidator {

    private final ExpenseRepository expenseRepository;

    void validate(Expense expense) {} // questa la fa copilot con copilot

    void checkExpenseExists(Expense expense) {
        if (expense == null) {
            throw new IllegalArgumentException("Expense cannot be null");
        }

        if (expense.getId() == null) {
            throw new IllegalArgumentException("Expense cannot have blank id");
        }

        if (!expenseRepository.existsById(expense.getId())) {
            throw new IllegalArgumentException("Expense does not exist");
        }
    }
}
