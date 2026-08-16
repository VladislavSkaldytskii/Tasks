package ru.skaldytskiivladislav.task2_5;

import java.util.Random;

public class DigitAnalyzer {

    public static void digitAnalyzer(int number) {
        int temp = Math.abs(number);
        int digitCount = 0;
        int digitSum = 0;
        int maxDigit = 0;
        int reversed = 0;
        boolean isPalindrome = Math.abs(number) == reversed;

        if (temp == 0) {
            System.out.printf("Число: %d%n", number);
            System.out.printf("Цифр: %d%n", 1);
            System.out.printf("Сумма цифр: %d%n", 0);
            System.out.printf("Максимальная цифра: %d%n", 0);
            System.out.printf("Палиндром: %s%n%n", "Да");
            return;
        }

        while (temp > 0) {
            int digit = temp % 10;
            digitCount++;
            digitSum += digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.printf("Число: %d%n", number);
        System.out.printf("Цифр: %d%n", digitCount);
        System.out.printf("Сумма цифр: %d%n", digitSum);
        System.out.printf("Максимальная цифра: %d%n", maxDigit);
        System.out.printf("Палиндром: %s%n%n", isPalindrome ? "Да" : "Нет");

    }

    public static void main(String[] args) {
        digitAnalyzer(12345);
        digitAnalyzer(-12345);
        digitAnalyzer(0);
        digitAnalyzer(121);
    }
}
