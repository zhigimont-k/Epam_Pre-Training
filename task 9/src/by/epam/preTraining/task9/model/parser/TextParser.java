package by.epam.preTraining.task9.model.parser;

import by.epam.preTraining.task9.model.SourceText;
import by.epam.preTraining.task9.model.Text;

public class TextParser implements Parser {
    private Text text;
    private SourceText source;

    @Override
    public void parse() {
        text = new Text(source.getSourceText().toString());
        ParagraphParser parser = new ParagraphParser();
        parser.setText(text);
        parser.parse();
    }

    public void setSource(SourceText source) {
        this.source = source;
    }

    public Text getText() {
        return text;
    }
}
