package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);
        //Create an array to hold 5 names
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the name " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }
        //print the first three characters of each name
        System.out.println("First three characters of each name: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 3) {
                System.out.println(arr[i].substring(0, 3));
            } else {
                System.out.println(arr[i]);  //if it's shorter than 3 char
            }
        }


    }
}


