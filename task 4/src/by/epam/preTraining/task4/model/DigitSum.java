package by.epam.preTraining.task4.model;

/**
 * Created by karina on 13-02-2018.
 */
public class DigitSum {

    public static int getDigitSumRecursive(int number) {
        if (number >= 10) {
            return getDigitSumRecursive(number % 10) + getDigitSumRecursive(number / 10);
        } else {
            return number % 10;
        }
    }

    public static int getDigitSum(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
