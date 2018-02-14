package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class Fibonacci {
    public static int calculateFibonacciRecursive(int number) {
        if (number > 2){
            return calculateFibonacciRecursive(number - 1) + calculateFibonacciRecursive(number - 2);
        } else if (number == 2){
            return 1;
        } else if (number == 1){
            return 0;
        } else {
            return -1;
        }
    }

    public static int calculateFibonacci(int number) {
        int result = 1;
        if (number <= 0){
            result = -1;
        } else if (number == 1){
            result = 0;
        } else {
            int fibo1 = 0;
            int fibo2 = 1;
            for (int i = 2; i < number; i++) {
                result = fibo2 + fibo1;
                fibo1 = fibo2;
                fibo2 = result;
            }
        }
        return result;
    }

}
