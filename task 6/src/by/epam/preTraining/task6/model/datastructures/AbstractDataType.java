package by.epam.preTraining.task6.model.datastructures;

import by.epam.preTraining.task6.model.datastructures.exception.*;

public abstract class AbstractDataType<T> {
    protected int size;
    protected int capacity;
    protected boolean fixedSize;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public abstract T peek() throws EmptyCollectionException;

    public int size() {
        return size;
    }

    public void setCapacity(int capacity) throws CastDynamicToFixedCollectionException,
            ChangeFixedCapacityException, NegativeCapacityException {
        if (!isEmpty() && this.capacity != 0) {
            throw new CastDynamicToFixedCollectionException();
        }
        if (!isEmpty() || this.capacity != 0) {
            throw new ChangeFixedCapacityException();
        }
        if (capacity <= 0) {
            throw new NegativeCapacityException();
        }
        this.capacity = capacity;
        fixedSize = true;
    }

    public int getCapacity() {
        return capacity;
    }
}
