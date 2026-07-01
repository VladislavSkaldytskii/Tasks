package ru.skaldytskiivladislav.task2_4;

public class GradeConverter {
    public static void convertSwitch(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Недопустимая оценка");
            return;
        }
        switch (score / 10) {
            case 10, 9 -> System.out.println("Отлично");
            case 8, 7 -> System.out.println("Хорошо");
            case 6, 5 -> System.out.println("Удовлетворительно");
            default -> System.out.println("Неудовлетворительно");

        }
        ;
    }

    public static void convertIf(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("Отлично");
        } else if (score >= 70 && score <= 80) {
            System.out.println("Хорошо");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Удовлетворительно");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Недопустимая оценка");
        }

    }

    public static void main(String[] args) {
        int[] scores = {95, 80, 65, 45, 100, 0, -5, 101};
        for (int score : scores) {

            System.out.printf("Оценка: %d%n", score);

            convertSwitch(score);
            convertIf(score);


        }
    }
}

