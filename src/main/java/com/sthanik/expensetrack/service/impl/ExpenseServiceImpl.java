package com.sthanik.expensetrack.service.impl;

import com.sthanik.expensetrack.model.ExpenseDetails;
import com.sthanik.expensetrack.service.ExpenseService;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Override
    public void saveExpense(ExpenseDetails expenseDetails) {
        // TODO perform pre-processing business logic before saving the record in database

        // TODO save the expense details in database
    }
}
