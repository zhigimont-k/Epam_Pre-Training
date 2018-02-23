package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.*;

import java.util.ArrayList;

public class QueueList<T> extends ListDataType<T> implements Queue<T> {

    public QueueList() {
        list = new ArrayList<>();
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        T popped = list.get(0);
        list.remove(0);
        size--;
        return popped;
    }

    @Override
    public void enqueue(T e) throws CollectionOverflowException {
        if (fixedSize) {
            if (size + 1 > capacity) {
                throw new CollectionOverflowException();
            }
            if (size != 0 && list.get(0) == null) {
                list.remove(0);
            }
        }
        list.add(e);
        size++;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return list.get(0);
    }

}
