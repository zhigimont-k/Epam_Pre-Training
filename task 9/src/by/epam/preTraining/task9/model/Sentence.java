package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    public List<SentencePart> parts;
    private String s;

    public Sentence() {
        parts = new ArrayList<>();
    }

    public Sentence(String s) {
        this.s = s;
        parts = new ArrayList<>();
    }

    public void addWord(Word word) {
        parts.add(word);
    }

    public void addPunctuation(PunctuationMark mark) {
        parts.add(mark);
    }

    public void setString(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public String buildSentence() {
        StringBuilder s = new StringBuilder();
        int length = parts.size();
        for (int i = 0; i < length; i++) {
            s.append((i == length - 1 || parts.get(i + 1) instanceof Word) ?
                    (parts.get(i).build() + " ") :
                    (parts.get(i).build()));
        }
        return s.toString();
    }
}
