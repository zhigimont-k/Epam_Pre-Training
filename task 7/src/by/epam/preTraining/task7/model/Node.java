package by.epam.preTraining.task7.model;

public class Node<T extends Comparable> implements Comparable<T>{
    Node left;
    Node right;
    T value;

    Node(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(T o) {
        return value.compareTo(o);
    }
}
