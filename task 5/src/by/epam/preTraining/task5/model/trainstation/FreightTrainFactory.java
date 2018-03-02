package by.epam.preTraining.task5.model.trainstation;

import java.util.Random;

public class FreightTrainFactory implements TrainFactory {
    @Override
    public Train createTrain() {
        Random rand = new Random();
        CarriageFactory factory = new CarriageFactory();
        FreightTrain tr = new FreightTrain();
        tr.setNumber(rand.nextInt(MAX_TRAIN_ID - 1) + 1);
        int carriageNumber = rand.nextInt(MAX_CARRIAGE_NUMBER - 1) + 1;
        for (int i = 0; i < carriageNumber; i++) {
            tr.addCarriage(factory.createCarriage());
        }
        int cargoWeight = rand.nextInt(MAX_CARGO_WEIGHT - 1) + 1;
        tr.addCargo(cargoWeight);
        return tr;
    }
}
