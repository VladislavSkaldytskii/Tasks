package ru.skaldytskiivladislav.task4_1;

import ru.skaldytskiivladislav.task2_6.FormattedTable;

import java.util.List;

public class Student {
    private final String name;
    private final String group;
    private final int age;
    private final double grade;

    public Student(String name, String group, int age, double grade) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("=".repeat(55));
        System.out.printf("Имя: %-10s | Возраст %-2d | Оценка: %.1f | Группа: %s%n", name, age, grade, group);

    }

    public boolean isExcellent() {
        return grade >= 4.5;
    }

    public boolean canGraduate(int minimumAge) {
        return age >= minimumAge;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Иван Иванов", "1-A", 25, 4.5);
        Student student2 = new Student("Михаил Смирнов", "1-A", 19, 4.1);
        Student student3 = new Student("Василий Петров", "1-A", 17, 4.9);

        student1.printInfo();
        System.out.println("Отличник: " + student1.isExcellent());
        System.out.println("Может выпуститься: " + student1.canGraduate(18));

        student2.printInfo();
        System.out.println("Отличник: " + student2.isExcellent());
        System.out.println("Может выпуститься: " + student2.canGraduate(18));

        student3.printInfo();
        System.out.println("Отличник: " + student3.isExcellent());
        System.out.println("Может выпуститься: " + student3.canGraduate(18));

    }
}
