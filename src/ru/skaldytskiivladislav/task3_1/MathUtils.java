package ru.skaldytskiivladislav.task3_1;

public class MathUtils {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int clamp(int value, int low, int higt) {
        return Math.max(low, Math.min(value, higt));
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
            throw new IllegalArgumentException("Степень не може быть отрицательной.");
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
        System.out.println("Clamp: " + clamp(14, 25, 34));
        System.out.println("Clamp: " + clamp(14, 25, 34));
        System.out.println("Высокостный 2000год : " + isLeapYear(2000));
        System.out.println("Высокостный 2023год : " + isLeapYear(2023));

        double fahrenheit = celsiusToFahrenheit(123);
        double celsius = fahrenheitToCelsius(177);
        System.out.println("123C = " + fahrenheit + "F");
        System.out.println("177F = " + celsius + "C");

        System.out.println("5! = " + factorial(5));
        System.out.println("6^2 = " + power(6, 2));

    }
}
