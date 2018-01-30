import java.util.Scanner;

/**
 * Created by karina on 30-01-2018.
 */
public class Task25 {
    public static void run() {
        System.out.println("----------Task 2.5:");
        System.out.println("Enter a number from 1 to 999: ");
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        reader.close();
        System.out.println(getNumberAsString(input));
    }

    public static String getNumberAsString(int n) {
        String result = "";
        if (n >= 100) {
            int digit1 = n / 100;
            if (digit1 == 1) {
                result += "one ";
            }
            if (digit1 == 2) {
                result += "two ";
            }
            if (digit1 == 3) {
                result += "three ";
            }
            if (digit1 == 4) {
                result += "four ";
            }
            if (digit1 == 5) {
                result += "five ";
            }
            if (digit1 == 6) {
                result += "six ";
            }
            if (digit1 == 7) {
                result += "seven ";
            }
            if (digit1 == 8) {
                result += "eight ";
            }
            if (digit1 == 9) {
                result += "nine ";
            }
            result += "hundred ";
        }
        if (n % 100 >= 10) {
            int digit2 = n % 100 / 10;
            if (digit2 == 9) {
                result += "ninety ";
            }
            if (digit2 == 8) {
                result += "eighty ";
            }
            if (digit2 == 7) {
                result += "seventy ";
            }
            if (digit2 == 6) {
                result += "sixty ";
            }
            if (digit2 == 5) {
                result += "fifty ";
            }
            if (digit2 == 4) {
                result += "forty ";
            }
            if (digit2 == 3) {
                result += "thirty ";
            }
            if (digit2 == 2) {
                result += "twenty ";
            }
            if (digit2 == 1) {
                int lastDigits = n % 100;
                if (lastDigits == 19) {
                    result += "nineteen";
                }
                if (lastDigits == 18) {
                    result += "eighteen";
                }
                if (lastDigits == 17) {
                    result += "seventeen";
                }
                if (lastDigits == 16) {
                    result += "sixteen";
                }
                if (lastDigits == 15) {
                    result += "fifteen";
                }
                if (lastDigits == 14) {
                    result += "fourteen";
                }
                if (lastDigits == 13) {
                    result += "thirteen";
                }
                if (lastDigits == 12) {
                    result += "twelve";
                }
                if (lastDigits == 11) {
                    result += "eleven";
                }
                if (lastDigits == 10) {
                    result += "ten";
                }
                return result;
            }
        }
        if (n % 10 != 0) {
            int digit3 = n % 10;
            if (digit3 == 1) {
                result += "one";
            }
            if (digit3 == 2) {
                result += "two";
            }
            if (digit3 == 3) {
                result += "three";
            }
            if (digit3 == 4) {
                result += "four";
            }
            if (digit3 == 5) {
                result += "five";
            }
            if (digit3 == 6) {
                result += "six";
            }
            if (digit3 == 7) {
                result += "seven";
            }
            if (digit3 == 8) {
                result += "eight";
            }
            if (digit3 == 9) {
                result += "nine";
            }
        }
        return result;
    }
}
