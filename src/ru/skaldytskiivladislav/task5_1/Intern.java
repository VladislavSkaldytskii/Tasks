package ru.skaldytskiivladislav.task5_1;

public class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 0.7;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
