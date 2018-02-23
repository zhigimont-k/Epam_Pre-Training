package by.epam.preTrining.task6.model;

import by.epam.preTrining.task6.model.exception.*;

public interface Collection<T> {
    boolean isEmpty();
    boolean isFull();
    T peek() throws EmptyCollectionException;
    int size();
    void setCapacity(int capacity)throws CastDynamicToFixedCollectionException, ChangeFixedCapacityException, NegativeCapacityException;
    public T getHead() throws EmptyCollectionException;
    public T getTail() throws EmptyCollectionException;
}
