package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Text extends TextEntity {
    private List<Paragraph> paragraphs;

    public Text(String string) {
        paragraphs = new ArrayList<>();
        this.string = string;
    }

    public void addParagraph(Paragraph p) {
        paragraphs.add(p);
    }

    @Override
    public String build() {
        StringBuilder s = new StringBuilder();
        for (Paragraph p : paragraphs) {
            s.append(p.build() + "\n");
        }
        return s.toString();
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Text other = (Text) obj;
        return this.paragraphs.equals(other.paragraphs);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Paragraph p : paragraphs) {
            hash += hash * 31 + p.hashCode();
        }
        return hash;
    }
}
