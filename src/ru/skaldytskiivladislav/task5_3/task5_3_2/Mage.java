package ru.skaldytskiivladislav.task5_3.task5_3_2;

public class Mage extends GameCharacter {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    protected void prepareAttack() {
        System.out.println("Маг произносит заклинание");
    }

    @Override
    protected int calculateDamage() {
        health = Math.max(0, health - 10); //Использование заклинания уменьшает здоровье на 10 единиц

        return attackPower * 3;
    }
}
