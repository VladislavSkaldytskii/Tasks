package ru.skaldytskiivladislav.task5_3.task5_3_1;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String department, double monthlySalary) {
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    void printPayslip() {
        super.printPayslip();
    }
}
