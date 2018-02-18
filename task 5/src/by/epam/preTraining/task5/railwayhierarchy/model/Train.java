package by.epam.preTraining.task5.railwayhierarchy.model;

import by.epam.preTraining.task5.container.model.DynamicArray;

/**
 * Created by karina on 18-02-2018.
 */
public abstract class Train {
    protected DynamicArray<Carriage> carriages;

    public Train() {
        carriages = new DynamicArray<>();
    }

    public Train(Carriage... car) {
        carriages = new DynamicArray<>(car);
    }

    public int getCarriageNumber() {
        return carriages.length;
    }

    public int calculateLength() {
        int len = 0;
        for (Carriage car : carriages) {
            len += car.getLength();
        }
        return len;
    }

    public int calculateWeight() {
        int weight = 0;
        for (Carriage car : carriages) {
            weight += car.getWeight();
        }
        return weight;
    }

    abstract public int calculateTotalWeight();

    public void addCarriage(Carriage... car) {
        carriages.add(car);
    }

    public void addAtCarriage(int index, Carriage... car) {
        carriages.addAt(index, car);
    }

    public void removeCarriage(int index) {
        carriages.removeAt(index);
    }

    public void removeCarriage(Carriage car) {
        if (carriages.contains(car)) {
            carriages.removeAt(carriages.indexOf(car));
        }
    }

    @Override
    public String toString() {
        return "Train, length = " + calculateLength()+", weight = "+calculateTotalWeight();
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + carriages.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Train other = (Train) obj;
        if (!carriages.equals(other.carriages)){
            return false;
        }
        return true;
    }
}
