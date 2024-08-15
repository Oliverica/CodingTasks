package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha): ");
        // Capture the coffee type input
        int coffeeType = scanner.nextInt();

        double price = 0;
        // Calculate price using switch statement
        // Case 1
        //    Set price to $3.00
        // Case 2
        //    Set price to $4.00
        // Case 3
        //    Set price to $4.50
        // Case 4
        //    Set price to $5.00
        // Default
        //    Print "Invalid coffee type entered"
        switch (coffeeType) {
            case 1:
                price = 3.00;
                break;

            case 2:
                price = 4.00;
                break;

            case 3:
                price = 4.50;
                break;

            case 4:
                price = 5.00;
                break;
            default:
                System.out.println("Invalid coffee type entered");
                scanner.close();
                return;
        }
        // Print the price
        System.out.println("The price of your coffee is " + price + '$');

        scanner.close();
    }
}
