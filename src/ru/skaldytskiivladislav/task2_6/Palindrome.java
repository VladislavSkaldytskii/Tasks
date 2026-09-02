package ru.skaldytskiivladislav.task2_6;

public class Palindrome {

    public static String cleanedText(String text) {
        return text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
    }

    public static boolean isPalindrome(String text) {
        String cleaned = cleanedText(text);
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void printInfo(String text) {
        String cleaned = cleanedText(text);
        boolean isPalindrome = isPalindrome(text);

        System.out.printf("Строка: \"%s \"%n", text);
        System.out.printf("После очистки: \"%s\"%n", cleaned);
        System.out.printf("Палиндром: %s%n", isPalindrome ? "да" : "нет");
    }

    public static void main(String[] args) {
        String text = "A man a plan a canal Panama";

        printInfo(text);
    }
}
