package by.epam.preTraining.task5.model.trainstation;

import java.util.Random;

public class TrainStationGenerator {
    private static final int MAX_CARRIAGE_NUMBER = 200;
    private static final int MAX_TRAIN_NUMBER = 150;
    private static final int MAX_TRAIN_ID = 300;
    private static final int MAX_CARGO_WEIGHT = 500;
    private static final int MAX_PEOPLE_NUMBER = 250;
    private static final int MAX_CARRIAGE_LENGTH = 20;
    private static final int MIN_CARRIAGE_LENGTH = 4;
    private static final int MIN_CARRIAGE_WEIGHT = 20;
    private static final int MAX_CARRIAGE_WEIGHT = 100;

    private static Carriage createRandomCarriage(Random rand) {
        return new Carriage(rand.nextInt(MAX_CARRIAGE_LENGTH - MIN_CARRIAGE_LENGTH) + MIN_CARRIAGE_LENGTH,
                rand.nextInt(MAX_CARRIAGE_WEIGHT - MIN_CARRIAGE_WEIGHT) + MIN_CARRIAGE_WEIGHT);
    }

    private static FreightTrain createRandomFreightTrain(Random rand) {
        FreightTrain tr = new FreightTrain();
        tr.setNumber(rand.nextInt(MAX_TRAIN_ID - 1) + 1);
        int carriageNumber = rand.nextInt(MAX_CARRIAGE_NUMBER - 1) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(createRandomCarriage(rand));
        }
        int cargoWeight = rand.nextInt(MAX_CARGO_WEIGHT - 1) + 1;
        tr.addCargo(cargoWeight);
        return tr;
    }

    private static PassengerTrain createRandomPassengerTrain(Random rand) {
        PassengerTrain tr = new PassengerTrain();
        tr.setNumber(rand.nextInt(MAX_TRAIN_ID - 1) + 1);
        int carriageNumber = rand.nextInt(MAX_CARRIAGE_NUMBER - 1) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(createRandomCarriage(rand));
        }
        int peopleNumber = rand.nextInt(MAX_PEOPLE_NUMBER - 1) + 1;
        tr.addPassenger(peopleNumber);
        return tr;
    }

    public static TrainStation createRandomStation() {
        TrainStation ts = new TrainStation();
        Random rand = new Random();
        int trainNumber = rand.nextInt(MAX_TRAIN_NUMBER - 1) + 1;
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
