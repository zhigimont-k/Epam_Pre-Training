package by.epam.preTraining.task7.model;

import by.epam.preTraining.task7.model.exception.EmptyCollectionException;

public class BinaryTree {
    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public boolean contains(int value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Collection is empty");
        }
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        return (value < current.value) ? containsRecursive(current.left, value) :
                containsRecursive(current.right, value);
    }

    public void remove(int value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Collection is empty");
        }
        removeRecursive(root, value);
    }

    private Node removeRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
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
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = removeRecursive(current.left, value);
            return current;
        }

        current.right = removeRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node current) {
        return current.left == null ? current.value : findSmallestValue(current.left);
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

    private StringBuilder traverseInOrder(Node node, StringBuilder s) {
        if (node != null) {
            traverseInOrder(node.left, s);
            s.append(node.value + " ");
            traverseInOrder(node.right, s);
        }
        return s;
    }

    private StringBuilder traversePreOrder(Node node, StringBuilder s) {
        if (node != null) {
            s.append(node.value + " ");
            traversePreOrder(node.left, s);
            traversePreOrder(node.right, s);
        }
        return s;
    }

    private StringBuilder traversePostOrder(Node node, StringBuilder s) {
        if (node != null) {
            traversePostOrder(node.left, s);
            traversePostOrder(node.right, s);
            s.append(node.value + " ");
        }
        return s;
    }

    private void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node = null;
        }
    }

    public StringBuilder traversePost() {
        return traversePostOrder(root, new StringBuilder());
    }

    public StringBuilder traverseIn() {
        return traverseInOrder(root, new StringBuilder());
    }

    public StringBuilder traversePre() {
        return traversePreOrder(root, new StringBuilder());
    }
}
