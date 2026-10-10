package com.lld.splitwise.controllers;

import com.lld.splitwise.enums.SplitType;
import com.lld.splitwise.models.Expense;
import com.lld.splitwise.models.Split;
import com.lld.splitwise.models.User;

import java.util.List;

public class ExpenseController {


    public Expense createExpense(Integer expenseId, String name, double amount, List<Split> splitList, SplitType splitType, User paidByUser) {
        return new Expense(expenseId, name, amount, paidByUser, splitList, splitType);
    }
}
