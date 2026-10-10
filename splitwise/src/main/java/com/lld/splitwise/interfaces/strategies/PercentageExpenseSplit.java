package com.lld.splitwise.interfaces.strategies;

import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.models.Split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit {
        @Override
        public void validateSplitRequest(List<Split> splits, double amount) {
            double totalPercentage = 0;

            for (Split split : splits) {
                totalPercentage += split.getAmountOwned();
            }

            if (totalPercentage != 100) {
                throw new RuntimeException("Invalid percentage split");
            }
        }
}
