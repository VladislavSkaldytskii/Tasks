package ru.skaldytskiivladislav.task5_5;

import ru.skaldytskiivladislav.task5_5.abstractClass.Reptile;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Aquatic;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Feedable;

public class Crocodile extends Reptile implements Feedable, Aquatic {
    public Crocodile(String name, String species, int age, double weight, boolean isPoisonous) {
        super(name, species, age, weight, isPoisonous);
    }

    @Override
    public String makeSound() {
        return getName() + ": грр‑грр!";
    }

    @Override
    public void swim() {
        System.out.println("Плавает");
    }

    @Override
    public int getMaxDepth() {
        return 5;
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
        return "Мясо";
    }
}
