package ru.skaldytskiivladislav.task5_2.task5_2_1;

public class AnimalShelter {
    private Animal[] animals;
    private int count = 0;

    public AnimalShelter() {
        animals = new Animal[2];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count == animals.length) {
            Animal[] animals1 = new Animal[animals.length * 2];

            System.arraycopy(animals, 0, animals1, 0, animals.length);

            animals = animals1;
        }

        animals[count] = animal;
        count++;
    }

    public void removeAnimal(String name) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (animals[i].getName().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Животное с именем " + name + " не найдено");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[count - 1] = null;

        count--;

        System.out.println(name + " удален(а) из приюта");
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

    public void feedAll() {
        for (int i = 0; i < count; i++) {
            animals[i].eat();
        }
    }

    public int countByType(String type) {
        int result = 0;

        for (int i = 0; i < this.count; i++) {
            if (animals[i].getClass().getSimpleName().equals(type)) {
                result++;
            }
        }

        return result;
    }

    public Animal findByName(String name) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getName().equals(name)) {
                return animals[i];
            }
        }
        return null;
    }

    public void printTypes() {
        for (int i = 0; i < count; i++) {
            Animal a = animals[i];
            if (a instanceof Dog dg) {
                System.out.println(dg.getName() + " - Собака");
            } else if (a instanceof Cat ct) {
                System.out.println(ct.getName() + " - Кошка");
            }
        }
    }
}

