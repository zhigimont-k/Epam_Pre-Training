/**
 * Created by karina on 27-01-2018.
 */
public class Task16 {
    public static void run() {
        int N = 286751;
        System.out.println("Arithmetic mean: " + getMeanArithmetic(N));
        System.out.println("Geometric mean: " + getMeanGeometric(N));
    }

    public static double getMeanArithmetic(int n) {
        int digit1 = n / 100000;
        int digit2 = n / 10000 % 10;
        int digit3 = n / 1000 % 10;
        int digit4 = n / 100 % 10;
        int digit5 = n / 10 % 10;
        int digit6 = n % 10;
        int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        return sum / 6.0;
    }

    public static double getMeanGeometric(int n) {
        int digit1 = n / 100000;
        int digit2 = n / 10000 % 10;
        int digit3 = n / 1000 % 10;
        int digit4 = n / 100 % 10;
        int digit5 = n / 10 % 10;
        int digit6 = n % 10;
        double mult = digit1 * digit2 * digit3 * digit4 * digit5 * digit6;
        return Math.pow(mult, 1.0 / 6);
    }

}
