package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));

            if (i < word.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
