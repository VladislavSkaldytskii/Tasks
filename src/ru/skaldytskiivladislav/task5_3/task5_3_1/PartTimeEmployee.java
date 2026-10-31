package ru.skaldytskiivladislav.task5_3.task5_3_1;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, String department, double hourlyRate, double hoursWorked) {
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void printPayslip() {
        super.printPayslip();
    }
}
