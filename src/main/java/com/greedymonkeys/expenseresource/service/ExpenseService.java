package com.greedymonkeys.expenseresource.service;

import com.greedymonkeys.expenseresource.model.Expense;
import com.greedymonkeys.expenseresource.repository.ExpenseRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseValidator expenseValidator;

    public Expense create(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> findById(Long id) {
        return expenseRepository.findById(id);
    }

    public void deleteById(Long id) {
        expenseRepository.deleteById(id);
    }

    public Expense update(Expense expense) {
        expenseValidator.checkExpenseExists(expense);
        return expenseRepository.save(expense);
    }
}
