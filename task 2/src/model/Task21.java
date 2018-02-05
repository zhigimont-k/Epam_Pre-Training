package model;

public class Task21 {
    public static int CHILDHOOD_YEARS = 200;
    public static int MIDDLE_YEARS = 300;
    public static int HEADS_PER_YEAR_CHILDHOOD = 3;
    public static int HEADS_PER_YEAR_PRE_MIDDLE_YEARS = 2;
    public static int HEADS_PER_YEAR_MIDDLE_YEARS = 1;
    public static int EYES_PER_HEAD = 2;
    public static int HEADS_AT_BIRTH = 3;

    public static int getHeadsNumber(int age) {
        int heads;
        if (age < CHILDHOOD_YEARS) {
            heads = age * HEADS_PER_YEAR_CHILDHOOD + HEADS_AT_BIRTH;
            // heads = age * 3 + 3
        } else if (age >= CHILDHOOD_YEARS && age < MIDDLE_YEARS) {
            heads = age * HEADS_PER_YEAR_PRE_MIDDLE_YEARS - CHILDHOOD_YEARS * HEADS_PER_YEAR_PRE_MIDDLE_YEARS +
                    CHILDHOOD_YEARS * HEADS_PER_YEAR_CHILDHOOD + HEADS_AT_BIRTH;
            // heads = age*2 - 200*2 + 200*3 + 3 = age*2 + 203
        } else {
            heads = age * HEADS_PER_YEAR_MIDDLE_YEARS - MIDDLE_YEARS * HEADS_PER_YEAR_MIDDLE_YEARS +
                    MIDDLE_YEARS * HEADS_PER_YEAR_PRE_MIDDLE_YEARS - CHILDHOOD_YEARS *
                    HEADS_PER_YEAR_PRE_MIDDLE_YEARS + CHILDHOOD_YEARS * HEADS_PER_YEAR_CHILDHOOD + HEADS_AT_BIRTH;
            // heads = age*1 - 300*1 + 300*2 - 200*2 + 200*3 + 3 = age + 300 + 200 + 3 = age + 503
        }
        return heads;
    }

    public static int getEyesNumber(int age) {
        return getHeadsNumber(age) * EYES_PER_HEAD;
    }
}
