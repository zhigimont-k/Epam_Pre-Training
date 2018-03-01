package by.epam.preTraining.task7.model;

public class Node<T extends Comparable> implements Comparable<T> {
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

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node<T> other = (Node<T>) obj;
        return (value == other.value);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + value.hashCode();
        return hash;
    }
}
