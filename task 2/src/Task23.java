import java.util.Random;

/**
 * Created by karina on 30-01-2018.
 */
public class Task23 {
    public static void run() {
        System.out.println("----------Task 2.3:");
        System.out.println(getMood());
    }

    public static int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static String getMood() {
        switch (getRandomNumber(10)) {
            case 0:
                return ":)";
            case 1:
                return ":D";
            case 2:
                return ">:D";
            case 3:
                return "(ノಠ益ಠ)ノ彡┻━┻";
            case 4:
                return ":O";
            case 5:
                return ":p";
            case 6:
                return ":3";
            case 7:
                return "<:D";
            case 8:
                return "В)";
            case 9:
                return ";D";
            default:
                return "Error, could't detect mood";
        }
    }
}
