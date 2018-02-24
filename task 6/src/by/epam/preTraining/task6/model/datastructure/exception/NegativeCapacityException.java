package by.epam.preTraining.task6.model.datastructure.exception;

public class NegativeCapacityException extends Exception {
    public NegativeCapacityException() { }

    public NegativeCapacityException(String msg) {
        super(msg);
    }

    public NegativeCapacityException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NegativeCapacityException(Throwable cause) {
        super(cause);
    }
}
