package com.lld.splitwise.interfaces.strategies;

import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.models.Split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) {
        double total = 0;

        for (Split split : splits) {
            total += split.getAmountOwned();
        }

        if (total != amount) {
            throw new RuntimeException("Invalid unequal split");
        }
    }
}
