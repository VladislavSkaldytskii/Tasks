package ru.skaldytskiivladislav.task5_3;

public class RightTriangle extends Triangle {
    private double legsA;
    private double legsB;
    private double hypotenuse;

    public RightTriangle(String color, double legsA, double legsB) {
        super(color, legsA, legsB, calculateHypotenuse(legsA, legsB));
        this.legsA = legsA;
        this.legsB = legsB;
        this.hypotenuse = calculateHypotenuse(legsA, legsB);
    }

    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("Гипотенуза: %.2f%n", hypotenuse);
    }
}
