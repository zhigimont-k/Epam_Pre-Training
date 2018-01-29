/**
 * Created by karina on 27-01-2018.
 */
public class Task11 {
    public static void run() {
        double mass = 150000000;
        System.out.println("Mass in kg: " + toKilograms(mass));
        System.out.println("Mass in t: " + toTons(mass));
    }

    public static double toKilograms(double mass) {
        return mass / 1000.0;
    }

    public static double toTons(double mass) {
        return mass / 1000000.0;
    }
}
