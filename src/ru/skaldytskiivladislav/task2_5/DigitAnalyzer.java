package ru.skaldytskiivladislav.task2_5;

public class DigitAnalyzer {

    public static class NumberAnalysis {
        int digitCount;
        int digitSum;
        int maxDigit;

        public NumberAnalysis(int digitCount, int digitSum, int maxDigit) {
            this.digitCount = digitCount;
            this.digitSum = digitSum;
            this.maxDigit = maxDigit;
        }
    }

    public static NumberAnalysis analyzeNumber(int number) {
        int temp = Math.abs(number);
        int digitCount = 0;
        int digitSum = 0;
        int maxDigit = 0;

        if (temp == 0) {
            digitCount = 1;
        }

        while (temp > 0) {
            int digit = temp % 10;
            digitCount++;
            digitSum += digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }
        return new NumberAnalysis(digitCount, digitSum, maxDigit);
    }

    public static boolean isPalindrome(int number) {
        int temp = Math.abs(number);
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return Math.abs(number) == reversed;

    }

    public static void printResults(int number, NumberAnalysis numberAnalysis, boolean isPalindrome) {
        System.out.printf("Число: %d%n", number);
        System.out.printf("Цифр: %d%n", numberAnalysis.digitCount);
        System.out.printf("Сумма цифр: %d%n", numberAnalysis.digitSum);
        System.out.printf("Максимальная цифра: %d%n", numberAnalysis.maxDigit);
        System.out.printf("Палиндром: %s%n%n", isPalindrome ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        int number = 121;
        printResults(number, analyzeNumber(number), isPalindrome(number));
    }
}
