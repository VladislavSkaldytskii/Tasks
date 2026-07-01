package ru.skaldytskiivladislav.task2_4;

public class GuessGame {

    public static void main(String[] args) {

        int secret = 42;
        int guess = 42;

        if (guess < secret) {

            System.out.println("Меньше");
        } else if (guess > secret) {

            System.out.println("Больше");
        } else {

            System.out.println("Угадал! Это 42");
        }
    }
}
