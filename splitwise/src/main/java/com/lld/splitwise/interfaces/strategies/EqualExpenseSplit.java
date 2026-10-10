package com.lld.splitwise.interfaces.strategies;

import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.models.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) {
        double splitAmount = amount / splits.size();

        for (Split split : splits) {
            if (split.getAmountOwned() != splitAmount) {
                throw new IllegalArgumentException("Invalid split amount for equal split. Each split should be: " + splitAmount);
            }
        }
    }
}
