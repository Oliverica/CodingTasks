package tasks;

public class Task8 {
    public static void main(String[] args) {

        //Maximum and minimum number in the array

        int[] numbers = {45, 1, 52, 47, 12, 27, 9, 11};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        //Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
