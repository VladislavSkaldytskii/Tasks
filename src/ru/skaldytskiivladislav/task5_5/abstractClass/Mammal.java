package ru.skaldytskiivladislav.task5_5.abstractClass;

public abstract class Mammal extends Animal {
    private boolean isFurry;

    public Mammal(String name, String species, int age, double weight, boolean isFurry) {
        super(name, species, age, weight);
        this.isFurry = isFurry;
    }

    public boolean isFurry() {
        return isFurry;
    }

    @Override
    public String getHabitatType() {
        return "Наземный";
    }
}
