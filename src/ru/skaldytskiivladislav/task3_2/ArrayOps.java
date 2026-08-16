package ru.skaldytskiivladislav.task3_2;

import java.util.Arrays;

public class ArrayOps {

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void shiftRight(int[] arr) {
        int array = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Прямой порядок: " + Arrays.toString(arr));

        System.out.print("Обратный порядок: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        reverse(arr);
        System.out.println("После переворота: " + Arrays.toString(arr));
        shiftRight(arr);
        System.out.println("После сдвига в право: " + Arrays.toString(arr));
    }
}
