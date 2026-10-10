package com.lld.splitwise.models;

public class Balance {
    private double amountOwed;
    private double getAmountOwed;

    public Balance(double amountOwed, double getAmountOwed) {
        this.amountOwed = amountOwed;
        this.getAmountOwed = getAmountOwed;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }

    public double getGetAmountOwed() {
        return getAmountOwed;
    }

    public void setGetAmountOwed(double getAmountOwed) {
        this.getAmountOwed = getAmountOwed;
    }
}
