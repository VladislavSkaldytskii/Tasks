package ru.skaldytskiivladislav.task2_6;

public class TextStats {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

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

        System.out.printf("Текст: \"%s\"%n", text);
        System.out.printf("Количество слов: %d%n", wordCount);
        System.out.printf("Количество символов без пробелов: %d%n", charsWithoutSpaces);
        System.out.printf("Самое длинное слово: %s%n", longestWord);
        System.out.printf("Самое короткое слово: %s%n", shortestWord);
        System.out.printf("Средняя длина слова: %.2f%n", averageLength);

    }
}
