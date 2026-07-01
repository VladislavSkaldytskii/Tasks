package ru.skaldytskiivladislav.task2_5;

import java.util.Random;

public class DigitAnalyzer {

    public static void main(String[] args) {

        int number = 12345;
        int temp = number;
        int digitCount = 0;
        int digitSum = 0;
        int maxDigit = 0;
        int reversed = 0;

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

        boolean isPalindrome = number == reversed;

        System.out.printf("Число: %d%n", number);
        System.out.printf("Цифр: %d%n", digitCount);
        System.out.printf("Сумма цифр: %d%n", digitSum);
        System.out.printf("Максимальная цифра: %d%n", maxDigit);
        System.out.printf("Палиндром: %s%n",isPalindrome ? "Да" : "Нет");

    }
}
