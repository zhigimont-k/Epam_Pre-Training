/**
 * Created by karina on 27-01-2018.
 */
public class Task12 {
    public static void main(String[] args) {
        double R1 = 10;
        double R2 = 3;
        System.out.println(getRingArea(R1, R2));
    }

    public static double getRingArea(double r1, double r2) {
        return Math.PI * (Math.pow(r1, 2) - Math.pow(r2, 2));
    }

}
