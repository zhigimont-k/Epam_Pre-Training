/**
 * Created by karina on 27-01-2018.
 */
public class Task13 {
    public static void run() {
        int a = 5;
        int b = 1;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
