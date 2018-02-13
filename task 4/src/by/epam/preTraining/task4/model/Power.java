package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class Power {

    public static double powRecursive(double x, int n) {
        if (n > 0) {
            return x * powRecursive(x, n - 1);
        } else {
            return 1;
        }
    }

    public static double pow(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
