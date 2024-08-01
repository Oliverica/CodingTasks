package tasks;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.


            int[] temperature = new int[7];
            int i;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            Scanner scanner = new Scanner(System.in);

            for (i = 0; i < 7; i++) {
                System.out.println("Enter temperature for day " + (i + 1) + ": ");
                temperature[i] = scanner.nextInt();
            }
            for (i = 0; i < 7; i++) {
                if (temperature[i] > max) {
                    max = temperature[i];
                }
                if (temperature[i] < min) {
                    min = temperature[i];
                }
            }
            System.out.println("The highest temperature for the week is: " + max);
            System.out.println("The lowest temperature for the week is: " + min);

        }
    }









