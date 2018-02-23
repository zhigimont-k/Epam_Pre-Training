package by.epam.preTrining.task6.model;


import by.epam.preTrining.task6.model.exception.*;

public class QueueArray<T> implements Queue<T> {
    private T arr[];
    private int capacity;
    private boolean fixedSize;
    private int size;

    @Override
    public void setCapacity(int capacity) throws CastDynamicToFixedCollectionException, ChangeFixedCapacityException, NegativeCapacityException {
        if (!fixedSize){
            throw new CastDynamicToFixedCollectionException();
        }
        if (!isEmpty() || capacity != 0){
            throw new ChangeFixedCapacityException();
        }
        if (capacity <= 0){
            throw new NegativeCapacityException();
        }
        this.capacity = capacity;
    }

    @SuppressWarnings("unchecked")
    public QueueArray() {
        arr = (T[]) (new Object[0]);
        fixedSize = false;
    }

    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        arr = (T[]) (new Object[0]);
        this.capacity = capacity;
        fixedSize = true;
    }


    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        T newArr[] = (T[]) (new Object[arr.length - 1]);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        T popped = arr[arr.length - 1];
        arr = newArr.clone();
        return popped;
    }

    public T getTail() throws EmptyCollectionException{
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        return arr[0];
    }

    public T getHead() throws EmptyCollectionException{
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        return arr[arr.length - 1];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void enqueue(T elem) throws CollectionOverflowException {
        if (fixedSize) {
            if (size + 1 > capacity) {
                throw new CollectionOverflowException();
            }
            T newArr[] = (T[]) (new Object[capacity]);
            for (int i = 0; i < arr.length - 1; i++) {
                newArr[i] = arr[i + 1];
            }
            newArr[newArr.length - 1] = elem;
            arr = newArr.clone();
            size++;
        } else {
            T newArr[] = (T[]) (new Object[arr.length + 1]);
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = arr[i + 1];
            }
            newArr[newArr.length - 1] = elem;
            arr = newArr.clone();
        }
    }

    @Override
    public boolean isEmpty() {
        return arr.length == 0;
    }

    @Override
    public boolean isFull() {
        return arr.length == capacity;
    }

    @Override
    public T peek() throws EmptyCollectionException{
        if (isEmpty()){
            throw new EmptyCollectionException();
        }
        return getHead();
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String toString() {
        if (arr == null){
            return "null";
        }
        int last = arr.length - 1;
        if (last == -1){
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; ; i++){
            s.append(arr[i]);
            if (i == last){
                return s.append("]").toString();
            }
            s.append(", ");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueArray other = (QueueArray) obj;
        if (arr.length != other.arr.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != other.arr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (int i = 0; i < arr.length; i++) {
            hash += hash * 31 + arr[i].hashCode();
        }
        return hash;
    }
}
