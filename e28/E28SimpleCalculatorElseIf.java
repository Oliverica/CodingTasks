package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        char operator = '*';


        // Declare two variables for numbers and assign values
        int num1 = 15;
        int num2 = 36;
        int result;


        // Perform the corresponding arithmetic operation
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Invalid operator.");
        }

    }
}
