package ru.skaldytskiivladislav.task5_5;

import ru.skaldytskiivladislav.task5_5.abstractClass.Bird;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Aquatic;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Feedable;

public class Penguin extends Bird implements Feedable, Aquatic {
    public Penguin(String name, String species, int age, double weight, boolean canFly, double wingSpan) {
        super(name, species, age, weight, canFly, wingSpan);
    }

    @Override
    public void layEggs() {
        System.out.printf("Пингвин: %s откладывает 1–2 яйца%n", getName());
    }

    @Override
    public String makeSound() {
        return getName() + ": ур‑ур‑ур";
    }

    @Override
    public void swim() {
        System.out.println("Плавает");
    }

    @Override
    public int getMaxDepth() {
        return 565;
    }

    @Override
    public boolean canBreathUnderwater() {
        return false;
    }

    @Override
    public void feed(String foodType, double amount) {
        System.out.printf("%s съедает %.1f кг %s%n", getName(), amount, foodType);
    }

    @Override
    public double getDailyFoodAmount() {
        return getWeight() * 0.03;
    }

    @Override
    public String getPreferredFood() {
        return "Рыба";
    }
}
