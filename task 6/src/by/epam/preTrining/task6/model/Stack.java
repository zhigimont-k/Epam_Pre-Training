package by.epam.preTrining.task6.model;

import by.epam.preTrining.task6.model.exception.CollectionOverflowException;
import by.epam.preTrining.task6.model.exception.EmptyCollectionException;

public interface Stack<T> extends Collection {
    void push(T e) throws CollectionOverflowException;
    T pop() throws EmptyCollectionException;
}
