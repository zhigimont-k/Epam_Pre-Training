package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Paragraph> paragraphs;
    private StringBuilder string;

    public Text() {
        paragraphs = new ArrayList<>();
    }

    public Text(String s) {
        paragraphs = new ArrayList<>();
        string = new StringBuilder(s);
    }

    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public void addParagraph(Paragraph p) {
        paragraphs.add(p);
    }

    @Override
    public String toString() {
        return string.toString();
    }

    public String buildText() {
        StringBuilder s = new StringBuilder();
        for (Paragraph p : paragraphs) {
            s.append(p.buildParagraph() + "\n");
        }
        return s.toString();
    }
}
