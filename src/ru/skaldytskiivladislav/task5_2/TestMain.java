package ru.skaldytskiivladislav.task5_2;

import ru.skaldytskiivladislav.task5_2.task5_2_1.Animal;
import ru.skaldytskiivladislav.task5_2.task5_2_1.AnimalShelter;
import ru.skaldytskiivladislav.task5_2.task5_2_1.Cat;
import ru.skaldytskiivladislav.task5_2.task5_2_1.Dog;

public class TestMain {
    public static void printAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }

    public static double totalArea(Shape[] shapes) {
        double sum = 0.0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    public static Shape findLargest(Shape[] shapes) {
        Shape largest = shapes[0];
        double maxArea = largest.area();

        for (int i = 1; i < shapes.length; i++) {
            double currentArea = shapes[i].area();
            if (currentArea > maxArea) {
                maxArea = currentArea;
                largest = shapes[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Shape[] shape = new Shape[]{new Circle(3),
                new Rectangle(4, 5),
                new Triangle(4, 5, 6),
                new Circle(1),
                new Rectangle(2, 10),
                new Triangle(5, 5, 6)};

        printAll(shape);

        System.out.println();
        System.out.println(totalArea(shape));

        System.out.println();
        System.out.println(findLargest(shape).getClass().getSimpleName());
    }
}
