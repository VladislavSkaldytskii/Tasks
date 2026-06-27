package ru.skaldytskiivladislav.Task2;

public class StudentProfile {
    public static void main(String[] args) {

        byte estimation = 88;
        short iDNumber = 12345;
        int birthYear = 1995;
        long numberPhone = 723456870L;
        float avgScore = 8.8f;
        double finalScore = 8.87;
        boolean tuitionPaid = true;
        char firstLetterName = 'В';

        System.out.println("Профиль студента: ");
        System.out.println("Оценка: " + estimation);
        System.out.println("Номер студенческого билета: " + iDNumber);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("Номер телефона: " + numberPhone);
        System.out.println("Средняя оценка: " + avgScore);
        System.out.println("Итоговый балл: " + finalScore);
        System.out.println("Оплата обучения: " + tuitionPaid);
        System.out.println("Первая буква имени: " + firstLetterName);


    }
}