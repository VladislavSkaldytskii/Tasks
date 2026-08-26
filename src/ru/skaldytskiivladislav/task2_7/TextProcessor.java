package ru.skaldytskiivladislav.task2_7;

public class TextProcessor {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static String isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return "Ошибка: Email не должен быть пустым: ";
        } else if (email.contains(" ")) {
            return "Ошибка: пробелы запрещены";
        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            return "Ошибка: более одного символа @";
        }

        int atIndex = email.indexOf("@");

        if (atIndex <= 0) {
            return "Ошибка: Символ @ не может быть 1 символом.";
        }

        int doIndex = email.indexOf(".", atIndex);

        if (doIndex == -1) {
            return "Ошибка: после @ должна быть точка.";
        } else if (doIndex == atIndex + 1) {
            return "Ошибка: точка сразу после @. ";
        }

        return "Верно";

    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String cleanedWord = word.toLowerCase().replace(" ", "");
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }

    public static void main(String[] args) {
        System.out.println("Количество слов: " + countWords("Hello world"));
        System.out.println("Количество слов: " + countWords(""));
        System.out.println("Количество слов: " + countWords(null));
        System.out.println("Количество слов: " + countWords("A man a plan a canal Panama"));
        System.out.println();
        System.out.println(isValidEmail("test@mail.com"));
        System.out.println(isValidEmail("test@@mail.com"));
        System.out.println(isValidEmail("test test@mail.com"));
        System.out.println();
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }
}
