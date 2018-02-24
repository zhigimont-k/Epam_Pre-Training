package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;

import java.util.ArrayList;

public class QueueList<T> extends ListDataType<T> implements Queue<T> {

    public QueueList() {
        list = new ArrayList<>();
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
        }
        T popped = list.get(0);
        list.remove(0);
        size--;
        return popped;
    }

    @Override
    public void enqueue(T e) throws DataStructureIndexOutOfBoundsException {
        if (fixedSize) {
            if (isFull()) {
                throw new DataStructureIndexOutOfBoundsException("Can't add element to already full fixed size collection");
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
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return list.get(0);
    }

}
