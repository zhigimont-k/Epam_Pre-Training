/**
 * Created by karina on 30-01-2018.
 */
public class Task24 {
    public static final int FEBRUARY = 2;
    public static final int APRIL = 4;
    public static final int JUNE = 6;
    public static final int SEPTEMBER = 9;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static void run() {

        System.out.println("----------Task 2.4:");
        int day = 30;
        int month = 1;
        int year = 2018;
        System.out.println("1. Tomorrow's date is " + printTomorrowDate1(day, month, year));
        System.out.println("2. Tomorrow's date is " + printTomorrowDate2(day, month, year));
    }

    //вариант 1
    public static String printTomorrowDate1(int day, int month, int year) {
        return getTomorrowDay(day, month, year) + "-" + getTomorrowMonth(day, month, year) +
                "-" + getTomorrowYear(day, month, year);
    }

    public static int getTomorrowDay(int day, int month, int year) {
        day++;
        if (day == 32 || (day == 31 && isShortMonth(month)) ||
                (month == FEBRUARY && ((day == 29 && !isLeapYear(year)) || day == 30))) {
            return 1;
        }
        return day;
    }

    public static int getTomorrowMonth(int day, int month, int year) {
        if (getTomorrowDay(day, month, year) == 1) {
            if (month == DECEMBER) {
                return 1;
            }
            return month + 1;
        }
        return month;
    }

    public static int getTomorrowYear(int day, int month, int year) {
        if (getTomorrowDay(day, month, year) == 1 && getTomorrowMonth(day, month, year) == 1) {
            return year + 1;
        }
        return year;
    }

    // вариант 2
    public static String printTomorrowDate2(int day, int month, int year) {
        day++;
        if (day == 32 || (day == 31 && isShortMonth(month)) ||
                (month == FEBRUARY && ((day == 29 && !isLeapYear(year)) || day == 30))) {
            day = 1;
            if (month == DECEMBER) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
        return day + "-" + month + "-" + year;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isShortMonth(int month) {
        if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
            return true;
        }
        return false;
    }
}
