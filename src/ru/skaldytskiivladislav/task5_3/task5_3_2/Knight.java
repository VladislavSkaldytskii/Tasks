package ru.skaldytskiivladislav.task5_3.task5_3_2;

public class Knight extends GameCharacter {
    public Knight(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    protected void prepareAttack() {
        System.out.println("Рыцарь надевает щит");
    }

    @Override
    protected int calculateDamage() {
        return (int) (attackPower * 1.5);
    }

    @Override
    protected void afterAttack() {
        health += 5;
    }

}
