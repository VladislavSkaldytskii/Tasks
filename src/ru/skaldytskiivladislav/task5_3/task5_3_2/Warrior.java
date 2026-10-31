package ru.skaldytskiivladislav.task5_3.task5_3_2;

public class Warrior extends GameCharacter {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    protected void prepareAttack() {
        System.out.println("Воин поднимает меч");
    }

    @Override
    protected int calculateDamage() {
        return attackPower * 2;
    }
}
