package by.epam.pretraining.task3.view;

/**
 * Created by karina on 03-02-2018.
 */
public class View {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printTaskTitle(int number) {
        printMessage("---------------Task 3." + number + ":");
    }
}
