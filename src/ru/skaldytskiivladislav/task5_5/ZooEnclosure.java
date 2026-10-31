package ru.skaldytskiivladislav.task5_5;

import ru.skaldytskiivladislav.task5_5.abstractClass.Animal;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Feedable;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Trainable;

public class ZooEnclosure {
    private final String name;
    private final String habitatType;
    private final Animal[] animals;
    private int animalCount;

    public ZooEnclosure(String name, String habitatType, int capacity) {
        this.name = name;
        this.habitatType = habitatType;
        this.animals = new Animal[capacity];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= animals.length) {
            System.out.println("Вольер " + name + " заполнен");
            return false;
        }
        animals[animalCount++] = animal;
        System.out.println(animal.getName() + " помещен в вольер " + name);
        return true;
    }

    public void feedAll() {
        System.out.println("\n--- Кормление в вольере: " + name + " ---");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] instanceof Feedable feedable) {
                feedable.feed(feedable.getPreferredFood(), feedable.getDailyFoodAmount());
            }
        }
    }

    public void trainAll() {
        System.out.println("\n--- Тренировка в вольере: " + name + " ---");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] instanceof Trainable trainable) {
                System.out.printf("%s | Уровень дрессировки: %d/10%n", animals[i].getName(), trainable.getTrainingLevel());
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void printStatus() {
        System.out.println("\n=== Вольер: " + name + " (" + habitatType + ") ===");
        if (animalCount == 0) {
            System.out.println("Пусто");
            return;
        }
        for (int i = 0; i < animalCount; i++) {
            animals[i].printInfo();
            System.out.println("  Звук  " + animals[i].makeSound());
        }
    }

}
