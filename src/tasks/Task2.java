package tasks;

public class Task2 {
    public static void main(String[] args) {

        // Create an array of integer values. After the array is created, calculate the
        // sum of all stored elements in that array.

        int[] numbers = {12, 78, 35, 42, 11};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements stored in the array is : " + sum);
    }
}
