package ru.skaldytskiivladislav.task2_6;

public class StringAnalyzer {

    public static class TextAnalyzer {
        int spaces;
        int digits;
        int letters;

        public TextAnalyzer(int spaces, int digits, int letters) {
            this.spaces = spaces;
            this.digits = digits;
            this.letters = letters;
        }
    }

    public static TextAnalyzer analyzeText(String text) {
        int spaces = 0;
        int digits = 0;
        int letters = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                letters++;
            }
        }
        return new TextAnalyzer(spaces, digits, letters);
    }

    public static void printBasicInfo(String text) {
        System.out.printf("В верхнем регистре: \"%s\"%n", text.toUpperCase());
        System.out.printf("В нижнем регистре: \"%s\"%n", text.toLowerCase());
        System.out.printf("Без пробелов по краям: \"%s\"%n", text.trim());
    }

    public static void printSearchInfo(String text) {
        System.out.printf("Содержит \"World\": %s%n", text.contains("World") ? "да" : "нет");
        System.out.printf("Первое вхождение \"o\": индекс %d%n", text.indexOf('o'));
        System.out.printf("Последнее вхождение \"o\": индекс %d%n", text.lastIndexOf('o'));
    }

    public static void printTransformInfo(String text) {
        System.out.printf("Подстрока [0, 5]: \"%s\"%n", text.substring(0, 5));
        System.out.printf("После замены \"World\" на \"Java\": \"%s\"%n", text.replace("World", "Java"));
    }

    public static void printInfo(String text, TextAnalyzer textAnalyzer) {
        System.out.printf("Строка: \"%s\"%n", text);
        System.out.printf("Длина: %d%n", text.length());
        System.out.printf("Количество пробелов: %d%n", textAnalyzer.spaces);
        System.out.printf("Количество цифр: %d%n", textAnalyzer.digits);
        System.out.printf("Количество букв: %d%n", textAnalyzer.letters);

    }

    public static void main(String[] args) {
        String text = "Hello World! 123";
        printBasicInfo(text);
        printSearchInfo(text);
        printTransformInfo(text);
        printInfo(text, analyzeText(text));

    }
}
