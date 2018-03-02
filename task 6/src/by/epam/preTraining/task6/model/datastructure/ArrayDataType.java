package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.DataStructureIndexOutOfBoundsException;

public abstract class ArrayDataType<T> extends AbstractDataType<T>{
    protected T arr[];

    @SuppressWarnings("unchecked")
    public void push(T elem) throws DataStructureIndexOutOfBoundsException {
        if (isFull()) {
            throw new DataStructureIndexOutOfBoundsException("Can't add element to already full fixed size collection");
        }
        if (fixedSize) {
            T newArr[] = (T[]) (new Object[capacity]);
            if (size != 0 && arr[0] == null) {
                for (int i = 0; i < arr.length - 1; i++) {
                    newArr[i] = arr[i + 1];
                }
                newArr[newArr.length - 1] = elem;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[newArr.length - 1] = elem;
            }
            arr = newArr.clone();
        } else {
            T newArr[] = (T[]) (new Object[arr.length + 1]);
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = elem;
            arr = newArr.clone();
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]+" ");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArrayDataType other = (ArrayDataType) obj;
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
        for (T elem : arr) {
            hash += hash * 31 + elem.hashCode();
        }
        return hash;
    }
}
