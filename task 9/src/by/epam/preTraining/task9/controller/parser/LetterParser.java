package by.epam.preTraining.task9.controller.parser;

import by.epam.preTraining.task9.model.Letter;
import by.epam.preTraining.task9.model.Word;

public class LetterParser implements Parser {
    private Word word;
    private String s;

    public LetterParser() {
    }

    @Override
    public void parse() {
        word = new Word();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            word.addLetter(new Letter(s.substring(i, i + 1)));
        }
    }

    public Word getWord() {
        return word;
    }

    public void setString(String s) {
        this.s = s;
    }
}
