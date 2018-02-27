package by.epam.preTraining.task5.controller;

import by.epam.preTraining.task5.model.trainstation.*;
import by.epam.preTraining.task5.model.container.*;
import by.epam.preTraining.task5.view.View;

public class Controller {
    public static void main(String[] args) {
        TrainStation station = TrainStationGenerator.createRandomStation();
        View.print("Number of trains currently on the station: " + station.countTrains());
        View.print("The shortest train is " + station.findShortestTrain());
        View.print("The longest train is: " + station.findLongestTrain());
        View.print("The heaviest train is: " + station.findHeaviestTrain());
        View.print("The lightest train is: " + station.findLightestTrain());

        arrayTest();

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
