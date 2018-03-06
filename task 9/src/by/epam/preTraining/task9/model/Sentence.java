package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends TextEntity {
    public List<SentencePart> parts;
    public Sentence() {
        parts = new ArrayList<>();
    }

    public Sentence(String string) {
        this.string = string;
        parts = new ArrayList<>();
    }

    public void addWord(Word word) {
        parts.add(word);
    }

    public void addPunctuation(PunctuationMark mark) {
        parts.add(mark);
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String build() {
        StringBuilder s = new StringBuilder();
        int length = parts.size();
        for (int i = 0; i < length; i++) {
            s.append(parts.get(i).build());
            if ((i == length - 1 || parts.get(i + 1) instanceof Word)) {
                s.append(" ");
            }
        }
        return s.toString();
    }

    public List<SentencePart> getParts() {
        return parts;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sentence other = (Sentence) obj;
        return this.parts.equals(other.parts);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (SentencePart sp : parts) {
            hash += hash * 31 + sp.hashCode();
        }
        return hash;
    }
}
