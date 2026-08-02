package ru.skaldytskiivladislav.task2_1;

public class StudentProfile {

    private byte estimation;
    private short idNumber;
    private int birthYear;
    private long numberPhone;
    private float avgScore;
    private double finalScore;
    private boolean isTuitionPaid;
    private char firstLetterName;

    public StudentProfile(byte estimation, short idNumber, int birthYear, long numberPhone, double finalScore, float avgScore, boolean isTuitionPaid, char firstLetterName) {

        this.estimation = estimation;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.numberPhone = numberPhone;
        this.finalScore = finalScore;
        this.avgScore = avgScore;
        this.isTuitionPaid = isTuitionPaid;
        this.firstLetterName = firstLetterName;
    }

    @Override
    public String toString() {
        return "\nПрофиль студента:" +
                "\nОценка: " + estimation +
                "\nНомер студенческого билета: " + idNumber +
                "\nГод рождения: " + birthYear +
                "\nНомер телефона: " + numberPhone +
                "\nСредняя оценка: " + avgScore +
                "\nИтоговый балл: " + finalScore +
                "\nОплата обучения: " + isTuitionPaid +
                "\nПервая буква имени: " + firstLetterName;
    }

    public static void main(String[] args) {

        StudentProfile studentProfile = new StudentProfile(
                (byte) 88,
                (short) 12345,
                1995,
                723456870L,
                8.7,
                8.8f,
                true,
                'В'
        );

        System.out.println(studentProfile);

    }
}