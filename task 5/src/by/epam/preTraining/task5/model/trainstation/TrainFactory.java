package by.epam.preTraining.task5.model.trainstation;

public interface TrainFactory {
    int MAX_CARRIAGE_NUMBER = 200;
    int MAX_TRAIN_ID = 300;
    int MAX_CARGO_WEIGHT = 500;
    int MAX_PEOPLE_NUMBER = 250;
    Train createTrain();
}
