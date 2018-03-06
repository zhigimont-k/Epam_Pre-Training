package by.epam.preTraining.task9.model;

public abstract class TextEntity {
    protected String string;
    public abstract String build();

    @Override
    public String toString() {
        return string;
    }
}
