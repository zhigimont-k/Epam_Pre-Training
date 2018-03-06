package by.epam.preTraining.task9.model;

public class Symbol extends TextEntity {
    @Override
    public String build() {
        return string;
    }


    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + string.hashCode();
        return hash;
    }
}
