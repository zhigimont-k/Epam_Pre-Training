package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.*;

public abstract class AbstractDataType<T> {
    protected int size;
    protected int capacity;
    protected boolean fixedSize;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size != 0 && capacity != 0 && size == capacity;
    }

    public abstract T peek() throws EmptyCollectionException;

    public int size() {
        return size;
    }

    public void setCapacity(int capacity) throws CastDynamicToFixedCollectionException,
            ChangeFixedCapacityException, NegativeCapacityException {
        if (!isEmpty() && this.capacity == 0) {
            throw new CastDynamicToFixedCollectionException("Can't cast dynamic collection to fixed size");
        }
        if (this.capacity != 0) {
            throw new ChangeFixedCapacityException("Can't change already set collection capacity");
        }
        if (capacity <= 0) {
            throw new NegativeCapacityException("Capacity must be bigger than 0");
        }
        this.capacity = capacity;
        fixedSize = true;
    }

    public int getCapacity() {
        return capacity;
    }
}
