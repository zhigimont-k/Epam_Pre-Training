package by.epam.preTrining.task6.model;

import by.epam.preTrining.task6.model.exception.*;

public interface Queue<T> extends Collection<T>{
    void enqueue(T e) throws CollectionOverflowException;
    T dequeue() throws EmptyCollectionException;

}
