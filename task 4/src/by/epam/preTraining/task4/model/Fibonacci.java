package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class Fibonacci {
    private static int fiboRecursive(int number) {
        if (number > 3) {
            return fiboRecursive(number - 1) + fiboRecursive(number - 2);
        } else {
            return 1;
        }
    }

    private static int fibo(int number) {
        int result = 1;
        int fibo1 = 0;
        int fibo2 = 1;
        for (int i = 2; i < number; i++) {
            result = fibo2 + fibo1;
            fibo1 = fibo2;
            fibo2 = result;
        }
        return result;
    }

    public static int getFibonacciRecursive(int number) {
        return (number > 1) ? fiboRecursive(number) : validate(number);
    }

    public static int getFibonacci(int number) {
        return (number > 1) ? fibo(number) : validate(number);
    }

    private static int validate(int n) {
        return (n <= 0) ? -1 : (n - 1);

    }

}
