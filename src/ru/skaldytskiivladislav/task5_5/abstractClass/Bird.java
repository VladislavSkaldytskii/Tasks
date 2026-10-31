package ru.skaldytskiivladislav.task5_5.abstractClass;

public abstract class Bird extends Animal {
    private double wingSpan;
    private boolean canFly;

    public Bird(String name, String species, int age, double weight, boolean canFly, double wingSpan) {
        super(name, species, age, weight);
        this.canFly = canFly;
        this.wingSpan = wingSpan;
    }

    public boolean canFly() {
        return canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public String getHabitatType() {
        return canFly ? "Воздушный" : "Наземный";
    }

    public abstract void layEggs();
}
