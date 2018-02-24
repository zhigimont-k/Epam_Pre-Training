package by.epam.preTraining.task6.model.datastructure.exception;

public class EmptyCollectionException extends Exception {
    public EmptyCollectionException() { }

    public EmptyCollectionException(String msg) {
        super(msg);
    }

    public EmptyCollectionException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public EmptyCollectionException(Throwable cause) {
        super(cause);
    }
}
