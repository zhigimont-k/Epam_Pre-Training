package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Word extends SentencePart {
    List<Letter> letters;
    String string;

    public Word() {
        letters = new ArrayList<>();
    }

    public Word(String s) {
        string = s;
        letters = new ArrayList<>();
    }

    public void addLetter(Letter c) {
        letters.add(c);
    }

    @Override
    public String build() {
        StringBuilder s = new StringBuilder();
        for (Letter l : letters) {
            s.append(l);
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return string;
    }

    public List<Letter> getLetters() {
        return letters;
    }
}
