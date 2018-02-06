package by.epam.pretraining.task2.model;

import java.util.Random;

public class Task23 {
    public static final String FACE_HAPPY = ":)";
    public static final String FACE_NEUTRAL = ":|";
    public static final String FACE_SAD = ":(";
    public static final int MOODS_AVAILABLE = 3;

    public static String getMood() {
        String result;
        switch (new Random().nextInt(MOODS_AVAILABLE)) {
            case 0:
                result = FACE_HAPPY;
                break;
            case 1:
                result = FACE_NEUTRAL;
                break;
            case 2:
                result = FACE_SAD;
                break;
            default:
                result = "Error, could't detect mood";
                break;
        }
        return result;
    }
}
