package by.epam.preTraining.task5.railwayhierarchy.model;

import java.util.Random;

/**
 * Created by karina on 18-02-2018.
 */
public class ObjectGenerator {
    public static final int MAX_BOUND = 150;

    private static Carriage createRandomCarriage(Random rand) {
        return new Carriage(rand.nextInt(MAX_BOUND) + 1, rand.nextInt(MAX_BOUND) + 1);
    }

    private static FreightTrain createRandomFreightTrain(Random rand) {
        FreightTrain tr = new FreightTrain();
        int number = rand.nextInt(MAX_BOUND) + 1;
        tr.setNumber(number);
        int carriageNumber = rand.nextInt(MAX_BOUND) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(createRandomCarriage(rand));
        }
        int cargoWeight = rand.nextInt(MAX_BOUND) + 1;
        tr.addCargo(cargoWeight);
        return tr;
    }

    private static PassengerTrain createRandomPassengerTrain(Random rand) {
        PassengerTrain tr = new PassengerTrain();
        int number = rand.nextInt(MAX_BOUND) + 1;
        tr.setNumber(number);
        int carriageNumber = rand.nextInt(MAX_BOUND) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(createRandomCarriage(rand));
        }
        int peopleNumber = rand.nextInt(MAX_BOUND) + 1;
        tr.addPassenger(peopleNumber);
        return tr;
    }

    public static TrainStation createRandomStation() {
        TrainStation ts = new TrainStation();
        Random rand = new Random();
        int trainNumber = rand.nextInt(MAX_BOUND) + 1;
        for (int i = 0; i < trainNumber; i++) {
            if (rand.nextBoolean()) {
                ts.addTrain(createRandomPassengerTrain(rand));
            } else {
                ts.addTrain(createRandomFreightTrain(rand));
            }
        }
        return ts;
    }
}
