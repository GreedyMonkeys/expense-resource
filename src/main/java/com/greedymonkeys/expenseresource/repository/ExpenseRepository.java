package com.greedymonkeys.expenseresource.repository;

import com.greedymonkeys.expenseresource.model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {}
