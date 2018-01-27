/**
 * Created by karina on 27-01-2018.
 */
public class Task15 {
    public static void main(String[] args) {
        int N = 75946;
        System.out.println("sum: " + getDigitSum(N));
        System.out.println("multiplication: " + getDigitMult(N));
    }

    public static int getDigitSum(int n) {
        int digits[] = getDigits(n);
        return digits[0] + digits[1] + digits[2] + digits[3] + digits[4];
    }

    public static int getDigitMult(int n) {
        int digits[] = getDigits(n);
        return digits[0] * digits[1] * digits[2] * digits[3] * digits[4];
    }

    public static int[] getDigits(int n) {
        int digits[] = new int[5];
        digits[0] = n / 10000;
        digits[1] = n / 1000 % 10;
        digits[2] = n / 100 % 10;
        digits[3] = n / 10 % 10;
        digits[4] = n % 10;
        return digits;
    }
}
