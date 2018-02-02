/**
 * Created by karina on 30-01-2018.
 */
public class Task21 {
    public static int CHILDHOOD_YEARS = 200;
    public static int MIDDLE_YEARS = 300;
    public static int HEADS_PER_YEAR_CHILDHOOD = 3;
    public static int HEADS_PER_YEAR_PRE_MIDDLE_YEARS = 2;
    public static int HEADS_PER_YEAR_MIDDLE_YEARS = 1;
    public static int EYES_PER_HEAD = 2;

    public static void run() {
        System.out.println("----------Task 2.1:");
        int age = 245;
        System.out.println("Number of heads: " + getHeadsNumber(age));
        System.out.println("Number of eyes: " + getEyesNumber(age));
    }

    public static int getHeadsNumber(int age) {
        if (age < CHILDHOOD_YEARS) {
            return (age + 1) * HEADS_PER_YEAR_CHILDHOOD;
        } else if (age >= CHILDHOOD_YEARS && age < MIDDLE_YEARS) {
            return ((age + 1) - MIDDLE_YEARS) * HEADS_PER_YEAR_PRE_MIDDLE_YEARS +
                    CHILDHOOD_YEARS * HEADS_PER_YEAR_CHILDHOOD;
        } else {
            return ((age + 1) - MIDDLE_YEARS) * HEADS_PER_YEAR_MIDDLE_YEARS + (MIDDLE_YEARS - CHILDHOOD_YEARS) *
                    HEADS_PER_YEAR_PRE_MIDDLE_YEARS + CHILDHOOD_YEARS * HEADS_PER_YEAR_CHILDHOOD;
        }
    }

    public static int getEyesNumber(int age) {
        return getHeadsNumber(age) * EYES_PER_HEAD;
    }
}
