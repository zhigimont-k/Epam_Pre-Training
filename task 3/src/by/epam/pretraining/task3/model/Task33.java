package by.epam.pretraining.task3.model;

/**
 * Created by karina on 03-02-2018.
 */
public class Task33 {

    public static boolean isPerfectNumber(int number) {
        return number == getDivisorsSum(number);
    }

    public static int getDivisorsSum(int number) {
        int result = 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                result += index;
            }
        }
        return result;
    }
}
