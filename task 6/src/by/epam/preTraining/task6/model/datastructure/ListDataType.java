package by.epam.preTraining.task6.model.datastructure;

import by.epam.preTraining.task6.model.datastructure.exception.DataStructureIndexOutOfBoundsException;
import by.epam.preTraining.task6.model.datastructure.exception.EmptyCollectionException;
import by.epam.preTraining.task6.model.datastructure.list.List;


public abstract class ListDataType<T> extends AbstractDataType<T> {
    protected List<T> list;

    protected void push(T e) throws DataStructureIndexOutOfBoundsException, EmptyCollectionException {
        if (fixedSize) {
            if (size >= capacity) {
                throw new DataStructureIndexOutOfBoundsException("Can't add element to already full fixed size collection");
            }
            if (size != 0 && list.getFirst() == null) {
                list.removeFirst();
            }
        }
        list.add(e);
        size++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataType<T> other = (ListDataType<T>) obj;
        return list.size() != list.size() && list.equals(other.list);
    }

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
        return list.toString();
    }
}
