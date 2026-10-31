package ru.skaldytskiivladislav.task5_3.task5_3_1;

public abstract class Employee {
    private static int nextId = 1;

    private String name;
    private final int id;
    private String department;

    public Employee(String name, String department) {
        this.id = nextId++;
        this.name = name;
        this.department = department;
    }

    abstract double calculateSalary();

    void printPayslip() {;
        System.out.printf("Имя: %s%n" +
                "Отдел: %s%n" +
                "Начисленная зарплата: %.2f%n", name, department, calculateSalary());
    }
}
