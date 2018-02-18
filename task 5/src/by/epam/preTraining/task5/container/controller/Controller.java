package by.epam.preTraining.task5.container.controller;

import by.epam.preTraining.task5.container.model.DynamicArray;
import by.epam.preTraining.task5.container.view.View;

/**
 * Created by karina on 18-02-2018.
 */
public class Controller {
    public static void arrayTest() {
        DynamicArray a = new DynamicArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        View.print(a.toString());

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
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        a.removeAll();
        View.print(a.toString());
        View.print(a.isEmpty());
    }
}
