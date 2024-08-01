package tasks;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array or integer type where you will store odd and even
        // numbers. Develop a program which will identify/print the even numbers
        // only.

        int numbers[][] = {{14, 12, 7, 19, 28}, {45, 23, 4, 2, 62}};

        for (int[] number : numbers) {
            for (int j = 0; j < number.length; j++) {
                if (number[j] % 2 == 0) {

                    System.out.println(number[j]);
                }
            }

        }
    }
    }