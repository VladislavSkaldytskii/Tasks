package ru.skaldytskiivladislav.task2_6;

public class Palindrome {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        String cleaned = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        boolean isPalindrome = cleaned.equals(reversed);

        System.out.printf("Строка: \"%s \"%n", text);
        System.out.printf("После очистки: \"%s\"%n", cleaned);
        System.out.printf("Палиндром: %s%n", isPalindrome ? "да" : "нет");
    }
}
