package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to input the month number
        System.out.println("Please enter the month number: ");

        // Capture the month number
        int monthNumber = scanner.nextInt();

        // Check the value of monthNumber and identify the month
        // If the value is between 1 and 12, print the corresponding month name
        // If the value is out of range, print "Invalid"
        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = "";
            switch (monthNumber) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "Februry";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
            }
            System.out.println("The month is " + monthName + ".");
        } else {
            System.out.println("Invalid.");
        }

        //Close the scanner
        scanner.close();


    }
}
