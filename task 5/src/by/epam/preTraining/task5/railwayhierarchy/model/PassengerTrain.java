package by.epam.preTraining.task5.railwayhierarchy.model;

import by.epam.preTraining.task5.container.model.DynamicArray;

public class PassengerTrain extends Train implements PassengerTransport {
    public static final int AVG_HUMAN_WEIGHT = 60;
    private int passengerNumber;
    private int passengerCapacity;

    public PassengerTrain() {
        carriages = new DynamicArray<>();
    }

    public PassengerTrain(int number, int carriageNumber) {
        this.number = number;
        carriages = new DynamicArray<>();
        for (int i = 0; i < carriageNumber; i++) {
            carriages.add(new Carriage());
        }
    }

    public PassengerTrain(int number, int carriageNumber, int passengerNumber) {
        this.number = number;
        this.passengerNumber = passengerNumber;
        carriages = new DynamicArray<>();
        for (int i = 0; i < carriageNumber; i++) {
            carriages.add(new Carriage());
        }
    }

    public int calculateTotalWeight() {
        return calculateWeight() + AVG_HUMAN_WEIGHT * passengerNumber;
    }

    @Override
    public void addPassenger(int number) {
        passengerNumber += number;
    }

    @Override
    public void removePassenger(int number) {
        passengerNumber -= number;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public String toString() {
        return "Passenger train, number = " + number + ", length = " + calculateLength() + ", weight = " + calculateTotalWeight() + ", passengerNumber = " + passengerNumber;
    }

}
