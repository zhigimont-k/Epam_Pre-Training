package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;

public class StackArray<T> extends ArrayDataType<T> implements Stack<T> {

    @SuppressWarnings("unchecked")
    public StackArray() {
        arr = (T[]) (new Object[0]);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(T elem) throws DataStructureIndexOutOfBoundsException {
        if (isFull()) {
            throw new DataStructureIndexOutOfBoundsException("Can't add element to already full fixed size collection");
        }
        if (fixedSize) {
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
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
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


    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return arr[size - 1];
    }

}
