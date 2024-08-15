package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense = 10.0;
        double afternoonExpense = 15.0;
        double eveningExpense = 20.0;


        // Calculate total expense
        double totalExpense = morningExpense + afternoonExpense + eveningExpense;


        // Define a budget
        double budget = 100;


        // Check if within budget
        boolean isWithinBudget = totalExpense <= budget;

        System.out.println("Your total daily expense is: " + totalExpense);

        if (isWithinBudget) {
            System.out.println("You are within the budget. ");
        } else {
            System.out.println("You are over the budget.");
        }


    }
}
