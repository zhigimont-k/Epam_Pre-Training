package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;
import by.epam.preTraining.task6.model.datastructure.list.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class QueueList<T> extends ListDataType<T> implements Queue<T> {

    public QueueList() {
        list = new List<>();
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
        }
        T popped = list.getFirstValue();
        list.removeFirst();
        size--;
        return popped;
    }

    @Override
    public void enqueue(T e) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException {
        push(e);
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return list.getFirstValue();
    }

}
