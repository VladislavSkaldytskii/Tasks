package ru.skaldytskiivladislav.task3_2;

import java.util.Arrays;

public class ArraySearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            System.out.println("left = " + left + ", right = " + right + ", middle = " + middle + ", value = " + arr[middle]);
            if (arr[middle] == target) {
                return middle;
            }
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 11, 5, 6, 10, 9};
        int target = 5;

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Линейный поиск: число найдено по индексу " + index);
        } else {
            System.out.println("Линейный поиск: число не найдено.");
        }

        Arrays.sort(arr);
        System.out.println("\nОтсортированный массив: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nШаги бинарного поиска: ");
        index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Бинарный поиск: число найдено по индексу " + index);
        } else {
            System.out.println("Бинарный поиск: число не найдено");
        }
    }
}



