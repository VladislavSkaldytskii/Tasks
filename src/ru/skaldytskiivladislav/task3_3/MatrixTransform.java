package ru.skaldytskiivladislav.task3_3;

public class MatrixTransform {

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 4, 5, 6},
                {9, 5, 3, 8},
                {7, 4, 1, 2}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Транспонированная матрица: ");

        for (int[] row : transpose) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int row = 0;
        int column = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Строка: " + row);
        System.out.println("Столбец: " + column);
    }
}

