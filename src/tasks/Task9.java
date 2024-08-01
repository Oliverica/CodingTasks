package tasks;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array

        int[] numbers = {52, 45, 8, 6, 12, 16, 32, 45};

        Arrays.sort(numbers);

        System.out.println("The second largest number is " + numbers[numbers.length-2]);


    }
}
