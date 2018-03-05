package by.epam.preTraining.task9.model.task;

import by.epam.preTraining.task9.model.*;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private static final String VOWELS = "aeiouy";
    //task 5
    public static Text swapWords(Text text) {
        for (Paragraph p : text.getParagraphs()) {
            for (Sentence s : p.getSentences()) {
                SentencePart temp = s.getParts().get(findLastWordPosition(s));
                s.getParts().set(findLastWordPosition(s), s.getParts().get(0));
                s.getParts().set(0, temp);
            }
        }
        return text;
    }

    private static int findLastWordPosition(Sentence sent) {
        int lastPos = sent.getParts().size() - 2;
        for (int i = lastPos; i >= 0; i++) {
            if (sent.getParts().get(i) instanceof Word) {
                return i;
            }
        }
        return -1;
    }

    //task 12
    public static Text removeWords(Text text, int wordLength) {
        List<SentencePart> toRemove = new ArrayList<>();
        for (Paragraph p : text.getParagraphs()) {
            for (Sentence s : p.getSentences()) {
                for (SentencePart sp : s.getParts()){
                    if (sp instanceof Word && ((Word) sp).getLetters().size() == wordLength &&
                            isConsonant(findFirstLetter((Word)sp))){
                        toRemove.add(sp);
                    }
                }
                s.getParts().removeAll(toRemove);
            }
        }
        return text;
    }

    private static Letter findFirstLetter(Word word) {
        return word.getLetters().get(0);
    }

    private static boolean isConsonant(Letter l){
        return !VOWELS.contains(l.getLetter().toLowerCase());
    }
}
