package ru.skaldytskiivladislav.task5_3;


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

    public static void sortByArea(Shape[] shapes) {
        int n = shapes.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                double areaJ = shapes[j].area();
                double areaNext = shapes[j + 1].area();

                if (areaJ > areaNext) {
                    Shape temp = shapes[j];
                    shapes[j] = shapes[j + 1];
                    shapes[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Shape[] shape = new Shape[]{
                new Circle("Желтый", 3),
                new Rectangle("Красный", 4, 5),
                new Triangle("Синий", 4, 5, 6),
                new Circle("Зеленый", 1),
                new Rectangle("Синий", 2, 10),
                new Triangle("Желтый", 5, 5, 6),
                new RightTriangle("Серый", 4, 5)
        };
        printAll(shape);
        System.out.println();
        System.out.println(totalArea(shape));
        System.out.println();
        sortByArea(shape);
        printAll(shape);
    }
}
