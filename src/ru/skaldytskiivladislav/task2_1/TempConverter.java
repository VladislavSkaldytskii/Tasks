package ru.skaldytskiivladislav.task2_1;

public class TempConverter {

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void convert(double celsius) {

        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);

        System.out.println("Цельсий: " + celsius + " С");
        System.out.println("Фаренгейт: " + fahrenheit + " F");
        System.out.println("Кельвин: " + kelvin + " K");
        System.out.println();

    }

    public static void main(String[] args) {

        convert(100);
        convert(0);
        convert(37);

        //Интересный факт: температура по С и F пересекается в этой точке
        convert(-40);
    }
}

