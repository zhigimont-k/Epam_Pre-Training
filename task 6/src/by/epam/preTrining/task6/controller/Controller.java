package by.epam.preTrining.task6.controller;

import by.epam.preTrining.task6.model.*;
import by.epam.preTrining.task6.model.exception.*;
import by.epam.preTrining.task6.view.View;

public class Controller {
    public static void main(String[] args) {
        //testStack();
        //testQueue();
        String s = "Racecar";
        View.print(s + " is a palindrome: " + checkPalindrome(s));
    }

    private static boolean checkPalindrome(String s) {
        boolean result = false;
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        StackArray<String> stack = new StackArray<>();
        try {
            for (int i = 0; i < sb.length(); i++) {
                stack.push(sb.substring(i, i + 1));
            }

            StringBuilder reversed = new StringBuilder("");
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }
            result = sb.toString().equals(reversed.toString());
        } catch (CollectionOverflowException | EmptyCollectionException e) {
            e.printStackTrace();
        }
        return result;
    }


    private static void testStack() {
//        StackArray fixed = new StackArray(10);
//        try {
//            for (int i = 0; i < 10; i++) {
//                fixed.push(i);
//            }
//            View.print("stack: " + fixed);
//            fixed.pop();
//            View.print("stack: " + fixed);
//            fixed.push(42);
//            View.print("stack: " + fixed);
//        } catch (CollectionOverflowException e) {
//            //e.printStackTrace();
//            View.print("Stack overflow exception");
//        } catch (EmptyCollectionException e) {
//            //e.printStackTrace();
//            View.print("EmptyCollectionException");
//        }


        StackArray dynamic = new StackArray();
        try {
            for (int i = 0; i < 10; i++) {
                dynamic.push(i);
            }
            View.print("stack: " + dynamic);
            dynamic.pop();
            View.print("stack: " + dynamic);
            dynamic.push(42);
            View.print("stack: " + dynamic);
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
