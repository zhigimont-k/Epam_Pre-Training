package by.epam.preTraining.task7.model.exception;

public class EmptyCollectionException extends Exception {
    public EmptyCollectionException() {
        super();
    }

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
