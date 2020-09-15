package com.sthanik.expensetrack.service;

import com.sthanik.expensetrack.model.ExpenseDetails;

public interface ExpenseService {
    void saveExpense(ExpenseDetails expenseDetails);
}
