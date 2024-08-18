package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c);  //print the vowel
            }
        }
        System.out.println();


    }
}
