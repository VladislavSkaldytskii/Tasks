package ru.skaldytskiivladislav.task3_3;

public class PascalTriangle {

    public static int[][] createPascalTriangle(int n) {
        int[][] pascal = new int[n][];
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return pascal;
    }

    public static void printPascalTriangle(int[][] pascal) {
        for (int i = 0; i < pascal.length; i++) {

            for (int space = 0; space < pascal.length - i - 1; space++) {
                System.out.print("  ");
            }
            for (int value : pascal[i]) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    public static void sumPascalTriangle(int[][] pascal) {
        System.out.println("\nСуммы строк:");
        for (int i = 0; i < pascal.length; i++) {
            int sum = 0;
            for (int value : pascal[i]) {
                sum += value;
            }

            int expected = 1 << i;
            System.out.println("Строка " + i + ": сумма = " + sum + ", 2^" + i + " = " + expected);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int[][] pascal = createPascalTriangle(n);
        printPascalTriangle(pascal);
        sumPascalTriangle(pascal);
    }
}
