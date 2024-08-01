package tasks;

public class Task7 {
    public static void main(String[] args) {

        // Write a Java Program to print the first 10 numbers of Fibonacci series

        //Initialize the first two Fibonacci numbers
        int n1 = 0;
        int n2 = 1;
        int count = 10;
        //Print the first two Fibonacci numbers
        System.out.print(n1 + " " + n2);

        //Loop to generate and print the next Fibonacci numbers
        for (int i = 2; i < count; ++i) {
           int n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
