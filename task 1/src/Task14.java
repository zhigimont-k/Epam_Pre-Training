/**
 * Created by karina on 27-01-2018.
 */
public class Task14 {
    public static void run() {
        int N = 4689;
        System.out.println(check(N));
    }

    public static boolean check(int number) {
        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;
        boolean bool1 = (digit4 > digit3);
        boolean bool2 = (digit3 > digit2);
        boolean bool3 = (digit2 > digit1);
        boolean monotone = (bool1 == bool2) && (bool2 == bool3);
        boolean notEqual = (digit1 != digit2) && (digit2 != digit3) && (digit3 != digit4);
        return monotone && notEqual;
    }
}
