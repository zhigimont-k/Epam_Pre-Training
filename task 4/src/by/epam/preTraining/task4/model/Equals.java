package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class Equals {
    public static boolean equalsRecursive(int N, int S) {
        return S == DigitSum.calculateDigitSumRecursive(N);
    }

    public static boolean equals(int N, int S) {
        return S == DigitSum.calculateDigitSum(N);
    }
}
