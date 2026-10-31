package ru.skaldytskiivladislav.task5_4.task5_4_1;

public class Fish implements Swimmable {
    @Override
    public int getMaxDepth() {
        return 400;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}
