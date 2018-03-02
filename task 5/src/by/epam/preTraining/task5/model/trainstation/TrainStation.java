package by.epam.preTraining.task5.model.trainstation;

import by.epam.preTraining.task5.model.container.DynamicArray;


public class TrainStation {
    private DynamicArray<Train> trains;

    public DynamicArray<Train> getTrains() {
        return trains;
    }

    public TrainStation() {
        trains = new DynamicArray<>();
    }

    public TrainStation(Train... tr) {
        trains = new DynamicArray<>(tr);
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
