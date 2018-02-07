package by.epam.pretraining.task3.model;

import java.util.Random;

public class Coin {

    public static int getHeads(int tries) {
        tries = Math.abs(tries);
        int headsCounter = 0;
        Random random = new Random();
        for (int index = 0; index < tries; index++) {
            if (random.nextBoolean()) {
                headsCounter++;
            }
        }
        return headsCounter;
    }
}
