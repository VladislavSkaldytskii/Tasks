package ru.skaldytskiivladislav.task3_2;

import java.util.Arrays;

public class ArrayMerge {

    public static int[] merge(int[] first, int[] second) {

        int[] result = new int[first.length + second.length];

        int i = 0;
        int j = 0;

        for (int k = 0; i < first.length && j < second.length; k++) {

            if (first[i] <= second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
        }
        int k = i + j;

        for (; i < first.length; i++, k++) {
            result[k] = first[i];
        }

        for (; j < second.length; j++, k++) {
            result[k] = second[j];
        }

        return result;
    }

    public static int[] evenElements(int[] arr) {

        int count = 0;

        for (int value : arr) {
            if (value % 2 == 0) {
                count++;
            }
        }

        int[] even = new int[count];

        int index = 0;

        for (int value : arr) {
            if (value % 2 == 0) {
                even[index++] = value;
            }
        }

        return even;

    }

    public static void main(String[] args) {

        int[] first = {1, 5, 7, 9, 13, 14};
        int[] second = {2, 4, 6, 8, 17};

        Arrays.sort(first);

        System.out.println("Первый массив: ");
        System.out.println(Arrays.toString(first));

        System.out.println("Второй массив: ");
        System.out.println(Arrays.toString(second));

        int[] merged = merge(first, second);

        System.out.println("После слияния: ");
        System.out.println(Arrays.toString(merged));

        int[] even = evenElements(merged);

        System.out.println("Четные элементы: ");
        System.out.println(Arrays.toString(even));
    }

}
