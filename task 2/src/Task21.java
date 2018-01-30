/**
 * Created by karina on 30-01-2018.
 */
public class Task21 {
    public static void run() {
        System.out.println("----------Task 2.1:");
        int N = 145;
        System.out.println("Number of heads: " + getHeadsNumber(N));
        System.out.println("Number of eyes: " + getEyesNumber(N));
    }

    public static int getHeadsNumber(int n) {
        if (n < 200) {
            return (n + 1) * 3;
        } else if (n >= 200 && n < 300) {
            return ((n + 1) % 100) * 2 + 200 * 3;
        } else {
            return ((n + 1) % 100) + 100 * 2 + 200 * 3;
        }
    }

    public static int getEyesNumber(int n) {
        return getHeadsNumber(n) * 2;
    }
}
