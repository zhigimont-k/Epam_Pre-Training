package by.epam.preTraining.task5.container.model;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    public int length;

    public DynamicArray() {
        arr = (T[]) new Object[0];
        length = arr.length;
    }

    public DynamicArray(T... ob) {
        arr = (T[]) new Object[ob.length];
        for (int i = 0; i < ob.length; i++) {
            arr[i] = ob[i];
        }
        length = arr.length;
    }

    public void add(T... ob) {
        T[] newArr = (T[]) new Object[arr.length + ob.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ob.length; i++) {
            newArr[arr.length + i] = ob[i];
        }
        arr = newArr.clone();
        length = arr.length;
    }

    public void addAt(int index, T... ob) throws ArrayIndexOutOfBoundsException, ClassCastException {
        T[] newArr = (T[]) new Object[arr.length + ob.length];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ob.length; i++) {
            newArr[index + i] = ob[i];
        }
        for (int i = index; i < arr.length; i++) {
            newArr[i + ob.length] = arr[i];
        }
        arr = newArr.clone();
        length = arr.length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public T getAt(int index) throws ArrayIndexOutOfBoundsException {
        return arr[index];
    }

    public void setAt(int index, T ob) throws ArrayIndexOutOfBoundsException {
        arr[index] = ob;
    }

    public void removeAt(int index) throws ArrayIndexOutOfBoundsException, ClassCastException {
        T[] newArr = (T[]) new Object[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr.clone();
        length = arr.length;
    }

    public void removeAll() throws ArrayIndexOutOfBoundsException {
        arr = (T[]) new Object[0];
        length = arr.length;
    }

    public int indexOf(T ob) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ob)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T ob) {
        return indexOf(ob) != -1;
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
        DynamicArray other = (DynamicArray) obj;
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

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < arr.length && arr[currentIndex] != null;
            }

            @Override
            public T next() {
                return arr[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
