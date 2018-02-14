package by.epam.preTraining.task4.model;

public class Fibonacci {
    public static int calculateFibonacciRecursive(int number) {
        int result;
        if (number > 2) {
            result = calculateFibonacciRecursive(number - 1) + calculateFibonacciRecursive(number - 2);
        } else if (number == 2) {
            result = 1;
        } else if (number == 1) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }

    public static int calculateFibonacci(int number) {
        int result = 1;
        if (number > 1) {
            int fibo1 = 0;
            int fibo2 = 1;
            for (int i = 2; i < number; i++) {
                result = fibo2 + fibo1;
                fibo1 = fibo2;
                fibo2 = result;
            }
        } else if (number == 1) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }

}
