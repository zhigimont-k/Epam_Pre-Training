package by.epam.pretraining.task2.model;

import java.util.regex.Pattern;

public class Task22 {
    public static final String VOWELS = "aeiouy";
    public static final String VOWELS_REGEXP = "[aeiouy]";

    public static String getLetterType1(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return "vowel";
            default:
                return "consonant";
        }
    }

    public static String getLetterType2(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType3(char c) {
        if (VOWELS.contains(""+Character.toLowerCase(c))){
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType4(char c) {
        c = Character.toLowerCase(c);
        if (VOWELS.indexOf(c) != -1) {
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType5(char c) {
        c = Character.toLowerCase(c);
        if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117 || c == 121){
            return "vowel";
        }
        return "consonant";
    }

    public static String getLetterType6(char c){
        if (Pattern.matches(VOWELS_REGEXP, ""+Character.toLowerCase(c))){
            return "vowel";
        }
        return "consonant";
    }
}
