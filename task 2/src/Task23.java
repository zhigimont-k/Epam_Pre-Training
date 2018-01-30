import java.util.Random;

/**
 * Created by karina on 30-01-2018.
 */
public class Task23 {
    public static void run() {
        System.out.println("----------Task 2.3:");
        Random rand = new Random();
        int mood = rand.nextInt(11) + 1;
        System.out.println(getMood(mood));
    }

    public static String getMood(int n) {
        switch (n) {
            case 1:
                return ":)";
            case 2:
                return ":D";
            case 3:
                return ">:D";
            case 4:
                return "(ノಠ益ಠ)ノ彡┻━┻";
            case 5:
                return ":O";
            case 6:
                return ":p";
            case 7:
                return ":3";
            case 8:
                return "<:D";
            case 9:
                return "В)";
            case 10:
                return ";D";
            default:
                return "";
        }
    }
}
