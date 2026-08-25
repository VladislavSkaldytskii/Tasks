package ru.skaldytskiivladislav.task2_6;

public class TextStats {
    public static class TextAnalysis {
        int wordCount;
        int charsWithoutSpaces;
        String longestWord;
        String shortestWord;
        double averageLength;

        public TextAnalysis(int wordCount, int charsWithoutSpaces, String shortestWord, String longestWord, double averageLength) {
            this.wordCount = wordCount;
            this.charsWithoutSpaces = charsWithoutSpaces;
            this.shortestWord = shortestWord;
            this.longestWord = longestWord;
            this.averageLength = averageLength;
        }
    }

    public static TextAnalysis textAnalysis(String text) {
        String[] words = text.split(" ");
        int wordCount = words.length;
        int charsWithoutSpaces = text.replaceAll(" ", "").length();
        String longestWord = words[0];
        String shortestWord = words[0];
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            } else if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

        }
        double averageLength = (double) totalLength / wordCount;
        return new TextAnalysis(wordCount, charsWithoutSpaces, shortestWord, longestWord, averageLength);
    }

    public static void printInfo(String text, TextAnalysis textAnalysis) {
        System.out.printf("Текст: \"%s\"%n", text);
        System.out.printf("Количество слов: %d%n", textAnalysis.wordCount);
        System.out.printf("Количество символов без пробелов: %d%n", textAnalysis.charsWithoutSpaces);
        System.out.printf("Самое длинное слово: %s%n", textAnalysis.longestWord);
        System.out.printf("Самое короткое слово: %s%n", textAnalysis.shortestWord);
        System.out.printf("Средняя длина слова: %.2f%n", textAnalysis.averageLength);
    }

    public static void main(String[] args) {
        String text = "A man a plan a canal Panama";
        printInfo(text, textAnalysis(text));
    }
}
