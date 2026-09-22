package ru.skaldytskiivladislav.task5_1;

public class Employee {
    private String name;
    private final int id;
    protected double salary;

    private static int nextId = 1;

    public Employee(String name, double salary) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("=".repeat(55));
        System.out.printf("№: %d%n" +
                "ФИО: %s%n" +
                "Зарплата: %.2f%n", getId(), getName(), getSalary());
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
