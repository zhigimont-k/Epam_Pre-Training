package by.epam.preTraining.task7.model;

import by.epam.preTraining.task7.model.exception.EmptyCollectionException;

public class BinaryTree<T extends Comparable> {
    private Node root;

    public void add(T value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }
        if (value.compareTo(current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo(current.value) >= 0) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public boolean contains(T value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Collection is empty");
        }
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, T value) {
        if (current == null) {
            return false;
        }
        if (value.compareTo(current.value) == 0) {
            return true;
        }
        return (value.compareTo(current.value) < 0) ? containsRecursive(current.left, value) :
                containsRecursive(current.right, value);
    }

    public void remove(T value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Collection is empty");
        }
        removeRecursive(root, value);
    }

    private Node removeRecursive(Node current, T value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.value) == 0) {
            // has no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // has 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // has 2 children
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value) < 0) {
            current.left = removeRecursive(current.left, value);
            return current;
        }

        current.right = removeRecursive(current.right, value);
        return current;
    }

    private T findSmallestValue(Node current) {
        return current.left == null ? (T)current.value : findSmallestValue(current.left);
    }

    public void clear() {
        root = null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }


    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node current) {
        return current == null ? 0 : sizeRecursive(current.left) + 1 + sizeRecursive(current.right);
    }

    private StringBuilder traverseInOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            traverseInOrderRecursive(node.left, s);
            s.append(node.value + " ");
            traverseInOrderRecursive(node.right, s);
        }
        return s;
    }

    private StringBuilder traversePreOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            s.append(node.value + " ");
            traversePreOrderRecursive(node.left, s);
            traversePreOrderRecursive(node.right, s);
        }
        return s;
    }

    private StringBuilder traversePostOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            traversePostOrderRecursive(node.left, s);
            traversePostOrderRecursive(node.right, s);
            s.append(node.value + " ");
        }
        return s;
    }

    public StringBuilder traversePostOrder() {
        return traversePostOrderRecursive(root, new StringBuilder());
    }

    public StringBuilder traverseInOrder() {
        return traverseInOrderRecursive(root, new StringBuilder());
    }

    public StringBuilder traversePreOrder() {
        return traversePreOrderRecursive(root, new StringBuilder());
    }
}
