package ru.skaldytskiivladislav.task5_1;

public class ElectricCar extends Car {
    private double batteryLevel;

    public ElectricCar(String brand, String model, int year, double speed, int doors, double batteryLevel) {
        super(brand, model, year, speed, doors, "Electric");
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(double percent) {
        if (percent > 0) {
            batteryLevel = Math.min(100, batteryLevel + percent);
        }
    }

    @Override
    public void accelerate(double increment) {
        if (increment <= 0 || batteryLevel <= 0) {
            return;
        }
        double cost = increment / 10.0;
        if (cost > batteryLevel) {
            increment = batteryLevel * 10;
            cost = batteryLevel;
        }
        super.accelerate(increment);
        batteryLevel -= cost;
    }

    @Override
    public void brake(double increment) {
        super.brake(increment);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Заряд: %.1f %%%n", batteryLevel);
    }
}
