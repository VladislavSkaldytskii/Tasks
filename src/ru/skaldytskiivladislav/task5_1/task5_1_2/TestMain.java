package ru.skaldytskiivladislav.task5_1.task5_1_2;

import ru.skaldytskiivladislav.task5_1.task5_1_1.Developer;
import ru.skaldytskiivladislav.task5_1.task5_1_1.Employee;
import ru.skaldytskiivladislav.task5_1.task5_1_1.Intern;
import ru.skaldytskiivladislav.task5_1.task5_1_1.Manager;

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

        Product product1 = new Product(
                1,
                "Молоко",
                89.90
        );

        Product product2 = new Product(
                1,
                "Хлеб",
                59.90
        );

        Product product3 = new Product(
                2,
                "Молоко",
                89.90
        );

        DiscountedProduct product4 = new DiscountedProduct(
                3,
                "Шоколад",
                200,
                25
        );

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        System.out.println();

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        System.out.println();

        System.out.println("Итоговая цена: "
                + product4.getFinalPrice());
    }
}