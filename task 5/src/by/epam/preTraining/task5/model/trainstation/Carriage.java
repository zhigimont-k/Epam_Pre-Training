package by.epam.preTraining.task5.model.trainstation;

public class Carriage {
    private int length;
    private int weight;
    public static final int AVG_CARRIAGE_LENGTH = 4;
    public static final int AVG_CARRIAGE_WEIGHT = 32;

    public Carriage() {
        length = AVG_CARRIAGE_LENGTH;
        weight = AVG_CARRIAGE_WEIGHT;
    }

    public Carriage(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public Carriage(Carriage car) {
        this.length = car.length;
        this.weight = car.weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Carriage, length = " + length + ", weight = " + weight;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + length + weight;
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
        Carriage other = (Carriage) obj;
        if (this.length != other.length || this.weight != other.weight) {
            return false;
        }
        return true;
    }
}
