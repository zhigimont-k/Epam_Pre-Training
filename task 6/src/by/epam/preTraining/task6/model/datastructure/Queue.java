package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;

public interface Queue<T>{
    void enqueue(T e) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException;
    T dequeue() throws EmptyCollectionException, DataStructureIndexOutOfBoundsException;

}
