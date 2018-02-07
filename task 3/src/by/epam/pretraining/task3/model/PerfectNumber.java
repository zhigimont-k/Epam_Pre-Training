package by.epam.pretraining.task3.model;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        number = Math.abs(number);
        return number == getDivisorsSum(number);
    }

    private static int getDivisorsSum(int number) {
        int result = 1;
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                result += index;
            }
        }
        return result;
    }
}
