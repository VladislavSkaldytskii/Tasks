package ru.skaldytskiivladislav.task1_4;

public class TemperatureConverter {
    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double BOILING_POINT_CELSIUS = 100.0;


    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;

    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;

    }


    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = converter.celsiusToFahrenheit(123);
        boolean isAboveBoiling = fahrenheit > BOILING_POINT_CELSIUS;
        System.out.println("123C = " + fahrenheit + "F ");
        System.out.println("It came to boiling: " + isAboveBoiling);

        double celsius = converter.fahrenheitToCelsius(177);
        isAboveBoiling = celsius > BOILING_POINT_CELSIUS;
        System.out.println("177F = " + celsius + "C ");
        System.out.println("It came to boiling: " + isAboveBoiling);
    }
}
