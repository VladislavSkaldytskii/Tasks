package ru.skaldytskiivladislav.task3_3;

public class GameBoard {

    public static void main(String[] args) {
        char[][] board = new char[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = '.';
                } else {
                    board[i][j] = '#';
                }
            }
        }

        System.out.println("\nШахматное поле: ");

        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < board[0].length; j++) {
            board[0][j] = 'Q';
        }
        System.out.println("\nПроверка атак ферзей: ");
        for (int j = 0; j < board[0].length; j++) {
            for (int k = j + 1; k < board[0].length; k++) {
                if (board[0][j] == 'Q' && board[0][k] == 'Q') {
                    System.out.printf("Ферзи, на позициях (0, %d) и (0, %d)  бьют друга друга%n", j, k);
                }
            }
        }
    }
}

