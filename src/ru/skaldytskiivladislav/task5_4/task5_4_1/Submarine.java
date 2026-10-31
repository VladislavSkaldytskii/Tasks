package ru.skaldytskiivladislav.task5_4.task5_4_1;

public class Submarine implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Субмарина плывет");

    }

    @Override
    public int getMaxDepth() {
        return 400;
    }
}
