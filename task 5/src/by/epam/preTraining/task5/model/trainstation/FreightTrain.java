package by.epam.preTraining.task5.model.trainstation;

import by.epam.preTraining.task5.model.container.DynamicArray;

public class FreightTrain extends Train implements FreightTransport {
    private int freightWeight;

    public FreightTrain() {
    }

    public FreightTrain(int number, int carriageNumber) {
        this.number = number;
        carriages = new DynamicArray<>();
        for (int i = 0; i < carriageNumber; i++) {
            carriages.add(new Carriage());
        }
    }

    public FreightTrain(FreightTrain train) {
        this.number = train.number;
        this.freightWeight = train.freightWeight;
        carriages = new DynamicArray<>();
        int carriageNumber = train.getCarriageNumber();
        for (int i = 0; i < carriageNumber; i++) {
            carriages.add(new Carriage(train.carriages.getAt(i)));
        }
    }

    public int getFreightWeight() {
        return freightWeight;
    }

    public int calculateTotalWeight() {
        return calculateWeight() + freightWeight;
    }

    @Override
    public void addCargo(int weight) {
        freightWeight += weight;
    }

    @Override
    public void removeCargo(int weight) {
        freightWeight -= weight;
    }

    @Override
    public String toString() {
        return "Freight train, number = " + number + ", length = " + calculateLength()+", weight = "+
                calculateTotalWeight()+", cargo weight = "+freightWeight;
    }

}
