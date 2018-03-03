package by.epam.preTraining.task6.model.datastructure.list;

import by.epam.preTraining.task6.model.datastructure.exception.DataStructureIndexOutOfBoundsException;
import by.epam.preTraining.task6.model.datastructure.exception.EmptyCollectionException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class List<T> implements Iterable<T> {
    private ListElement last;
    private ListElement first;
    private int size;

    public List() {
        size = 0;
    }

    // adds elements to the end of the list
    public void add(T... value) {
        for (T val : value) {
            ListElement elem = new ListElement();
            elem.value = val;
            if (last == null) {
                first = elem;
                last = elem;
            } else {
                last.next = elem;
                last = elem;
            }
            size++;
        }

    }

    // adds elements to the beginning of the list
    public void unshift(T... value) {
        for (T val : value) {
            ListElement elem = new ListElement();
            elem.value = val;
            if (last == null) {
                first = elem;
                last = elem;
            } else {
                elem.next = first;
                first = elem;
            }
            size++;
        }

    }

    public T get(int index) throws DataStructureIndexOutOfBoundsException, IllegalArgumentException {
        if (index >= size) {
            throw new DataStructureIndexOutOfBoundsException("Index is out of bounds");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index can't be negative");
        }
        ListElement current = first;
        while (index > 0) {
            index--;
            current = current.next;
        }
        return (T) current.value;
    }

    public void set(int index, T value) throws DataStructureIndexOutOfBoundsException, IllegalArgumentException {
        if (index >= size) {
            throw new DataStructureIndexOutOfBoundsException("Index is out of bounds");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index can't be negative");
        }
        ListElement current = first;
        while (index > 0) {
            index--;
            current = current.next;
        }
        current.value = value;
    }

    public ListElement getFirst() {
        return first;
    }

    public ListElement getLast() {
        return last;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void remove(T value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty list");
        }
        ListElement previous = first;
        ListElement current = first;
        while (current.next != null || current == last) {
            if (current.value.equals(value)) {
                if (size == 1) {
                    first = null;
                    last = null;
                } else if (current.equals(first)) {
                    first = first.next;
                } else if (current.equals(last)) {
                    last = previous;
                    last.next = null;
                } else {
                    previous.next = current.next;
                }
                size--;
                break;
            }
            previous = current;
            current = previous.next;
        }
    }

    public void removeFirst() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty list");
        }
        first = first.next;
        size--;
    }

    public void removeLast() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty list");
        }
        ListElement previous = first;
        ListElement current = first;
        while (current.next != null || current == last) {
            if (current.equals(last)) {
                last = previous;
                last.next = null;
                size--;
                break;
            }
            previous = current;
            current = previous.next;
        }
    }

    public void clear() throws EmptyCollectionException {
        while (!isEmpty()) {
            removeLast();
        }
    }

    public boolean contains(T value) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't search elements in empty list");
        }
        ListElement previous = first;
        ListElement current = first;
        while (current.next != null || current == last) {
            if (current.value.equals(value)) {
                return true;
            }
            previous = current;
            current = previous.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<>() {
            private ListElement current = first;

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = (T) current.value;
                current = current.next;
                return value;
            }

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<T> other = (List<T>) obj;
        if (size != other.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            try {
                if (this.get(i) != other.get(i)) {
                    return false;
                }
            } catch (DataStructureIndexOutOfBoundsException e){
                e.printStackTrace();
            }

        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (T elem : this) {
            hash += hash * 31 + elem.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T elem : this) {
            s.append(elem + " ");
        }
        return s.toString();
    }
}

class ListElement<T> {
    ListElement next;
    T value;

    ListElement() {
    }

    ListElement(ListElement next, T value) {
        this.next = next;
        this.value = value;
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
        ListElement<T> other = (ListElement<T>) obj;
        return (this.value == other.value && this.next == other.next);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + value.hashCode() + next.hashCode();
        return hash;
    }
}
