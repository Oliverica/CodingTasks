package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();


        System.out.println("Reversed word: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
