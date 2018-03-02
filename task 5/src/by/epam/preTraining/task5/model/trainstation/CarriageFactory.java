package by.epam.preTraining.task5.model.trainstation;

import java.util.Random;

public class CarriageFactory {
    private static final int MAX_CARRIAGE_LENGTH = 20;
    private static final int MIN_CARRIAGE_LENGTH = 4;
    private static final int MIN_CARRIAGE_WEIGHT = 20;
    private static final int MAX_CARRIAGE_WEIGHT = 100;
    public Carriage createCarriage(){
        Random rand = new Random();
        return new Carriage(rand.nextInt(MAX_CARRIAGE_LENGTH - MIN_CARRIAGE_LENGTH) + MIN_CARRIAGE_LENGTH,
                rand.nextInt(MAX_CARRIAGE_WEIGHT - MIN_CARRIAGE_WEIGHT) + MIN_CARRIAGE_WEIGHT);
    }
}
