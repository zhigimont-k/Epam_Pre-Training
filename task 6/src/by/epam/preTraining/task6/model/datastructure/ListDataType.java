package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.EmptyCollectionException;

import java.util.List;

public abstract class ListDataType<T> extends AbstractDataType<T> {
    protected List<T> list;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataType<T> other = (ListDataType<T>) obj;
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
    public abstract T peek() throws EmptyCollectionException;


    @Override
    public int hashCode() {
        int hash = 1;
        for (T elem : list) {
            hash += hash * 31 + elem.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        if (list == null) {
            return "null";
        }
        int last = list.size() - 1;
        if (last == -1) {
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; ; i++) {
            s.append(list.get(i));
            if (i == last) {
                return s.append("]").toString();
            }
            s.append(", ");
        }
    }
}
