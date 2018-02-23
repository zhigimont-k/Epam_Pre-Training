package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.*;

public interface Queue<T>{
    void enqueue(T e) throws CollectionOverflowException;
    T dequeue() throws EmptyCollectionException;

}
