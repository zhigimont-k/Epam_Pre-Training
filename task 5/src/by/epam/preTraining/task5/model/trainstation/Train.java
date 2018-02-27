package by.epam.preTraining.task5.model.trainstation;

import by.epam.preTraining.task5.model.container.DynamicArray;


public abstract class Train {
    protected DynamicArray<Carriage> carriages;
    protected int number;

    public Train() {
        carriages = new DynamicArray<>();
    }

    public Train(int number, Carriage... car) {
        this.number = number;
        carriages = new DynamicArray<>(car);
    }


    abstract public int calculateTotalWeight();

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
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
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + carriages.hashCode() + number;
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
        FreightTrain other = (FreightTrain) obj;
        return this.number == other.number;
    }
}
