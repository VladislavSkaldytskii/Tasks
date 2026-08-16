package ru.skaldytskiivladislav.task2_4;

public class GuessGame {

    public static void guessGame(int guess) {
        int secret = 42;

        if (guess < secret) {
            System.out.println("Меньше");
        } else if (guess > secret) {
            System.out.println("Больше");
        } else {
            System.out.println("Угадал! Это 42");
        }
    }

    public static void main(String[] args) {
        guessGame(30);
        guessGame(50);
        guessGame(42);
    }
}
