package ru.skaldytskiivladislav.task5_3.task5_3_2;

public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.health = health;
        this.name = name;
        this.attackPower = attackPower;
    }

    protected abstract void prepareAttack();

    protected abstract int calculateDamage();

    protected void afterAttack() {
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public final void attack(GameCharacter target) {
        prepareAttack();
        int damage = calculateDamage();
        target.takeDamage(damage);
        afterAttack();
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return String.format("Класс: %s%n" +
                "Кол-во жизней: %d%n" +
                "Урон: %d%n", name, health, attackPower);
    }
}
