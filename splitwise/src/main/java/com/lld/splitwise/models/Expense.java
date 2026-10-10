package com.lld.splitwise.models;

import com.lld.splitwise.enums.SplitType;

import java.util.List;

public class Expense {
    private Integer id;
    private String name;
    private double amount;
    private User paidByUser;
    List<Split> splits;
    private SplitType splitType;

    public Expense(Integer id, String name, double amount, User paidByUser, List<Split> splits, SplitType splitType) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.paidByUser = paidByUser;
        this.splits = splits;
        this.splitType = splitType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidByUser() {
        return paidByUser;
    }

    public void setPaidByUser(User paidByUser) {
        this.paidByUser = paidByUser;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}
