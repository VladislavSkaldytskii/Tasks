package ru.skaldytskiivladislav.task5_1;

public class TestMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", "Base", 2015, 0);
        Car car = new Car("Toyota", "Camry", 2020, 0, 4, "Petrol");
        Truck truck = new Truck("Volvo", "FH16", 2018, 0, 20000);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2022, 0, 4, 50);

        System.out.println("=== Vehicle ===");
        System.out.println(vehicle);
        vehicle.accelerate(50);
        System.out.println("После accelerate(50): " + vehicle.getSpeed());
        vehicle.brake(20);
        System.out.println("После brake(20): " + vehicle.getSpeed());
        vehicle.brake(100);
        System.out.println("После brake(100): " + vehicle.getSpeed() + " (не ниже 0)");

        System.out.println("\n=== Car ===");
        System.out.println(car);
        car.accelerate(80);
        car.brake(30);
        System.out.println("Скорость: " + car.getSpeed()
                + ", дверей: " + car.getDoors() + ", топливо: " + car.getFuelType());
        System.out.println(car);

        System.out.println("\n=== Truck ===");
        System.out.println(truck);
        System.out.println("loadCargo(15000): " + truck.loadCargo(15000));
        System.out.println("loadCargo(10000): " + truck.loadCargo(10000) + " (превышение)");
        System.out.println("unloadCargo(5000): " + truck.unloadCargo(5000));
        System.out.println("unloadCargo(99999): " + truck.unloadCargo(99999) + " (столько нет)");
        truck.accelerate(60);
        truck.brake(10);
        System.out.println(truck);

        System.out.println("\n=== ElectricCar ===");
        System.out.println(electricCar);
        electricCar.accelerate(100);
        System.out.println("После accelerate(100): скорость " + electricCar.getSpeed()
                + ", заряд " + electricCar.getBatteryLevel() + "%");
        electricCar.brake(40);
        System.out.println("После brake(40): скорость " + electricCar.getSpeed());
        electricCar.charge(30);
        System.out.println("После charge(30): заряд " + electricCar.getBatteryLevel() + "%");
        electricCar.charge(500);
        System.out.println("После charge(500): заряд " + electricCar.getBatteryLevel() + "% (не выше 100)");
        System.out.println(electricCar);

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