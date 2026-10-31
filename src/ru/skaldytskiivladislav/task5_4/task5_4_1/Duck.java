package ru.skaldytskiivladislav.task5_4.task5_4_1;

public class Duck implements Runnable, Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public int getMaxAltitude() {
        return 1000;
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public double getMaxSpeed() {
        return 5.0;
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public int getMaxDepth() {
        return 2;
    }
}
