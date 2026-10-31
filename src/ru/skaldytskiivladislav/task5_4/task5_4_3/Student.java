package ru.skaldytskiivladislav.task5_4.task5_4_3;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;
    private int age;

    public Student(String name, double gpa, int age) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return String.format("Студент: %n" +
                "Имя: %s%n" +
                "ГПА: %.1f%n" +
                "Возраст: %d", name, gpa, age);
    }
}
