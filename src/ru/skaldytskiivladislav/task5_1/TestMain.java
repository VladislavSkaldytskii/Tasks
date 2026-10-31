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
    }
}
