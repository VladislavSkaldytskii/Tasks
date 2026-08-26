package ru.skaldytskiivladislav.task3_1;

public class MathUtils {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int clamp(int value, int low, int high) {
        return Math.max(low, Math.min(value, high));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не существует.");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }

        long result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Минимум: " + min(14, 25));
        System.out.println("Максимум: " + max(14, 25));
        System.out.println();
        System.out.println("Clamp: " + clamp(14, 25, 34));
        System.out.println("Clamp: " + clamp(14, 10, 20));
        System.out.println();
        System.out.println("Високосный 2000год : " + isLeapYear(2000));
        System.out.println("Високосный 2023год : " + isLeapYear(2023));
        System.out.println();
        System.out.printf("123C = %.1fF%n", celsiusToFahrenheit(123));
        System.out.printf("177F = %.1fC%n", fahrenheitToCelsius(177));
        System.out.println();
        System.out.println("5! = " + factorial(5));
        System.out.println("6^2 = " + power(6, 2));

    }
}
