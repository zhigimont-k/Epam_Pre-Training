package by.epam.preTraining.task9.controller.parser;

import by.epam.preTraining.task9.model.Paragraph;

public class SentenceParser implements Parser {
    private Paragraph paragraph;
    private String s;
    private final static String REGEXP = "(?<=[.!?:])\\s";

    @Override
    public void parse() {
        paragraph = new Paragraph();
        String[] split = s.split(REGEXP);
        int length = split.length;
        SentencePartParser parser = new SentencePartParser();
        for (int i = 0; i < length; i++) {
            parser.setString(split[i]);
            parser.parse();
            paragraph.addSentence(parser.getSentence());
        }
    }


    public void setString(String s) {
        this.s = s.trim();
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }
}
