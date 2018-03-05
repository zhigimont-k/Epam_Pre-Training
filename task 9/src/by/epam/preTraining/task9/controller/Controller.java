package by.epam.preTraining.task9.controller;

import by.epam.preTraining.task9.model.SourceText;
import by.epam.preTraining.task9.model.Text;
import by.epam.preTraining.task9.controller.parser.TextParser;
import by.epam.preTraining.task9.view.View;

import java.io.IOException;

public class Controller {
    private static final String PATH = "test.txt";
    private static final String WORKING_DIRECTORY = System.getProperty("user.dir");

    public static void main(String[] args) {
        Controller c = new Controller();
    }

    Controller() {
        run();
    }

    private void run() {
        SourceText source = SourceText.getInstance();
        try {
            source.loadText(WORKING_DIRECTORY + "\\" + PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        View.print("Original text:\n" + source.getSourceText());
        Text text = parseText(source);
        View.print("\nParsed and rebuilt text:\n" + text.buildText());

    }

    private Text parseText(SourceText source) {
        TextParser parser = new TextParser();
        parser.setSource(source);
        parser.parse();
        return parser.getText();
    }
}
