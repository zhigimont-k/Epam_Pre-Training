package by.epam.preTraining.task4.model;

public class DigitSumEquation {
    public static boolean equalsRecursive(int N, int S) {
        return S == DigitSum.calculateDigitSumRecursive(N);
    }

    public static boolean equals(int N, int S) {
        return S == DigitSum.calculateDigitSum(N);
    }
}
