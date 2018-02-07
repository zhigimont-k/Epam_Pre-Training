package by.epam.pretraining.task2.model;

public class Task24 {

    public static String printTomorrowDate1(int day, int month, int year) {
        day = validateDay(day);
        month = validateMonth(month);
        year = validateYear(year);
        return getTomorrowDay(day, month, year) + "-" + getTomorrowMonth(day, month, year) +
                "-" + getTomorrowYear(day, month, year);
    }

    private static int getTomorrowDay(int day, int month, int year) {
        day++;
        if (day > 31 || (day > 30 && isShortMonth(month)) ||
                (month == 2 && ((day > 28 && !isLeapYear(year)) || day > 29))) {
            day = 1;
        }
        return day;
    }

    private static int getTomorrowMonth(int day, int month, int year) {
        if (getTomorrowDay(day, month, year) == 1) {
            if (month == 12) {
                month = 1;
            } else {
                month++;
            }
        }
        return month;
    }

    private static int getTomorrowYear(int day, int month, int year) {
        if (getTomorrowDay(day, month, year) == 1 && getTomorrowMonth(day, month, year) == 1) {
            year++;
        }
        return year;
    }

    private static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    private static boolean isShortMonth(int month) {
        return (month == 4 || month == 6 || month == 9 || month == 1);
    }

    private static int validateDay(int day) {
        day = Math.abs(day);
        if (day < 1) {
            day = 1;
        } else if (day > 31) {
            day = 31;
        }
        return day;
    }

    private static int validateMonth(int month){
        month = Math.abs(month);
        if (month < 1){
            month = 1;
        } else if (month > 12){
            month = 12;
        }
        return month;
    }

    private static int validateYear(int year){
        year = Math.abs(year);
        if (year < 1){
            year = 1;
        }
        return year;
    }
}