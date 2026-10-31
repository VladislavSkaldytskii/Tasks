package ru.skaldytskiivladislav.task5_3.task5_3_1;

public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double commissionPercent;
    private double salesAmount;

    public CommissionEmployee(String name, String department, double baseSalary, double commissionPercent, double salesAmount) {
        super(name, department);
        this.baseSalary = baseSalary;
        this.commissionPercent = commissionPercent;
        this.salesAmount = salesAmount;
    }

    @Override
    double calculateSalary() {
        return baseSalary + salesAmount * commissionPercent / 100;
    }

    @Override
    void printPayslip() {
        super.printPayslip();
    }
}
