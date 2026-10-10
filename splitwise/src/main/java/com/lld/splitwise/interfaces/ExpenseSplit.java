package com.lld.splitwise.interfaces;

import com.lld.splitwise.models.Split;

import java.util.List;

public interface ExpenseSplit {
    void validateSplitRequest(List<Split> splits, double amount);
}
