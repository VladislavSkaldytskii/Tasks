package ru.skaldytskiivladislav.task5_2;

public class Shape {
    public Shape() {
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void printInfo() {
        System.out.printf("Название фигуры: %s%n" +
                "Площадь: %.2f%n" +
                "Периметр: %.2f%n", getClass().getSimpleName(), area(), perimeter());
    }
}
