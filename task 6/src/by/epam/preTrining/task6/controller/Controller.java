package by.epam.preTrining.task6.controller;

import by.epam.preTrining.task6.model.*;
import by.epam.preTrining.task6.model.exception.*;
import by.epam.preTrining.task6.view.View;

public class Controller {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testStack() {
        StackArray fixed = new StackArray(10);
        //StackArray dynamic = new StackArray();
        try {
            for (int i = 0; i < 10; i++) {
                fixed.push(i);
                View.print("stack: " + fixed);
                View.print("size = "+fixed.size());
            }
            View.print("stack: " + fixed);
            fixed.pop();
            View.print("size = "+fixed.size());
            View.print("stack: " + fixed);
            fixed.push(42);
            View.print("stack: " + fixed);
            View.print("size = "+fixed.size());
        } catch (CollectionOverflowException e) {
            //e.printStackTrace();
            View.print("Stack overflow exception");
        } catch (EmptyCollectionException e) {
            //e.printStackTrace();
            View.print("EmptyCollectionException");
        }

    }

    private static void testQueue() {

    }
}
