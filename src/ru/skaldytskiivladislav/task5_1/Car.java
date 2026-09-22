package ru.skaldytskiivladislav.task5_1;

public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, String model, int year, double speed, int doors, String fuelType) {
        super(brand, model, year, speed);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void accelerate(double increment) {
        super.accelerate(increment);
    }

    @Override
    public void brake(double increment) {
        super.brake(increment);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Кол-во дверей: %d%n" +
                "Вид топлива: %s%n", getDoors(), getFuelType());
    }

    public int getDoors() {
        return doors;
    }

    public String getFuelType() {
        return fuelType;
    }
}
