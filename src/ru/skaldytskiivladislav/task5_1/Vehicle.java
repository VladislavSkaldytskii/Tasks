package ru.skaldytskiivladislav.task5_1;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double speed;

    public Vehicle(String brand, String model, int year, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public void accelerate(double increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println(brand + " " + model + " разогналась до " + speed + " км/ч.");
        } else {
            System.out.println("Ускорение должно быть положительным! ");
        }
    }

    public void brake(double increment) {
        if (increment > 0) {
            speed = Math.max(0, speed - increment);
            System.out.println(brand + " " + model + " затормозила до " + speed + " км/ч.");
        } else {
            System.out.println("Скорость не может быть отрицательной! ");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return String.format("-".repeat(55) + "%nБренд: %s%n" +
                "Модель: %s%n" +
                "Год выпуска: %d%n" +
                "Скорость: %.1f%n", getBrand(), getModel(), getYear(), getSpeed());
    }
}

