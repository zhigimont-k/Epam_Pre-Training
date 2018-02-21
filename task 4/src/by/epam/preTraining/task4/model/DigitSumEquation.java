package by.epam.preTraining.task4.model;

public class DigitSumEquation {
    public static boolean equalsRecursive(int N, int S) {
        if (N > 0 || S > 0) {
            return equalsRecursive(N / 10, S - N % 10);
        }
        return N == S;
    }

    public static boolean equals(int N, int S) {
        return S == DigitSum.calculateDigitSum(N);
    }
}
