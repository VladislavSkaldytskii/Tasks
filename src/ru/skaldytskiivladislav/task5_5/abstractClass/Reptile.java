package ru.skaldytskiivladislav.task5_5.abstractClass;

public abstract class Reptile extends Animal {
    private boolean isPoisonous;

    public Reptile(String name, String species, int age, double weight, boolean isPoisonous) {
        super(name, species, age, weight);
        this.isPoisonous = isPoisonous;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    @Override
    public String getHabitatType() {
        return "Наземный";
    }
}
