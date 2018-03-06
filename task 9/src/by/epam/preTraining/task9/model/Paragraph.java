package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends TextEntity {
    List<Sentence> sentences;

    public Paragraph() {
        sentences = new ArrayList<>();
    }

    public Paragraph(String string) {
        sentences = new ArrayList<>();
        this.string = string;
    }

    public void addSentence(Sentence s) {
        sentences.add(s);
    }

    @Override
    public String build() {
        StringBuilder s = new StringBuilder();
        for (Sentence sent : sentences) {
            s.append(sent.build());
        }
        return s.toString();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Paragraph other = (Paragraph) obj;
        return this.sentences.equals(other.sentences);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (Sentence s : sentences) {
            hash += hash * 31 + s.hashCode();
        }
        return hash;
    }
}
