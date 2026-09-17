package ru.skaldytskiivladislav.task4_3;

public class Temperature {
    private double celsius;

    public Temperature(double value) {
        setCelsius(value);
    }

    public void setCelsius(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля");
        }
        this.celsius = value;
    }

    public void setFahrenheit(double value) {
        double celsius = (value - 32) * 5 / 9;
        setCelsius(celsius);
    }

    public void setKelvin(double value) {
        double celsius = value - 273.15;
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }

    @Override
    public String toString() {
        return String.format("%.2fC | %.2fF | %.2fK", getCelsius(), getFahrenheit(), getKelvin());
    }

    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(25);
        System.out.println("Температура1: " + temperature1);
        Temperature temperature2 = new Temperature(0);
        temperature2.setFahrenheit(77);
        System.out.println("Температура2: " + temperature2);
        Temperature temperature3 = new Temperature(0);
        temperature3.setKelvin(298.15);
        System.out.println("Температура3: " + temperature3);
    }
}
