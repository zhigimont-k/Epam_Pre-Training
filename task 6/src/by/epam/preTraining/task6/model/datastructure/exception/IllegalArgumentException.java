package by.epam.preTraining.task6.model.datastructure.exception;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException() {
        super();
    }

    public IllegalArgumentException(String msg) {
        super(msg);
    }

    public IllegalArgumentException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
