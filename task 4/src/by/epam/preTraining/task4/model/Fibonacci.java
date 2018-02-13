package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class Fibonacci {
    private static int fiboRecursive(int number) {
        if (number > 2) {
            return fiboRecursive(number - 1) + fiboRecursive(number - 2);
        } else {
            return 1;
        }
    }

    private static int fibo(int number) {
        int result = 0;
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 2; i < number; i++) {
            result = fibo2 + fibo1;
            fibo1 = fibo2;
            fibo2 = result;
        }
        return result;
    }

    public static int getFibonacciRecursive(int number) {
        int result = (isValid(number)) ? fiboRecursive(number) : validate(number);
        return result;
    }

    public static int getFibonacci(int number) {
        int result = (isValid(number)) ? fibo(number) : validate(number);
        return result;
    }

    private static int validate(int n) {
        return (n <= 0) ? -1 : n - 1;
    }

    private static boolean isValid(int n) {
        return n > 2;
    }
}
