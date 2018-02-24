package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;

import java.util.ArrayList;

public class StackList<T> extends ListDataType<T> implements Stack<T> {

    public StackList() {
        list = new ArrayList<>();
    }

    @Override
    public void push(T e) throws DataStructureIndexOutOfBoundsException {
        if (fixedSize) {
            if (size >= capacity) {
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
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
        }
        T popped = list.get(size - 1);
        list.remove(size - 1);
        size--;
        return popped;
    }


    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return list.get(size - 1);
    }

}
