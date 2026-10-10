package com.lld.splitwise.factory;

import com.lld.splitwise.enums.SplitType;
import com.lld.splitwise.interfaces.ExpenseSplit;
import com.lld.splitwise.interfaces.strategies.EqualExpenseSplit;
import com.lld.splitwise.interfaces.strategies.PercentageExpenseSplit;
import com.lld.splitwise.interfaces.strategies.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(SplitType splitType) {
        return switch (splitType) {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnequalExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
            default -> throw new IllegalArgumentException("Invalid split type");
        };
    }
    }
