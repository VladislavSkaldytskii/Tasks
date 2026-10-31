package ru.skaldytskiivladislav.task5_5;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Московский зоопарк", 10);

        ZooEnclosure dogEnclosures = new ZooEnclosure("Собачий двор", "Наземный", 5);
        ZooEnclosure waterEnclosures = new ZooEnclosure("Аквариум", "Водный", 4);
        ZooEnclosure birdEnclosures = new ZooEnclosure("Птичник", "Воздушный", 6);

        Dog rex = new Dog("Рекс", 3, 35, "Немецкая овчарка");
        Dog buddy = new Dog("Бадди", 2, 25, "Лабрадор");

        Dolphin flipper = new Dolphin("Флиппер", "Афалина", 8, 230.0, false);
        Dolphin tina = new Dolphin("Тина", "Афалина", 5, 190.0, false);
        Dolphin maks = new Dolphin("Макс", "Афалина", 12, 250.0, false);

        Eagle thunder = new Eagle("Гром", "Беркут", 6, 4.2, true, 2.1);
        Eagle wind = new Eagle("Ветер", "Белоголовый орлан", 4, 6.5, true, 2.3);
        Eagle arrow = new Eagle("Стрела", "Беркут", 9, 4.5, true, 2.2);

        Penguin snow = new Penguin("Снежок", "Императорский пингвин", 3, 30.0, false, 1.0);
        Penguin fat = new Penguin("Пухлик", "Папуанский пингвин", 2, 5.5, false, 0.6);
        Penguin ice = new Penguin("Айс", "Императорский пингвин", 5, 32.0, false, 1.1);

        Crocodile croc1 = new Crocodile("Зубастик", "Нильский крокодил", 10, 400.0, false);
        Crocodile croc2 = new Crocodile("Гроза", "Гребнистый крокодил", 15, 700.0, false);
        Crocodile croc3 = new Crocodile("Тихий", "Тупорылый крокодил", 7, 200.0, false);


        rex.train("Сидеть");
        rex.train("Лежать");
        rex.train("Дай лапу");
        buddy.train("Сидеть");

        flipper.train("прыжок");
        flipper.train("кольцо");
        tina.train("прыжок");

        dogEnclosures.addAnimal(rex);
        dogEnclosures.addAnimal(buddy);

        waterEnclosures.addAnimal(flipper);
        waterEnclosures.addAnimal(tina);
        waterEnclosures.addAnimal(maks);

        thunder.layEggs();
        wind.layEggs();

        birdEnclosures.addAnimal(thunder);
        birdEnclosures.addAnimal(wind);
        birdEnclosures.addAnimal(arrow);

        zoo.addEnclosures(dogEnclosures);
        zoo.addEnclosures(waterEnclosures);
        zoo.addEnclosures(birdEnclosures);

        waterEnclosures.addAnimal(croc1);
        waterEnclosures.addAnimal(croc2);
        waterEnclosures.addAnimal(croc3);

        snow.layEggs();
        fat.layEggs();

        waterEnclosures.addAnimal(snow);
        waterEnclosures.addAnimal(fat);
        waterEnclosures.addAnimal(ice);

        zoo.dailyRoutine();
        zoo.printFullReport();
    }
}
