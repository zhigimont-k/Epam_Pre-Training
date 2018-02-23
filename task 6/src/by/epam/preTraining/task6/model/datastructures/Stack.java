package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.CollectionOverflowException;
import by.epam.preTraining.task6.model.datastructures.exception.EmptyCollectionException;

public interface Stack<T>{
    void push(T e) throws CollectionOverflowException;
    T pop() throws EmptyCollectionException;
}
