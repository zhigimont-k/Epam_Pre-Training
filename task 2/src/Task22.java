/**
 * Created by karina on 30-01-2018.
 */
public class Task22 {
    public static final char unicodeA = '\u0061';
    public static final char unicodeE = '\u0065';
    public static final char unicodeI = '\u0069';
    public static final char unicodeO = '\u006f';
    public static final char unicodeU = '\u0075';

    public static final int intA = 97;
    public static final int intE = 101;
    public static final int intI = 105;
    public static final int intO = 111;
    public static final int intU = 117;

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
        char input5 = 'o';
        System.out.println("Letter " + input5 + " is a " + getLetterType5(input5));
    }

    public static String getLetterType1(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "vowel";
            default:
                return "consonant";
        }
    }

    public static String getLetterType2(char c) {
        if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType3(char c) {
        if (c == unicodeA || c == unicodeE || c == unicodeI || c == unicodeO || c == unicodeU){
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType4(char c) {
        String s = "" + c;
        if ("a".equals(s) || "e".equals(s) || "i".equals(s) || "o".equals(s) || "u".equals(s)) {
            return "vowel";
        } else {
            return "consonant";
        }
    }

    public static String getLetterType5(char c) {
        if (c == intA || c == intE || c == intI || c == intO || c == intU){
            return "vowel";
        }
        return "consonant";
    }
}
