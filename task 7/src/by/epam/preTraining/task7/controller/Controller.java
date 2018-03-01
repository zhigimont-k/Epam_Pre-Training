package by.epam.preTraining.task7.controller;

import by.epam.preTraining.task7.model.BinaryTree;
import by.epam.preTraining.task7.model.exception.EmptyCollectionException;
import by.epam.preTraining.task7.view.View;

import java.util.Random;

public class Controller {
    public static final int VALUE_MAX_BOUND = 100;

    public static void main(String[] args) {
        testTree();
    }

    private static void testTree() {
        BinaryTree bt = new BinaryTree();
        addLeaves(bt, 5);
        View.print("Traverse post order: " + bt.traversePostOrder());
        addLeaves(bt, 5);
        View.print("Traverse pre order: " + bt.traversePreOrder());
        View.print("Tree size is " + bt.size());
        bt.add(42);
        View.print("Traverse in order: " + bt.traverseInOrder());
        try {
            View.print("Contains 42: " + bt.contains(42));
            bt.remove(42);
            View.print("Traverse in order: " + bt.traverseInOrder());
            View.print("Contains 42: " + bt.contains(42));
            View.print("Cleared the tree");
            bt.clear();
            View.print("Tree size is " + bt.size());
            bt.remove(42);
        } catch (EmptyCollectionException e) {
            View.print(e.getMessage());
        }
    }

    private static void addLeaves(BinaryTree bt, int number) {
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            bt.add(rand.nextInt(VALUE_MAX_BOUND));
        }
    }


}
