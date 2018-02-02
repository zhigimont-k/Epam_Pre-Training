/**
 * Created by karina on 27-01-2018.
 */
public class Task11 {
    public static double GRAM_PER_KILOGRAM = 1000.0;
    public static double GRAM_PER_TON = 1_000_000.0;

    public static void run() {
        double mass = 17_654_000;
        System.out.println("Mass in kg: " + convertToKilogram(mass));
        System.out.println("Mass in t: " + convertToTon(mass));
    }

    public static double convertToKilogram(double mass) {
        return mass / GRAM_PER_KILOGRAM;
    }

    public static double convertToTon(double mass) {
        return mass / GRAM_PER_TON;
    }
}
