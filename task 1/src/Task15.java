/**
 * Created by karina on 27-01-2018.
 */
public class Task15 {
    public static void run() {
        int N = 75946;
        System.out.println("sum: " + getDigitSum(N));
        System.out.println("multiplication: " + getDigitMult(N));
    }

    public static int getDigitSum(int n) {
        int digit1 = n / 10000;
        int digit2 = n / 1000 % 10;
        int digit3 = n / 100 % 10;
        int digit4 = n / 10 % 10;
        int digit5 = n % 10;
        return digit1 + digit2 + digit3 + digit4 + digit5;
    }

    public static int getDigitMult(int n) {
        int digit1 = n / 10000;
        int digit2 = n / 1000 % 10;
        int digit3 = n / 100 % 10;
        int digit4 = n / 10 % 10;
        int digit5 = n % 10;
        return digit1 * digit2 * digit3 * digit4 * digit5;
    }
}
