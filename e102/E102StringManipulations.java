package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println();

    }
}
