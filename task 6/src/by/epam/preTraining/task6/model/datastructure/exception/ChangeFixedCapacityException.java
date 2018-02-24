package by.epam.preTraining.task6.model.datastructure.exception;

public class ChangeFixedCapacityException extends Exception {
    public ChangeFixedCapacityException() { }

    public ChangeFixedCapacityException(String msg) {
        super(msg);
    }

    public ChangeFixedCapacityException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ChangeFixedCapacityException(Throwable cause) {
        super(cause);
    }
}
