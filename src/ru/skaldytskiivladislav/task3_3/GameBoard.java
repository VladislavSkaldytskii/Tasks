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
        int queens = 0;
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'Q') {
                queens++;
            }
        }
        if (queens > 1) {
            System.out.println("\nФерзи бьют друг друга по горизонтали.");
        } else {
            System.out.println("\nФерзи не бьют друг друга");
        }
    }
}
