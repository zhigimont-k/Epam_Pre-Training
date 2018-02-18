package by.epam.preTraining.task5.railwayhierarchy.controller;

import by.epam.preTraining.task5.railwayhierarchy.model.*;
import by.epam.preTraining.task5.railwayhierarchy.view.View;

/**
 * Created by karina on 18-02-2018.
 */
public class Controller {
    public static void main(String[] args) {
        TrainStation station = ObjectGenerator.createRandomStation();
        View.print("Number of trains currently on the station: " + station.countTrains());
        View.print("The shortest train is " + station.findShortestTrain());
        View.print("The longest train is: " + station.findLongestTrain());
        View.print("The heaviest train is: " + station.findHeaviestTrain());
        View.print("The lightest train is: " + station.findLightestTrain());

    }


}
