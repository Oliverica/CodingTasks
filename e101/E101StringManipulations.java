package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plese enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
    }
}
