/**
 * Created by karina on 30-01-2018.
 */
public class Task25 {
    public static void run() {
        System.out.println("----------Task 2.5:");
        int number = 742;
        System.out.println("Number: " + number);
        System.out.println("As string: " + getNumberAsString(number));
    }

    public static String getNumberAsString(int n) {
        String result = "";
        if (n >= 100) {
            result += getHundredsString(n);
        }
        result += getDecsString(n);
        result += getUnitsString(n);
        return result;
    }

    public static String getHundredsString(int n) {
        int hundreds = n / 100;
        return getDigitString(hundreds) + " hundred ";
    }

    public static String getDecsString(int n) {
        int decsDigit = n % 100 / 10;
        if (decsDigit > 5) {
            return getDigitString(decsDigit) + "ty ";
        }
        if (decsDigit == 5) {
            return "fifty ";
        }
        if (decsDigit == 4) {
            return "forty ";
        }
        if (decsDigit == 3) {
            return "thirty ";
        }
        if (decsDigit == 2) {
            return "twenty ";
        }
        if (decsDigit == 1) {
            int lastDigit = n % 10;
            if (lastDigit > 5 || lastDigit == 4) {
                return getDigitString(lastDigit) + "teen";
            }
            if (lastDigit == 5) {
                return "fifteen";
            }
            if (lastDigit == 3) {
                return "thirteen";
            }
            if (lastDigit == 2) {
                return "twelve";
            }
            if (lastDigit == 1) {
                return "eleven";
            }
            return "ten";
        }
        return "";
    }

    public static String getUnitsString(int n) {
        int lastDigit = n % 10;
        return getDigitString(lastDigit);
    }

    public static String getDigitString(int digit) {
        if (digit == 1) {
            return "one";
        }
        if (digit == 2) {
            return "two";
        }
        if (digit == 3) {
            return "three";
        }
        if (digit == 4) {
            return "four";
        }
        if (digit == 5) {
            return "five";
        }
        if (digit == 6) {
            return "six";
        }
        if (digit == 7) {
            return "seven";
        }
        if (digit == 8) {
            return "eight";
        }
        if (digit == 9) {
            return "nine";
        }
        return "";
    }
}
