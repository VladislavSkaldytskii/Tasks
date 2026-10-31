package ru.skaldytskiivladislav.task5_4.task5_4_1;

public class Eagle implements Flyable, Runnable {
    @Override
    public int getMaxAltitude() {
        return 6000;
    }

    @Override
    public void fly() {
        System.out.println("Орел летит");

    }

    @Override
    public void run() {
        System.out.println("Орел бежит");
    }

    @Override
    public double getMaxSpeed() {
        return 8.0;
    }
}
