package by.epam.preTraining.task4.view;

/**
 * Created by karina on 13-02-2018.
 */
public class View {
    public static void print(Object message) {
        System.out.println(message);
    }

    public static void printTaskTitle(int number) {
        print("---------Task 4." + number);
    }

    public static void printInput(Object... ob) {
        System.out.print("Input: ");
        for (int i = 0; i < ob.length; i++) {
            System.out.print(ob[i] + " ");
        }
        print("");
    }
}
