package by.epam.pretraining.task3.model;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        number = Math.abs(number);
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}
