package ru.skaldytskiivladislav.task5_3.task5_3_1;

public class TestMain {
    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.printPayslip();
        }
    }

    public static double totalSalary(Employee[] employees) {
        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new CommissionEmployee("Анна", "EMP001", 50000, 12, 50000),
                new PartTimeEmployee("Борис", "EMP002", 250, 80),
                new FullTimeEmployee("Виктор", "EMP003", 75000),
                new CommissionEmployee("Галина", "EMP004", 30000, 15, 10000),
                new PartTimeEmployee("Дмитрий", "EMP005", 300, 60)
        };

        printAll(employees);
        System.out.println();
        System.out.println("Общий фонд оплаты труда: " + totalSalary(employees));
    }
}
