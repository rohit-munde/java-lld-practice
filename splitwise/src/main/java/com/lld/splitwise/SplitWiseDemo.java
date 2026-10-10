package com.lld.splitwise;

import com.lld.splitwise.controllers.ExpenseController;
import com.lld.splitwise.controllers.GroupController;
import com.lld.splitwise.controllers.UserController;
import com.lld.splitwise.enums.SplitType;
import com.lld.splitwise.models.Expense;
import com.lld.splitwise.models.Group;
import com.lld.splitwise.models.Split;
import com.lld.splitwise.models.User;

import java.util.ArrayList;
import java.util.List;

public class SplitWiseDemo {

    private final UserController userController;
    private final GroupController groupController;
    private final ExpenseController expenseController;

    public SplitWiseDemo() {
        this.userController = new UserController();
        this.groupController = new GroupController();
        this.expenseController = new ExpenseController();
    }

    void demo() {
        setupUsersAndGroups();

        List<Split> splits = setUpSplits();
        Expense expense = expenseController.createExpense(
                        1,
                        "Breakfast",
                        900,
                splits,
                SplitType.EQUAL,
                userController.getUserById(1)
                );
        Group group = groupController.getGroupById(1);
        group.addExpense(expense);
        System.out.println("Expense added to group successfully");
        System.out.println("Total expenses in group: " + group.getExpenses().size());
    }

    private List<Split> setUpSplits() {
        List<Split> splits = new ArrayList<>();

        Split split1 = new Split(userController.getUserById(1), 100.0);
        Split split2 = new Split(userController.getUserById(2), 200.0);
        Split split3 = new Split(userController.getUserById(3), 300.0);
        Split split4 = new Split(userController.getUserById(4), 400.0);
        Split split5 = new Split(userController.getUserById(5), 500.0);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        splits.add(split4);
        splits.add(split5);
        return splits;
    }

    private void setupUsersAndGroups() {
        addUsersToApp();

        groupController.createGroup(1, "Group 1", userController.getUserById(1));
        Group group = groupController.getGroupById(1);
        group.addMember(userController.getUserById(2));
        group.addMember(userController.getUserById(3));
        group.addMember(userController.getUserById(4));
    }

    private void addUsersToApp(){
        User user1 = new User(1, "User 1", null);
        User user2 = new User(2, "User 2", null);
        User user3 = new User(3, "User 3", null);
        User user4 = new User(4, "User 4", null);
        User user5 = new User(5, "User 5", null);

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
        userController.addUser(user4);
        userController.addUser(user5);
    }
}
