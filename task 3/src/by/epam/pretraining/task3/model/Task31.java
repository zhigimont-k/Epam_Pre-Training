package by.epam.pretraining.task3.model;

import java.util.Random;

/**
 * Created by karina on 03-02-2018.
 */
public class Task31 {
    public static final int NUMBER_OF_TRIES = 1000;
    public static final int HEADS = 1;
    public static final int TAILS = 0;

    public static int getHeads() {
        int headsCounter = 0;
        for (int index = 0; index < NUMBER_OF_TRIES; index++) {
            double result = getRandomNumber();
            if (result == HEADS) {
                headsCounter++;
            }
        }
        return headsCounter;
    }

    public static int getTails(int heads) {
        return NUMBER_OF_TRIES - heads;
    }

    public static double getRandomNumber() {
        Random random = new Random();
        return Math.round(random.nextInt(100) / 100.0);
    }
}
