package by.epam.preTraining.task6.model.datastructures;


import by.epam.preTraining.task6.model.datastructures.exception.*;

public class QueueArray<T> extends ArrayDataType<T> implements Queue<T> {

    @SuppressWarnings("unchecked")
    public QueueArray() {
        arr = (T[]) (new Object[0]);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
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
    public void enqueue(T elem) throws CollectionOverflowException {
        if (fixedSize) {
            if (size + 1 > capacity) {
                throw new CollectionOverflowException();
            }

            T newArr[] = (T[]) (new Object[capacity]);
            if (size != 0 && arr[0] == null) {
                for (int i = 0; i < arr.length - 1; i++) {
                    newArr[i] = arr[i + 1];
                }
                newArr[newArr.length - 1] = elem;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[newArr.length - 1] = elem;
            }
            arr = newArr.clone();
        } else {
            T newArr[] = (T[]) (new Object[arr.length + 1]);
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = elem;
            arr = newArr.clone();
        }
        size++;
    }

    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return arr[size - 1];
    }

}
