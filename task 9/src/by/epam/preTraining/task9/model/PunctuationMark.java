package by.epam.preTraining.task9.model;

public class PunctuationMark extends SentencePart {
    private String s;

    public PunctuationMark() {
    }

    public PunctuationMark(String s) {
        this.s = s;
    }

    public void setMark(String c) {
        this.s = s;
    }

    public String getMark() {
        return s;
    }

    @Override
    public String toString() {
        return s;
    }

    @Override
    public String build() {
        return s;
    }
}
