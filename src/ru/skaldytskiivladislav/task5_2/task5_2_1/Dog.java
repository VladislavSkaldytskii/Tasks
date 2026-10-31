package ru.skaldytskiivladislav.task5_2.task5_2_1;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void fetch() {
        System.out.println(getName() + " приносит мячик");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " лает: Гав-гав!");
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', breed='" + breed + "'}";
    }
}
