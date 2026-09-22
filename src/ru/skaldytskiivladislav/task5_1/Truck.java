package ru.skaldytskiivladislav.task5_1;

public class Truck extends Vehicle {
    private double maxLoad;
    private double currentLoad;

    public Truck(String brand, String model, int year, double speed, double maxLoad) {
        super(brand, model, year, speed);
        this.maxLoad = maxLoad;
        this.currentLoad = 0;
    }

    public boolean loadCargo(double weight) {
        if (weight <= 0 || currentLoad + weight > maxLoad) {
            return false;
        }
        currentLoad += weight;
        return true;
    }

    public boolean unloadCargo(double weight) {
        if (weight <= 0 || weight > currentLoad) {
            return false;
        }
        currentLoad -= weight;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Макс.Вес: %.1f%n" +
                "Текущий вес: %.1f%n", maxLoad, currentLoad);
    }
}
