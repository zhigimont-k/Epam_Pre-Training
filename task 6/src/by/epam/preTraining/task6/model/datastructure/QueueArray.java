package by.epam.preTraining.task6.model.datastructure;


import by.epam.preTraining.task6.model.datastructure.exception.*;

public class QueueArray<T> extends ArrayDataType<T> implements Queue<T> {

    @SuppressWarnings("unchecked")
    public QueueArray() {
        arr = (T[]) (new Object[0]);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
        }
        T newArr[] = (T[]) (new Object[arr.length - 1]);
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        T popped = arr[0];
        arr = newArr.clone();
        size--;
        return popped;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void enqueue(T e) throws DataStructureIndexOutOfBoundsException {
        push(e);
    }

    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return arr[0];
    }
}
