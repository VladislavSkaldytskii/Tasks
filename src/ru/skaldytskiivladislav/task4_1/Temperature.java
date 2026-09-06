package ru.skaldytskiivladislav.task4_1;

public class Temperature {
    private double value;

    public Temperature(double value) {
        this.value = value;
    }

    public static Temperature fromCelsius(double value) {
        return new Temperature(value);
    }

    public static Temperature fromFahrenheit(double value) {
        double celsius = (value - 32) * 5 / 9;
        return new Temperature(celsius);
    }

    public static Temperature fromKelvin(double value) {
        double celsius = value - 273.15;
        return new Temperature(celsius);
    }

    public double toCelsius() {
        return value;
    }

    public double toFahrenheit() {
        return value * 9 / 5 + 32;
    }

    public double toKelvin() {
        return value + 273.15;
    }

    public void printTemperature() {
        System.out.printf("Цельсий: %.2f C%n", toCelsius());
        System.out.printf("Фаренгейт: %.2f F%n", toFahrenheit());
        System.out.printf("Кельвин: %.2f K%n", toKelvin());
        System.out.println("=".repeat(55));
    }

    public static void main(String[] args) {
        Temperature temperature1 = Temperature.fromCelsius(25);
        temperature1.printTemperature();
        Temperature temperature2 = Temperature.fromFahrenheit(77);
        temperature2.printTemperature();
        Temperature temperature3 = Temperature.fromKelvin(295.16);
        temperature3.printTemperature();
    }
}
