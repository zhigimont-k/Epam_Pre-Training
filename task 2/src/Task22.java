import java.util.Scanner;

/**
 * Created by karina on 30-01-2018.
 */
public class Task22 {
    public static void run() {
        System.out.println("----------Task 2.2:");
        char input1 = 's';
        System.out.println("Letter " + input1 + " is a " + getLetterType1(input1));
        char input2 = 'w';
        System.out.println("Letter " + input2 + " is a " + getLetterType2(input2));
        char input3 = 'a';
        System.out.println("Letter " + input3 + " is a " + getLetterType3(input3));
        char input4 = 'd';
        System.out.println("Letter " + input4 + " is a " + getLetterType4(input4));
        char input5 = 'f';
        System.out.println("Letter " + input5 + " is a " + getLetterType5(input5));
    }

    public static String getLetterType1(char c) {
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return "vowel";
            default:
                return "consonant";
        }
    }

    public static String getLetterType2(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType3(char c) {
        int a = 'a';
        int A = 'A';
        int e = 'e';
        int E = 'E';
        int i = 'i';
        int I = 'I';
        int o = 'o';
        int O = 'O';
        int u = 'u';
        int U = 'U';
        if (c == a || c == A || c == e || c == E || c == i || c == I || c == o || c == O || c == u || c == U) {
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType4(char c) {
        String s = "" + c;
        s = s.toLowerCase();
        if ("a".equals(s) || "e".equals(s) || "i".equals(s) || "o".equals(s) || "u".equals(s)) {
            return "vowel";
        } else {
            return "consonant";
        }
    }

    public static String getLetterType5(char c) {
        String s = "" + c;
        switch (s.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return "vowel";
            default:
                return "consonant";
        }
    }
}
