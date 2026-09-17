package ru.skaldytskiivladislav.task4_2;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(Matrix other) {
        this(other.data);
    }

    public int get(int i, int j) {
        return data[i][j];
    }

    public void set(int i, int j, int value) {
        data[i][j] = value;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", data[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(rows, other.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);

        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(0, 2, 3);
        matrix1.set(1, 0, 4);
        matrix1.set(1, 1, 5);
        matrix1.set(1, 2, 6);

        System.out.println("Matrix 1: ");
        matrix1.printMatrix();

        System.out.println("Элемент [0][1]: " + matrix1.get(0, 1));

        int[][] array = {
                {7, 8},
                {9, 10}
        };

        Matrix matrix2 = new Matrix(array);

        System.out.println("Matrix 2: ");
        matrix2.printMatrix();

        Matrix matrix3 = new Matrix(2, 2);
        matrix3.set(0, 0, 1);
        matrix3.set(0, 1, 2);
        matrix3.set(1, 0, 3);
        matrix3.set(1, 1, 4);

        Matrix matrix4 = new Matrix(2, 2);
        matrix4.set(0, 0, 5);
        matrix4.set(0, 1, 6);
        matrix4.set(1, 0, 7);
        matrix4.set(1, 1, 8);

        System.out.println("Matrix 3: ");
        matrix3.printMatrix();

        System.out.println("Matrix 4: ");
        matrix4.printMatrix();

        Matrix sum = matrix3.add(matrix4);
        sum.printMatrix();

        Matrix multiplication = matrix3.multiply(matrix4);
        multiplication.printMatrix();

        System.out.println("Оригинал: ");
        matrix3.printMatrix();

        System.out.println("Копия: ");
        Matrix copy = new Matrix(matrix3);
        copy.printMatrix();
    }
}
