package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string: ");


        // Read the input string
        // Remove all spaces and convert the string to lowercase
        String word = scanner.nextLine().replaceAll("\\s","").toLowerCase();

        // Check if the string is a palindrome
        String isPalindrome = new StringBuilder(word).reverse().toString();

        // Print "true" if the string is a palindrome, and "false" otherwise
        if (word.equals(isPalindrome)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
