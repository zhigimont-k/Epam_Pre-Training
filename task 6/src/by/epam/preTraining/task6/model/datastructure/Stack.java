package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.DataStructureIndexOutOfBoundsException;
import by.epam.preTraining.task6.model.datastructure.exception.EmptyCollectionException;

public interface Stack<T>{
    void push(T e) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException;
    T pop() throws EmptyCollectionException;
}
