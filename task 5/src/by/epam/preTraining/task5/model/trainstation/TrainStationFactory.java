package by.epam.preTraining.task5.model.trainstation;

import java.util.Random;

public class TrainStationFactory {
    private static final int MAX_TRAIN_NUMBER = 150;

    public TrainStation createStation() {
        TrainStation ts = new TrainStation();
        Random rand = new Random();
        TrainFactory factory;
        int trainNumber = rand.nextInt(MAX_TRAIN_NUMBER - 1) + 1;
        for (int i = 0; i < trainNumber; i++) {
            if (rand.nextBoolean()) {
                factory = new PassengerTrainFactory();
            } else {
                factory = new FreightTrainFactory();
            }
            ts.addTrain(factory.createTrain());
        }
        return ts;
    }
}
