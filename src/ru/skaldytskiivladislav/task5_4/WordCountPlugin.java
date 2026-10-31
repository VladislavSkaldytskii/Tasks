package ru.skaldytskiivladislav.task5_4;

public class WordCountPlugin implements Plugin {
    @Override
    public String getName() {
        return "WordCount";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String execute(String data) {
        if (data == null || data.trim().isEmpty()) {
            return "Слов: 0";
        }

        String[] words = data.trim().split("\\s+");
        return "Слов: " + words.length;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
