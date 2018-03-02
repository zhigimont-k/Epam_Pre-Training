package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;
import by.epam.preTraining.task6.model.datastructure.list.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class StackList<T> extends ListDataType<T> implements Stack<T> {

    public StackList() {
        list = new List<>();
    }


    @Override
    public void push(T e) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException {
        super.push(e);
    }

    @Override
    public T pop() throws EmptyCollectionException, DataStructureIndexOutOfBoundsException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't remove element from empty collection");
        }
        T popped = list.get(size - 1);
        list.removeLast();
        size--;
        return popped;
    }


    @Override
    public T peek() throws EmptyCollectionException, DataStructureIndexOutOfBoundsException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Can't get elements from empty collection");
        }
        return list.get(size - 1);
    }

}
