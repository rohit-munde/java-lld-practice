package com.lld.splitwise.controllers;

import com.lld.splitwise.enums.SplitType;
import com.lld.splitwise.factory.SplitFactory;
import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.models.Expense;
import com.lld.splitwise.models.Split;
import com.lld.splitwise.models.User;

import java.util.List;

public class ExpenseController {

    private final BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(Integer expenseId, String name, double amount, List<Split> splitList, SplitType splitType, User paidByUser) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitList, amount);
        Expense expense = new Expense(expenseId, name, amount, paidByUser, splitList, splitType);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitList, amount);

        return expense;
    }
}
