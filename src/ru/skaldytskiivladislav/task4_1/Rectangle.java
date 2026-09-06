package ru.skaldytskiivladislav.task4_1;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    public void printInfo() {
        System.out.println("-".repeat(25));
        System.out.printf("Ширина: %.2f%n", width);
        System.out.printf("Высота: %.2f%n", height);
        System.out.printf("Площадь: %.2f%n", area());
        System.out.printf("Периметр: %.2f%n", perimeter());
        System.out.println("Квадрат: " + isSquare());
        System.out.println("-".repeat(25));
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(7, 7);
        Rectangle rectangle3 = new Rectangle(12.5, 4);

        rectangle1.printInfo();
        rectangle2.printInfo();
        rectangle3.printInfo();

        rectangle1.scale(2);

        rectangle1.printInfo();
    }
}
