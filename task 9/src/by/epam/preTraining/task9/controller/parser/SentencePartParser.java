package by.epam.preTraining.task9.controller.parser;

import by.epam.preTraining.task9.model.PunctuationMark;
import by.epam.preTraining.task9.model.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentencePartParser implements Parser {
    private Sentence sentence;
    private String s;
    private final static String REGEXP = "[\\w-']+|[^\\w\\s]+";
    private final static String WORD_REGEXP = "\\w(?<!\\d)[\\w'-]*";

    public SentencePartParser() {
    }

    public void setString(String s) {
        this.s = s.trim();
    }

    @Override
    public void parse() {
        sentence = new Sentence();
        List<String> allMatches = new ArrayList<>();
        Matcher m = Pattern.compile(REGEXP).matcher(s);
        while (m.find()) {
            allMatches.add(m.group());
        }
        for (String s : allMatches) {
            s.trim();
        }
        LetterParser lp = new LetterParser();
        int length = allMatches.size();
        for (int i = 0; i < length; i++) {
            if (allMatches.get(i).matches(WORD_REGEXP)) {
                lp.setString(allMatches.get(i));
                lp.parse();
                sentence.addWord(lp.getWord());
            } else {
                sentence.addPunctuation(new PunctuationMark(allMatches.get(i)));
            }
        }
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public Sentence getSentence() {
        return sentence;
    }
}
