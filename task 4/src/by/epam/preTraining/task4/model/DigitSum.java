package by.epam.preTraining.task4.model;

public class DigitSum {

    public static int calculateDigitSumRecursive(int number) {
        if (number > 0) {
            return calculateDigitSumRecursive(number / 10) + (number % 10);
        } else {
            return 0;
        }
    }

    public static int calculateDigitSum(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
