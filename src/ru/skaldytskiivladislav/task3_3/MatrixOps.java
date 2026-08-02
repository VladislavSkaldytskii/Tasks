package ru.skaldytskiivladislav.task3_3;

public class MatrixOps {

    public static void main(String[] args) {


        int[][] matrix = {
                {3, 5, 7, 9},
                {8, 2, 6, 4},
                {9, 1, 8, 5},
                {5, 7, 4, 3}
        };

        int totalSum = 0;
        int mainDiagonal = 0;
        int antiDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {

            int rowMax = matrix[i][0];

            for (int j = 0; j < matrix[i].length; j++) {

                totalSum += matrix[i][j];

                if (matrix[i][j] > rowMax) {
                    rowMax = matrix[i][j];
                }
            }

            System.out.println("Максимум строки " + i + ": " + rowMax);

            mainDiagonal += matrix[i][i];
            antiDiagonal += matrix[i][matrix.length - 1 - i];

        }

        System.out.println();

        for (int j = 0; j < matrix[0].length; j++) {

            int columnSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }

            System.out.println("Сумма столбца " + j + ": " + columnSum);

        }

        System.out.println("\nСумма всех элементов: " + totalSum);
        System.out.println("Главная диагональ: " + mainDiagonal);
        System.out.println("Побочная диагональ: " + antiDiagonal);

    }
}
