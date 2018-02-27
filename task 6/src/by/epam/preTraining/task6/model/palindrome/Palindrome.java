package by.epam.preTraining.task6.model.palindrome;

import by.epam.preTraining.task6.model.datastructure.StackArray;
import by.epam.preTraining.task6.model.datastructure.exception.DataStructureIndexOutOfBoundsException;
import by.epam.preTraining.task6.model.datastructure.exception.EmptyCollectionException;

public class Palindrome {
    public static boolean checkPalindrome(String s) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException {
        StackArray stack = new StackArray<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder reversed = new StringBuilder("");
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return s.equals(reversed.toString());
    }
}
