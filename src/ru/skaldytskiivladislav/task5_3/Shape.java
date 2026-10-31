package ru.skaldytskiivladislav.task5_3;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();

    abstract double perimeter();

    void printInfo() {
        System.out.printf("-".repeat(55) + "%n" +
                "Цвет: %s%n" +
                "Название фигуры: %s%n" +
                "Площадь: %.2f%n" +
                "Периметр: %.2f%n",color,getClass().getSimpleName(), area(), perimeter());
    }
}
