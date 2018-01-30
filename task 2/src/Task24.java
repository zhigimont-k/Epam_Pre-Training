/**
 * Created by karina on 30-01-2018.
 */
public class Task24 {
    public static void run() {
        System.out.println("----------Task 2.4:");
        int day = 30;
        int month = 1;
        int year = 2018;
        System.out.println("Tomorrow's date is " + getTomorrowDate(day, month, year));
    }

    public static String getTomorrowDate(int day, int month, int year) {
        int d = day + 1;
        int m = month;
        int y = year;
        if (d == 32) {
            d = 1;
            if (m == 12) {
                m = 1;
                y++;
            } else {
                m++;
            }
        } else if (d == 31 && (m == 4 || m == 6 || m == 9 || m == 11)) {
            d = 1;
            m++;
        } else if (d > 28 && m == 2) {
            if ((((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && d > 29) ||
                    ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0))) {
                d = 1;
                m++;
            }
        }
        return "" + d + "-" + m + "-" + y;
    }
}
