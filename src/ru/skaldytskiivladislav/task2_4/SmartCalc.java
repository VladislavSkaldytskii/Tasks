package ru.skaldytskiivladislav.task2_4;

public class SmartCalc {

    public static void smartCalc(int a, int b, char operator) {

        switch (operator) {
            case '+' -> System.out.printf("%d + %d = %d%n", a, b, a + b);
            case '-' -> System.out.printf("%d - %d = %d%n", a, b, a - b);
            case '*' -> System.out.printf("%d * %d = %d%n", a, b, a * b);
            case '/' -> {
                if (b == 0) {
                    System.out.printf("%d / %d = Ошибка: деления на 0%n", a, b);
                } else {
                    System.out.printf("%d / %d = %d%n", a, b, a / b);
                }
            }
            case '%' -> {
                if (b == 0) {
                    System.out.printf("%d %% %d = Ошибка: деления на 0%n", a, b);
                } else {
                    System.out.printf("%d %% %d = %d%n", a, b, a % b);
                }
            }
            default -> System.out.println("Неизвестная операция");
        }
    }

    public static void main(String[] args) {

        smartCalc(50, 50, '/');
        smartCalc(2, 0, '%');
    }
}
