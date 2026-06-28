package ru.skaldytskiivladislav.task2_1;

public class TempConverter {
    public static void convert(double celsius) {

        double fahrenheit = celsius * 9 / 5 + 32;
        double k = celsius + 273.15;

        System.out.println("Цельсий: " + celsius + " С");
        System.out.println("Фаренгейт: " + fahrenheit + " F");
        System.out.println("Кельвин: " + k + " K");
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
