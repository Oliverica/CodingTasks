package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter a value for x
        System.out.print("In:\t");
        int x = scanner.nextInt();


        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        // Inside the loop, print the value of i followed by a space
        for (int i = x - 1; i >= 0; i--)
            System.out.print(i + " ");

        scanner.close();
    }
}
