package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.*;

public class StackArray<T> extends ArrayDataType<T> implements Stack<T> {

    @SuppressWarnings("unchecked")
    public StackArray() {
        arr = (T[]) (new Object[0]);
        size = 0;
        capacity = 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(T elem) throws CollectionOverflowException {
        if (fixedSize) {
            if (size >= capacity) {
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

    @SuppressWarnings("unchecked")
    @Override
    public T pop() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        T newArr[] = (T[]) (new Object[arr.length - 1]);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        T popped = arr[arr.length - 1];
        arr = newArr.clone();
        size--;
        return popped;
    }

}
