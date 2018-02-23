package by.epam.preTrining.task6.model;

import by.epam.preTrining.task6.model.exception.*;

import java.util.ArrayList;
import java.util.List;

public class StackList<T> implements Stack<T> {
    private List<T> list;
    private int capacity;
    private boolean fixedSize;


    public StackList(){
        list = new ArrayList<>();
    }

    public StackList(int capacity) throws NegativeCapacityException{
        if (capacity <= 0){
            throw new NegativeCapacityException();
        }
        list = new ArrayList<>(capacity);
        fixedSize = true;
        this.capacity = capacity;
    }

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

    @Override
    public void push(T e) throws CollectionOverflowException{
        if (fixedSize && list.size()+1 > capacity){
            throw new CollectionOverflowException();
        }
        list.add(e);
    }

    @Override
    public T pop() throws EmptyCollectionException{
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        T popped = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return popped;
    }

    @Override
    public T getHead() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        return list.get(list.size() - 1);
    }

    @Override
    public T getTail() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException();
        }
        return list.get(0);
    }

    @Override
    public T peek() throws EmptyCollectionException{
        if (isEmpty()){
            throw new EmptyCollectionException();
        }
        return getHead();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public boolean isFull() {
        return list.size() == capacity;
    }

    @Override
    public int size() {
        return list.size();
    }


    @Override
    public String toString() {
        if (list == null){
            return "null";
        }
        int last = list.size() - 1;
        if (last == -1){
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; ; i++){
            s.append(list.get(i));
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
        StackList other = (StackList) obj;
        if (list.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != other.list.get(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (int i = 0; i < list.size(); i++) {
            hash += hash * 31 + list.get(i).hashCode();
        }
        return hash;
    }
}
