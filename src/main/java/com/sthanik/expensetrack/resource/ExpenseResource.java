package com.sthanik.expensetrack.resource;

import com.sthanik.expensetrack.model.ExpenseDetails;
import com.sthanik.expensetrack.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense")
public class ExpenseResource {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public void saveExpense(@RequestBody ExpenseDetails expenseDetails) {
        // TODO validate expense details

        // in case service model object is different from the resource model,
        // then provide logic to convert models between resource and service layers

        service.saveExpense(expenseDetails);

        // TODO decide what should be returned back to client

    }

}
