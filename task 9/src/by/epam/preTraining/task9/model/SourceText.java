package by.epam.preTraining.task9.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SourceText {
    private StringBuilder source;
    private static SourceText instance;
    private String path;

    private SourceText() {
    }

    public void loadText(String path) throws IOException {
        if (source == null) {
            source = new StringBuilder();
        } else {
            clearData();
        }
        this.path = path;
        source.append(readSourceFile());
    }

    private String readSourceFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    }

    public static SourceText getInstance() {
        if (instance == null) {
            instance = new SourceText();
        }
        return instance;
    }

    public StringBuilder getSourceText() {
        return source;
    }

    public String getPath() {
        return path;
    }

    private void clearData() {
        source.delete(0, source.length() - 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceText other = (SourceText) obj;
        return (source.toString().equals(other.source.toString()) && path.equals(other.path));
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + source.hashCode() + path.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return path;
    }

    public StringBuilder getSource() {
        return source;
    }
}
