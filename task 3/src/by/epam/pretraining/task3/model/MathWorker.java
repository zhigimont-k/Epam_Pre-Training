package by.epam.pretraining.task3.model;

public class MathWorker {
    public static int calculateBiggestDigit(int number) {
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

    public static boolean checkPalindrome(int number) {
        number = Math.abs(number);
        int reversed = 0;
        int temp = number;
        while (temp > 0) {
            reversed *= 10;
            reversed += temp % 10;
            temp /= 10;
        }
        return number == reversed;
    }


    public static boolean checkPrime(int number) {
        number = Math.abs(number);
        int bound = number / 2;
        for (int index = 2; index <= bound; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder calculatePrimeDivisors(int number) {
        number = Math.abs(number);
        StringBuilder result = new StringBuilder();
        int bound = number / 2;
        for (int index = 2; index <= bound; index++) {
            if (number % index == 0 && checkPrime(index)) {
                result.append(index + " ");
            }
        }
        return result;
    }

    public static int calculateLCM(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int max = a * b;
        for (int index = 2; index <= max; index++) {
            if (index % a == 0 && index % b == 0) {
                return index;
            }
        }
        return max;
    }

    public static int calculateGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int calculateDifferentDigitsNumber(int number) {
        number = Math.abs(number);
        int result = 0;
        int lastDigit;
        int temp;
        boolean repeats;
        while (number > 0) {
            repeats = false;
            lastDigit = number % 10;
            number /= 10;
            temp = number;
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
