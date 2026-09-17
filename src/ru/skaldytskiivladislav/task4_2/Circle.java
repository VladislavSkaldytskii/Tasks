package ru.skaldytskiivladislav.task4_2;

public class Circle {
    private double radius;
    private double centerX;
    private double centerY;
    private final int id;

    private static int nextId = 1;

    public Circle() {
        this(1, 0, 0);
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.id = nextId++;
    }

    public Circle(Circle other) {
        this(other.radius, other.centerX, other.centerY);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double dx = x - centerX;
        double dy = y - centerY;

        double distance = Math.sqrt(dx * dx + dy * dy);

        return distance < radius;
    }

    public boolean intersects(Circle other) {
        double dx = other.centerX - centerX;
        double dy = other.centerY - centerY;

        double distance = Math.sqrt(dx * dx + dy * dy);

        return distance < radius + other.radius;
    }

    public void printInfo() {
        System.out.println("-".repeat(55));
        System.out.printf("Окружность %d%n", id);
        System.out.printf("Площадь: %.2f%n", area());
        System.out.printf("Периметр: %.2f%n", perimeter());
        System.out.println("-".repeat(55));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(3, 4, 5);
        Circle circle4 = new Circle(circle3);

        circle1.printInfo();
        circle2.printInfo();
        circle3.printInfo();
        circle4.printInfo();

        System.out.println("Точка внутри окружности: " + circle3.contains(4, 5));
        System.out.println("Точка внутри окружности: " + circle3.contains(10, 10));

        Circle circle5 = new Circle(3, 8, 5);
        System.out.println("Окружности пересекаются: " + circle3.intersects(circle5));
        Circle circle6 = new Circle(2, 20, 20);
        System.out.println("Окружности пересекаются: " + circle3.intersects(circle6));
    }
}
