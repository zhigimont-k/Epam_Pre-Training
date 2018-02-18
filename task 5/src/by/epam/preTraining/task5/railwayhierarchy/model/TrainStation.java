package by.epam.preTraining.task5.railwayhierarchy.model;

import by.epam.preTraining.task5.container.model.DynamicArray;

/**
 * Created by karina on 18-02-2018.
 */
public class TrainStation {
    private DynamicArray<Train> trains;

    public TrainStation() {
        trains = new DynamicArray<>();
    }

    public TrainStation(Train... tr) {
        trains = new DynamicArray<>(tr);
    }

    public int countTrains() {
        return trains.length;
    }

    public void addTrain(Train... tr) {
        trains.add(tr);
    }

    public void removeTrain(Train tr) {
        if (trains.contains(tr)) {
            trains.removeAt(trains.indexOf(tr));
        }
    }

    public void removeTrain(int index){
        trains.removeAt(index);
    }

    public Train findLongestTrain() {
        Train tr = trains.getAt(0);
        for (int i = 0; i < trains.length; i++) {
            int maxLen = tr.calculateLength();
            if (maxLen < trains.getAt(i).calculateLength()) {
                tr = trains.getAt(i);
            }
        }
        return tr;
    }

    public Train findShortestTrain() {
        Train tr = trains.getAt(0);
        for (int i = 0; i < trains.length; i++) {
            int minLen = tr.calculateLength();
            if (minLen > trains.getAt(i).calculateLength()) {
                tr = trains.getAt(i);
            }
        }
        return tr;
    }

    public Train findLightestTrain() {
        Train tr = trains.getAt(0);
        for (int i = 0; i < trains.length; i++) {
            int minWeight = tr.calculateWeight();
            if (minWeight > trains.getAt(i).calculateWeight()) {
                tr = trains.getAt(i);
            }
        }
        return tr;
    }

    public Train findHeaviestTrain() {
        Train tr = trains.getAt(0);
        for (int i = 0; i < trains.length; i++) {
            int maxWeight = tr.calculateWeight();
            if (maxWeight < trains.getAt(i).calculateWeight()) {
                tr = trains.getAt(i);
            }
        }
        return tr;
    }

    public int calculateTotalCargoWeight(){
        int weight = 0;
        for (Train tr : trains){
            weight += tr.calculateWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Train Station number " + Math.abs(hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + trains.hashCode();
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
        TrainStation other = (TrainStation) obj;
        if (!trains.equals(other.trains)){
            return false;
        }
        return true;
    }
}
