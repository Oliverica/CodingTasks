package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the time of day
        System.out.println("Enter time of the day (morning,afternoon,evening,night): ");
        // Capture the time of day input
        String timeOfDay = scanner.nextLine();

        // Recommend meal using switch statement
        // Case "morning"
        //    Print "Recommended meal: Breakfast"
        // Case "afternoon"
        //    Print "Recommended meal: Lunch"
        // Case "evening"
        //    Print "Recommended meal: Dinner"
        // Case "night"
        //    Print "Recommended meal: Snack"
        // Default
        //    Print "Invalid time of day entered"
        String meal;
        switch (timeOfDay) {
            case "morning":
                meal = "Recommended meal: Breakfast";
                break;
            case "afternoon":
                meal = "Recommended meal: Lunch";
                break;
            case "evening":
                meal = "Recommended meal: Dinner";
                break;
            case "night":
                meal = "Recommended meal: Snack";
                break;
            default:
                meal="Invalid time of the day entered";
                break;
        }
        //Print the recommended meal
        System.out.println(meal);

        //Close the scanner
        scanner.close();
    }
}
