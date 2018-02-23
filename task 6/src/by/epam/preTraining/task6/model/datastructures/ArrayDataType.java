package by.epam.preTraining.task6.model.datastructures;

public abstract class ArrayDataType<T> extends AbstractDataType<T>{
    protected T arr[];

    @Override
    public String toString() {
        if (arr == null) {
            return "null";
        }
        int last = arr.length - 1;
        if (last == -1) {
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; ; i++) {
            s.append(arr[i]);
            if (i == last) {
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
