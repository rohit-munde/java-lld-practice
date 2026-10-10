package com.lld.splitwise.controllers;

import com.lld.splitwise.models.Split;
import com.lld.splitwise.models.User;
import com.lld.splitwise.models.UserExpenseBalanceSheet;

import java.util.List;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {
        UserExpenseBalanceSheet userExpenseBalanceSheet = expensePaidBy.getUserExpenseBalanceSheet();

        
    }
}
