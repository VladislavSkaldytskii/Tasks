package ru.skaldytskiivladislav.task5_2.task5_2_1;

public class TestMain {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(new Dog("Рекс", 5, "Ротвейлер"));
        shelter.addAnimal(new Cat("Мурка", 5, true));
        shelter.addAnimal(new Dog("Бобик", 3, "Алабай"));
        shelter.addAnimal(new Cat("Барсик", 6, false));
        shelter.addAnimal(new Dog("Шарик", 8, "Дворняга"));

        shelter.makeAllSounds();
        System.out.println();

        shelter.feedAll();
        System.out.println();

        System.out.println("Собак = " + shelter.countByType("Dog"));
        System.out.println("Кошек = " + shelter.countByType("Cat"));
        System.out.println();

        Animal found = shelter.findByName("Мурка");
        if (found != null) {
            System.out.println("Найдено: " + found.getName() + "(" + found.getClass().getSimpleName());
        }
        System.out.println();

        Animal notfound = shelter.findByName("Тузик");
        System.out.println("Поиск Тузика: " + (notfound != null ? notfound.getName() : "не найдено"));
        System.out.println();


        shelter.printTypes();
        System.out.println();
        shelter.removeAnimal("Бобик");
        System.out.println();
        shelter.printTypes();
    }
}
