package by.epam.preTraining.task5.railwayhierarchy.model;

import by.epam.preTraining.task5.container.model.DynamicArray;

/**
 * Created by karina on 18-02-2018.
 */
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
        return "Freight train, number = " + number + ", length = " + calculateLength()+", weight = "+calculateTotalWeight()+", cargo weight = "+freightWeight;
    }

}
