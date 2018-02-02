/**
 * Created by karina on 27-01-2018.
 */
public class Task12 {
    public static void run() {
        double R1 = 10;
        double R2 = 3;
        System.out.println(getRingArea(R1, R2));
    }

    public static double getRingArea(double r1, double r2) {
        return getCircleArea(r1) - getCircleArea(r2);
    }

    public static double getCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

}
