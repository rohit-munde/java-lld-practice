package com.lld.splitwise.models;

public class Split {
    private User user;
    private double amountOwned;

    public Split(User user, double amountOwned) {
        this.user = user;
        this.amountOwned = amountOwned;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmountOwned() {
        return amountOwned;
    }

    public void setAmountOwned(double amountOwned) {
        this.amountOwned = amountOwned;
    }
}
