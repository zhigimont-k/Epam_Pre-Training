package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.*;

import java.util.ArrayList;

public class StackList<T> extends ListDataType<T> implements Stack<T> {

    public StackList() {
        list = new ArrayList<>();
    }

    @Override
    public void push(T e) throws CollectionOverflowException {
        if (fixedSize) {
            if (size >= capacity) {
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
    public T pop() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        T popped = list.get(size - 1);
        list.remove(size - 1);
        size--;
        return popped;
    }


    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return list.get(size - 1);
    }

}
