package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to answer if it is the weekend
        // Capture the weekend input
        System.out.println("Is it weekend? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

        // Determine the subject based on the input
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"
        String subject;

        if (isWeekend) {
            subject = "java";
        } else {
            subject = "manuel testing";
        }

        // Print the subject suggestion
        System.out.println("Today you will be learning " + subject+ ".");

        scanner.close();
    }
}
