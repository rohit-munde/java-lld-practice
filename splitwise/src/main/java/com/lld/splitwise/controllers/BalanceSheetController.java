package com.lld.splitwise.controllers;

import com.lld.splitwise.models.Balance;
import com.lld.splitwise.models.Split;
import com.lld.splitwise.models.User;
import com.lld.splitwise.models.UserExpenseBalanceSheet;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {
        UserExpenseBalanceSheet paidByUserExpenseSheet =
                expensePaidBy.getUserExpenseBalanceSheet();

        paidByUserExpenseSheet.setTotalPayment(
                paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount
        );

        for (Split split : splits) {
            User userOwe = split.getUser();
            double oweAmount = split.getAmountOwned();

            UserExpenseBalanceSheet oweUserExpenseSheet =
                    userOwe.getUserExpenseBalanceSheet();

            if (expensePaidBy.getId().equals(userOwe.getId())) {
                paidByUserExpenseSheet.setTotalYourExpense(
                        paidByUserExpenseSheet.getTotalYourExpense() + oweAmount
                );
            } else {
                paidByUserExpenseSheet.setTotalYouGet(
                        paidByUserExpenseSheet.getTotalYouGet() + oweAmount
                );

                Balance userOweBalance =
                        paidByUserExpenseSheet.getUserBalance()
                                .getOrDefault(userOwe.getId().toString(), new Balance(0, 0));

                userOweBalance.setGetAmountOwed(
                        userOweBalance.getGetAmountOwed() + oweAmount
                );

                paidByUserExpenseSheet.getUserBalance()
                        .put(userOwe.getId().toString(), userOweBalance);

                oweUserExpenseSheet.setTotalYouOwe(
                        oweUserExpenseSheet.getTotalYouOwe() + oweAmount
                );

                oweUserExpenseSheet.setTotalYourExpense(
                        oweUserExpenseSheet.getTotalYourExpense() + oweAmount
                );

                Balance userPaidBalance =
                        oweUserExpenseSheet.getUserBalance()
                                .getOrDefault(expensePaidBy.getId().toString(), new Balance(0, 0));

                userPaidBalance.setAmountOwed(
                        userPaidBalance.getAmountOwed() + oweAmount
                );

                oweUserExpenseSheet.getUserBalance()
                        .put(expensePaidBy.getId().toString(), userPaidBalance);
            }
        }
    }

    public void showBalanceSheetOfUser(User user) {
        System.out.println("---------------------------------------");
        System.out.println("Balance sheet of user: " + user.getId());

        UserExpenseBalanceSheet balanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("TotalYourExpense: " + balanceSheet.getTotalYourExpense());
        System.out.println("TotalPayment: " + balanceSheet.getTotalPayment());
        System.out.println("TotalYouOwe: " + balanceSheet.getTotalYouOwe());
        System.out.println("TotalYouGet: " + balanceSheet.getTotalYouGet());

        for (Map.Entry<String, Balance> entry : balanceSheet.getUserBalance().entrySet()) {
            String userId = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println(
                    "userId: " + userId
                            + " YouGetBack: " + balance.getGetAmountOwed()
                            + " YouOwe: " + balance.getAmountOwed()
            );
        }

        System.out.println("---------------------------------------");
    }
}
