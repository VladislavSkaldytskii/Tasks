package ru.skaldytskiivladislav.task3_2;

import java.util.Arrays;

public class ArrayStats {
    public static void arrayStats(int[] numbers) {
        int summ = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int value : numbers) {
            summ += value;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        int even = 0;
        int odd = 0;

        for (int value : numbers) {
            if (value % 2 == 0) even++;
            else odd++;
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int value : numbers) {
            if (value > 0) positive++;
            else if (value < 0) negative++;
            else zero++;
        }
        double avg = (double) summ / numbers.length;

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.printf("Сумма: %d%n", summ);
        System.out.printf("Среднее: %.2f%n", avg);
        System.out.println("Макс: " + max);
        System.out.println("Мин: " + min);
        System.out.println("Четных: " + even);
        System.out.println("Нечетных: " + odd);
        System.out.println("Положительных: " + positive);
        System.out.println("Отрицательных: " + negative);
        System.out.println("Нулей: " + zero);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 32, 51, 48, 5, 8, 123, 11, 0};
        arrayStats(numbers);
    }
}
