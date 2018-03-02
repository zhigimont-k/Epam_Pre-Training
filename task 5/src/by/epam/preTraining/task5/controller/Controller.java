package by.epam.preTraining.task5.controller;

import by.epam.preTraining.task5.model.trainstation.*;
import by.epam.preTraining.task5.model.container.*;
import by.epam.preTraining.task5.view.View;

public class Controller {
    public static void main(String[] args) {
        TrainStation station = new TrainStationFactory().createStation();
        View.print("Number of trains currently on the station: " + countTrains(station));
        View.print("The shortest train is " + findShortestTrain(station));
        View.print("The longest train is: " + findLongestTrain(station));
        View.print("The heaviest train is: " + findHeaviestTrain(station));
        View.print("The lightest train is: " + findLightestTrain(station));

        //arrayTest();

    }

    public static int countTrains(TrainStation ts) {
        return ts.getTrains().length;
    }

    public static Train findLongestTrain(TrainStation ts) {
        DynamicArray<Train> trains = ts.getTrains();
        Train tr = trains.getAt(0);
        for (Train t : trains) {
            int maxLength = tr.calculateLength();
            if (maxLength < t.calculateLength()) {
                tr = t;
            }
        }
        return tr;
    }

    public static Train findShortestTrain(TrainStation ts) {
        DynamicArray<Train> trains = ts.getTrains();
        Train tr = trains.getAt(0);
        for (Train t : trains) {
            int minLength = tr.calculateLength();
            if (minLength > t.calculateLength()) {
                tr = t;
            }
        }
        return tr;
    }

    public static Train findLightestTrain(TrainStation ts) {
        DynamicArray<Train> trains = ts.getTrains();
        Train tr = trains.getAt(0);
        for (Train t : trains) {
            int minWeight = tr.calculateWeight();
            if (minWeight > t.calculateWeight()) {
                tr = t;
            }
        }
        return tr;
    }

    public static Train findHeaviestTrain(TrainStation ts) {
        DynamicArray<Train> trains = ts.getTrains();
        Train tr = trains.getAt(0);
        for (Train t : trains) {
            int maxWeight = tr.calculateWeight();
            if (maxWeight < t.calculateWeight()) {
                tr = t;
            }
        }
        return tr;
    }
    
    private static void arrayTest() {
        DynamicArray a = new DynamicArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        DynamicArray acpy = new DynamicArray(a);
        View.print(a.toString());
        View.print("a copy: "+acpy.toString());

        a.add(14);
        View.print(a.toString());
        a.addAt(2, 42);
        View.print(a.toString());

        a.removeAt(3);
        View.print(a.toString());

        a.setAt(2, 666);
        View.print(a.toString());

        View.print(a.getAt(7));
        View.print(a.length);

        View.print(a.indexOf(42));

        View.print(a.toString());
        View.print(a.indexOf(666));

        View.print(a.contains(14));

        DynamicArray b = new DynamicArray(1, 2, 666, 4, 5, 6, 7, 8, 9, 10, 14);
        DynamicArray c = a;
        View.print(a.hashCode());
        View.print(b.hashCode());
        View.print(c.hashCode());
        View.print(a.equals(b));
        View.print(a.equals(c));

        a.removeAll();
        View.print(a.toString());
        View.print(a.isEmpty());
    } 


}
