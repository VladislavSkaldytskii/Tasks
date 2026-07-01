package ru.skaldytskiivladislav.task2_5;

public class Patterns {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Квадрат");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Треугольник");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Пирамида");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
                
            }

            System.out.println();
        }
    }
}
