package by.epam.pretraining.task2.model;

public class Task25 {

    public static String getNumberAsString(int n) {
        String result = "";
        if (!isValid(n)){
            result = "Error";
        }
        if (n >= 100) {
            result += getHundredsString(n);
        }
        result += getDecsString(n);
        if (n % 100 < 10 || n % 100 > 19){
            result += getUnitsString(n);}
        return result;
    }

    private static boolean isValid(int number){
        return (number > 0 && number < 1000);
    }

    private static String getHundredsString(int n) {
        int hundreds = n / 100;
        return getDigitString(hundreds) + " hundred ";
    }

    private static String getDecsString(int n) {
        int decsDigit = n % 100 / 10;
        String result = "";
        if (decsDigit > 5 && decsDigit != 8) {
            result = getDigitString(decsDigit) + "ty ";
        }
        if (decsDigit == 8) {
            result = "eighty ";
        }
        if (decsDigit == 5) {
            result = "fifty ";
        }
        if (decsDigit == 4) {
            result = "forty ";
        }
        if (decsDigit == 3) {
            result = "thirty ";
        }
        if (decsDigit == 2) {
            result = "twenty ";
        }
        if (decsDigit == 1) {
            int lastDigit = n % 10;
            if ((lastDigit > 5 && lastDigit != 8) || lastDigit == 4 ) {
                result = getDigitString(lastDigit) + "teen";
            } else if (lastDigit == 5) {
                result = "fifteen";
            } else if (lastDigit == 8){
                result += "eighteen";
            } else if (lastDigit == 3) {
                result = "thirteen";
            } else if (lastDigit == 2) {
                result = "twelve";
            } else if (lastDigit == 1) {
                result = "eleven";
            } else {
                result = "ten";
            }
        }
        return result;
    }

    private static String getUnitsString(int n) {
        int lastDigit = n % 10;
        return getDigitString(lastDigit);
    }

    private static String getDigitString(int digit) {
        String result = "";
        if (digit == 1) {
            result = "one";
        }
        if (digit == 2) {
            result = "two";
        }
        if (digit == 3) {
            result = "three";
        }
        if (digit == 4) {
            result = "four";
        }
        if (digit == 5) {
            result = "five";
        }
        if (digit == 6) {
            result = "six";
        }
        if (digit == 7) {
            result = "seven";
        }
        if (digit == 8) {
            result = "eight";
        }
        if (digit == 9) {
            result = "nine";
        }
        return result;
    }
}
