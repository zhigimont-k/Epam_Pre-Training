package by.epam.preTraining.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    List<Sentence> sentences;
    private String s;

    public Paragraph(){
        sentences = new ArrayList<>();}

    public Paragraph(String s){
        sentences = new ArrayList<>();
        this.s = s;
    }

    public void addSentence(Sentence s){
        sentences.add(s);
    }

    @Override
    public String toString() {
        return s;
    }

    public String buildParagraph(){
        StringBuilder s = new StringBuilder();
        for (Sentence sent : sentences){
            s.append(sent.buildSentence());
        }
        return s.toString();
    }
}
