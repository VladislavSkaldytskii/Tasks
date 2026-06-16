public class TemperatureConverter {
    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double BOILING_POINT_CELSIUS = 100.0;
    boolean isAboveBoiling = true;

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;

    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return fahrenheit - (double) (32 * 5) / 9;

    }
}
