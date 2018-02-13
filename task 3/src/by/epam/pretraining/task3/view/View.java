package by.epam.pretraining.task3.view;

public class View {
    public static void printMessage(Object ob) {
        System.out.println(ob);
    }

    public static void printTaskTitle(int number) {
        printMessage("---------------Task 3." + number + ":");
    }
}
