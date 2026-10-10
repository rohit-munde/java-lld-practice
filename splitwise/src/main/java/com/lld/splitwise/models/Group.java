package com.lld.splitwise.models;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Integer id;
    private String name;
    private List<User> users;
    private List<Expense> expenses;

    public Group() {
        this.users = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public Group(Integer id, String name, List<User> users, List<Expense> expenses) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.expenses = expenses;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addMember(User user) {
        this.users.add(user);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }
}
