package ru.skaldytskiivladislav.task5_5.abstractClass;

public abstract class Animal {
    private static int nextId = 1;

    private final int id;
    private final String name;
    private final String species;
    private int age;
    private double weight;
    private String healthStatus;

    public Animal(String name, String species, int age, double weight) {
        this.id = nextId++;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.healthStatus = "Здоров";
    }

    public abstract String makeSound();

    public abstract String getHabitatType();

    public void sleep() {
        System.out.println(name + "Спит");
    }

    public void printInfo() {
        System.out.printf("[%d] %s (%s) | Возраст: %d лет | Вес : %.1f кг | %s%n", id, name, species, age, weight, healthStatus);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return String.format("%s '%s' (ID:%d)", species, name, id);
    }
}
