package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Word extends SentencePart {
    List<Letter> letters;

    public Word() {
        letters = new ArrayList<>();
    }

    public Word(String string) {
        this.string = string;
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

    public List<Letter> getLetters() {
        return letters;
    }
}
