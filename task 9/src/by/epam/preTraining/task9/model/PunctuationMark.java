package by.epam.preTraining.task9.model;

public class PunctuationMark extends Symbol {

    public PunctuationMark() {
    }

    public PunctuationMark(String string) {
        this.string = string;
    }

    public void setMark(String string) {
        this.string = string;
    }

    public String getMark() {
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PunctuationMark other = (PunctuationMark) obj;
        return this.string.equals(other.string);
    }
}
