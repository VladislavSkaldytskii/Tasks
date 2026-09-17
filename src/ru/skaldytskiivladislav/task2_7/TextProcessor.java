package ru.skaldytskiivladislav.task2_7;

public class TextProcessor {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            //"Ошибка: Email не должен быть пустым: ");
            return false;
        } else if (email.contains(" ")) {
            return false; //"Ошибка: пробелы запрещены";
        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            return false; //"Ошибка: более одного символа @";
        } else if (email.contains("..")) {
            return false; // Не должно быть 2х последовательных '.'
        }

        int atIndex = email.indexOf("@");
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (atIndex <= 0) {
            return false;//"Ошибка: Символ @ не может быть первым символом.";
        }

        int doIndex = email.indexOf(".", atIndex);

        if (doIndex == -1) {
            return false; //"Ошибка: после @ должна быть точка.";
        } else if (doIndex == atIndex + 1) {
            return false;//Ошибка: точка сразу после @. ";
        } else if (localPart.startsWith("-") || localPart.endsWith("-")) {
            return false; // Не может начинаться и оканчиваться на '-'
        }

        for (char c : localPart.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '.' || c == '_' || c == '%' || c == '+' || c == '-')) {
                return false; // локальная часть состоит только из букв, цифр, '.', '_', '%', '+', '-'
            }
        }

        for (char c : domainPart.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '.' || c == '-')) {
                return false; // доменная часть состоит только из букв, цифр, '.', '_'
            }
        }

        String[] domainParts = domainPart.split("\\.");
        String lastPart = domainParts[domainParts.length - 1];
        if (lastPart.length() < 2) {
            return false;
        }

        for (char c : lastPart.toCharArray()) {
            if (!(Character.isLetter(c))) {
                return false; //Корректный домен, т.е. должно заканчиваться на '.' и как минимум 2 буквы
            }
        }
        return true;
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
        System.out.println(isValidEmail("testtest@mail..com"));
        System.out.println(isValidEmail("testtest@mail.c"));
        System.out.println(isValidEmail("-testtest@mail.com"));
        System.out.println(isValidEmail("-testt%est@mail.com"));
        System.out.println(isValidEmail("te%st+@mail.co.uk"));

        System.out.println();
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }
}
