package by.epam.preTraining.task5.model.trainstation;

import java.util.Random;

public class PassengerTrainFactory implements TrainFactory {
    @Override
    public Train createTrain() {
        Random rand = new Random();
        CarriageFactory factory = new CarriageFactory();
        PassengerTrain tr = new PassengerTrain();
        tr.setNumber(rand.nextInt(MAX_TRAIN_ID - 1) + 1);
        int carriageNumber = rand.nextInt(MAX_CARRIAGE_NUMBER - 1) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(factory.createCarriage());
        }
        int peopleNumber = rand.nextInt(MAX_PEOPLE_NUMBER - 1) + 1;
        tr.addPassenger(peopleNumber);
        return tr;
    }
}
