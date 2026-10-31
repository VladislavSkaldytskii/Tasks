package ru.skaldytskiivladislav.task5_3;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
      return 2 * Math.PI * radius;
    }

    @Override
    void printInfo() {
        super.printInfo();
    }
}
