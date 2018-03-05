package by.epam.preTraining.task9.model;

public class Letter {
    private String c;

    public Letter(){}
    public Letter(String c){
        this.c = c;
    }

    public void setLetter(String c) {
        this.c = c;
    }

    public String getLetter() {
        return c;
    }

    @Override
    public String toString() {
        return c;
    }
}
