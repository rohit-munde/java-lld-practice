package com.lld.splitwise.models;

public class User {
    private Integer id;
    private String name;
    private UserExpenseBalanceSheet balanceSheet;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.balanceSheet = new UserExpenseBalanceSheet();
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

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return balanceSheet;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
}
