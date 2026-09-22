package ru.skaldytskiivladislav.task5_1;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Бонус: %.1f%n", getBonus());
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Бонус: %.1f%n", getBonus());
    }
}
