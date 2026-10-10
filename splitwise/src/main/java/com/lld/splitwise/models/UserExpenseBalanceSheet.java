package com.lld.splitwise.models;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    private Map<String, Balance> userBalance;
    private double totalYourExpense;
    private double totalPayment;
    private double totalYouOwe;
    private double totalYouGet;

    public UserExpenseBalanceSheet() {
        this.userBalance = new HashMap<>();
        this.totalYourExpense = 0;
        this.totalPayment = 0;
        this.totalYouOwe = 0;
        this.totalYouGet = 0;
    }

    public UserExpenseBalanceSheet(Map<String, Balance> userBalance, double totalYourExpense, double totalPayment, double totalYouOwe, double totalYouGet) {
        this.userBalance = userBalance;
        this.totalYourExpense = totalYourExpense;
        this.totalPayment = totalPayment;
        this.totalYouOwe = totalYouOwe;
        this.totalYouGet = totalYouGet;
    }

    public Map<String, Balance> getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Map<String, Balance> userBalance) {
        this.userBalance = userBalance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGet() {
        return totalYouGet;
    }

    public void setTotalYouGet(double totalYouGet) {
        this.totalYouGet = totalYouGet;
    }
}
