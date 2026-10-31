package ru.skaldytskiivladislav.task5_3.task5_3_2;

public class TestMain {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Воин", 100, 20);
        GameCharacter knight = new Knight("Рыцарь", 100, 15);
        GameCharacter mage = new Mage("Маг", 80, 10);

        warrior.attack(knight);
        System.out.println(knight);

        knight.attack(mage);
        System.out.println(mage);

        mage.attack(warrior);
        System.out.println(mage);
        System.out.println(warrior);
        System.out.println(knight);
        warrior.attack(knight);
        System.out.println(knight);
        warrior.attack(mage);
        System.out.println(mage);
    }
}

