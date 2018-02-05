package by.epam.pretraining.task3.model;

import java.util.Random;

public class Coin {

    public static int getHeads(int tries) {
        int headsCounter = 0;
        for (int index = 0; index < tries; index++) {
            if (new Random().nextBoolean()) {
                headsCounter++;
            }
        }
        return headsCounter;
    }
}
