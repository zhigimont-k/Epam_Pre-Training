package by.epam.preTraining.task6.model.palindrome;

import by.epam.preTraining.task6.model.datastructures.StackArray;
import by.epam.preTraining.task6.model.datastructures.exception.CollectionOverflowException;
import by.epam.preTraining.task6.model.datastructures.exception.EmptyCollectionException;

public class Palindrome {
    public static boolean checkPalindrome(String s) {
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
}
