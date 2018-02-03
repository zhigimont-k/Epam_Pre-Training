package by.epam.pretraining.task3.model;

/**
 * Created by karina on 03-02-2018.
 */
public class Task32 {
    public static int getBiggestDigit(int number) {
        number = Math.abs(number);
        int result = 0;
        while (number > 0) {
            if (result < number % 10) {
                result = number % 10;
            }
            number /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        while (number > 0) {
            if (number % 10 != getFirstDigit(number)) {
                return false;
            }
            number %= 10;
            number /= 10;
        }
        return true;

    }

    public static int getFirstDigit(int number) {
        while (number > 10) {
            number /= 10;
        }
        return number;
    }

    public static boolean isPrimeNumber(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getNumberPrimeDivisors(int number) {
        String result = "";
        for (int index = 2; index <= number; index++) {
            if (number % index == 0 && isPrimeNumber(index)) {
                result += index + " ";
            }
        }
        return result;
    }

    public static int getLCM(int a, int b) {
        int max = a * b;
        for (int index = 2; index <= max; index++) {
            if (index % a == 0 && index % b == 0) {
                return index;
            }
        }
        return max;
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int getDifferentDigitsNumber(int number) {
        int result = 0;
        while (number > 0) {
            boolean repeats = false;
            int lastDigit = number % 10;
            number /= 10;
            int temp = number;
            while (temp > 0) {
                if (lastDigit == temp % 10) {
                    repeats = true;
                    break;
                }
                temp /= 10;
            }
            if (!repeats) {
                result++;
            }
        }
        return result;
    }
}
