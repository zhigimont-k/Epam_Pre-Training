package by.epam.pretraining.task2.model;

public class Task25 {

    public static StringBuilder getNumberAsString(int n) {
        StringBuilder result = new StringBuilder();
        if (!isValid(n)){
            result.append("Error");
        }
        if (n >= 100) {
            result.append(getHundredsString(n));
        }
        result.append(getDecsString(n));
        if (n % 100 < 10 || n % 100 > 19){
            result.append(getUnitsString(n));
        }
        return result;
    }

    private static boolean isValid(int number){
        return (number > 0 && number < 1000);
    }

    private static StringBuilder getHundredsString(int n) {
        int hundreds = n / 100;
        return getDigitString(hundreds).append(" hundred ");
    }

    private static StringBuilder getDecsString(int n) {
        int decsDigit = n % 100 / 10;
        StringBuilder result = new StringBuilder();
        if (decsDigit > 5 && decsDigit != 8) {
            result.append(getDigitString(decsDigit) + "ty ");
        }
        if (decsDigit == 8) {
            result.append("eighty ");
        }
        if (decsDigit == 5) {
            result.append("fifty ");
        }
        if (decsDigit == 4) {
            result.append("forty ");
        }
        if (decsDigit == 3) {
            result.append("thirty ");
        }
        if (decsDigit == 2) {
            result.append("twenty ");
        }
        if (decsDigit == 1) {
            int lastDigit = n % 10;
            if ((lastDigit > 5 && lastDigit != 8) || lastDigit == 4 ) {
                result.append(getDigitString(lastDigit) + "teen");
            } else if (lastDigit == 5) {
                result.append("fifteen");
            } else if (lastDigit == 8){
                result.append("eighteen");
            } else if (lastDigit == 3) {
                result.append("thirteen");
            } else if (lastDigit == 2) {
                result.append("twelve");
            } else if (lastDigit == 1) {
                result.append("eleven");
            } else {
                result.append("ten");
            }
        }
        return result;
    }

    private static StringBuilder getUnitsString(int n) {
        int lastDigit = n % 10;
        return getDigitString(lastDigit);
    }

    private static StringBuilder getDigitString(int digit) {
        StringBuilder result = new StringBuilder();
        if (digit == 1) {
            result.append("one");
        }
        if (digit == 2) {
            result.append("two");
        }
        if (digit == 3) {
            result.append("three");
        }
        if (digit == 4) {
            result.append("four");
        }
        if (digit == 5) {
            result.append("five");
        }
        if (digit == 6) {
            result.append("six");
        }
        if (digit == 7) {
            result.append("seven");
        }
        if (digit == 8) {
            result.append("eight");
        }
        if (digit == 9) {
            result.append("nine");
        }
        return result;
    }
}
