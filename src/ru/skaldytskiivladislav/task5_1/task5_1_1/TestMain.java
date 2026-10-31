package ru.skaldytskiivladislav.task5_1.task5_1_1;

public class TestMain {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Пётр",
                50000
        );

        Manager manager1 = new Manager(
                "Иван",
                80000,
                15000
        );

        Manager manager2 = new Manager(
                "Мария",
                90000,
                20000
        );

        Developer developer1 = new Developer(
                "Алексей",
                100000,
                "Java",
                3
        );

        Developer developer2 = new Developer(
                "Ольга",
                110000,
                "Python",
                5
        );

        Intern intern1 = new Intern(
                "Дмитрий",
                50000
        );

        Intern intern2 = new Intern(
                "Анна",
                60000
        );

        Employee[] employees = {
                employee,
                manager1,
                manager2,
                developer1,
                developer2,
                intern1,
                intern2
        };

        double totalSalary = 0;

        for (Employee employeeItem : employees) {
            employeeItem.getInfo();
            totalSalary += employeeItem.getSalary();
        }

        System.out.printf(
                "%nОбщий фонд оплаты труда: %.2f руб.%n",
                totalSalary
        );
        System.out.println("-".repeat(55));
    }
}
