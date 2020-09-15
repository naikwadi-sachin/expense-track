package com.sthanik.expensetrack.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ExpenseDetails {
    private String vendorName;
    private BigDecimal amount;
    private String date;
}
