package com.lld.splitwise.interfaces.strategies;

import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.models.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) {

    }
}
