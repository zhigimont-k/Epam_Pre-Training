package by.epam.preTraining.task9.controller;

import by.epam.preTraining.task9.model.SourceText;
import by.epam.preTraining.task9.model.Text;
import by.epam.preTraining.task9.model.parser.TextParser;
import by.epam.preTraining.task9.model.task.Task;
import by.epam.preTraining.task9.view.View;

import java.io.IOException;

public class Controller {
    private static final String PATH = "test.txt";
    private static final String WORKING_DIRECTORY = System.getProperty("user.dir");

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        SourceText source = SourceText.getInstance();
        try {
            source.loadText(WORKING_DIRECTORY + "\\" + PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        View.print("----------Original text:\n" + source.getSourceText());
        Text text = parseText(source);
        View.print("\n----------Parsed and rebuilt text:\n" + text.build());
        Text swapText = parseText(source);
        View.print("----------Text after swapping the first and the last words in sentences:\n" +
                Task.swapWords(swapText).build());
        Text removedWordsText = parseText(source);
        int wordLength = 5;
        View.print("----------Text after removing words of length " + wordLength + " that begin with a consonant:\n" +
                Task.removeWords(removedWordsText, wordLength).build());

    }

    private static Text parseText(SourceText source) {
        TextParser parser = new TextParser();
        parser.setSource(source);
        parser.parse();
        return parser.getText();
    }
}
