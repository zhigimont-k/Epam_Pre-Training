package by.epam.pretraining.task3.view;

public class View {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printTaskTitle(int number) {
        printMessage("---------------Task 3." + number + ":");
    }
}
