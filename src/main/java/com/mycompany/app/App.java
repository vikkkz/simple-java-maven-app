package com.mycompany.app;

/**
 * Hello world!
 */
public class FactorialCalculator {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

// public class App {

//     private static final String MESSAGE = "Hello World!";

//     public App() {}

//     public static void main(String[] args) {
//         System.out.println(MESSAGE);
//     }

//     public String getMessage() {
//         return MESSAGE;
//     }
// }
