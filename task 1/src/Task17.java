/**
 * Created by karina on 27-01-2018.
 */
public class Task17 {
    public static void main(String[] args) {
        int N = 1958675;
        System.out.println(reverse(N));
    }

    public static String reverse(int n) {
        int digits[] = getDigits(n);

        int temp = digits[0];
        digits[0] = digits[6];
        digits[6] = temp;

        temp = digits[1];
        digits[1] = digits[5];
        digits[5] = temp;

        temp = digits[2];
        digits[2] = digits[4];
        digits[4] = temp;

        return "" + digits[0] + digits[1] + digits[2] + digits[3] + digits[4] + digits[5] + digits[6];
    }

    public static int[] getDigits(int n) {
        int digits[] = new int[7];
        digits[0] = n / 1000000;
        digits[1] = n / 100000 % 10;
        digits[2] = n / 10000 % 10;
        digits[3] = n / 1000 % 10;
        digits[4] = n / 100 % 10;
        digits[5] = n / 10 % 10;
        digits[6] = n % 10;
        return digits;
    }
}
