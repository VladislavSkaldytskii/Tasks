package ru.skaldytskiivladislav.task5_3;

    public class Triangle extends Shape {
        private double a;
        private double b;
        private double c;

        public Triangle(String color, double a, double b, double c) {
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String getColor() {
            return super.getColor();
        }

        @Override
        double area() {
            double p = perimeter() / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        double perimeter() {
            return a + b + c;
        }

        @Override
        void printInfo() {
            super.printInfo();
        }
    }
