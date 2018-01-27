/**
 * Created by karina on 27-01-2018.
 */
public class Task16 {
    public static void main(String[] args) {
        int N = 286751;
        System.out.println("Arithmetic mean: " + getMeanArithmetic(N));
        System.out.println("Geometric mean: " + getMeanGeometric(N));
    }

    public static double getMeanArithmetic(int n) {
        int digits[] = getDigits(n);
        double sum = digits[0] + digits[1] + digits[2] + digits[3] + digits[4] + digits[5];
        return sum / digits.length;
    }

    public static double getMeanGeometric(int n) {
        int digits[] = getDigits(n);
        double mult = digits[0] * digits[1] * digits[2] * digits[3] * digits[4] * digits[5];
        return Math.pow(mult, 1.0 / digits.length);
    }

    public static int[] getDigits(int n) {
        int digits[] = new int[6];
        digits[0] = n / 100000;
        digits[1] = n / 10000 % 10;
        digits[2] = n / 1000 % 10;
        digits[3] = n / 100 % 10;
        digits[4] = n / 10 % 10;
        digits[5] = n % 10;
        return digits;
    }
}
