/**
 * Created by karina on 27-01-2018.
 */
public class Task17 {
    public static void run() {
        int N = 1958675;
        System.out.println(reverse(N));
    }

    public static int reverse(int n) {
        int digit1 = n / 1_000_000;
        int digit2 = n / 100_000 % 10;
        int digit3 = n / 10000 % 10;
        int digit4 = n / 1000 % 10;
        int digit5 = n / 100 % 10;
        int digit6 = n / 10 % 10;
        int digit7 = n % 10;

        return digit7 * 1_000_000 + digit6 * 100_000 + digit5 * 10000 +
                digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;
    }
}
