package ru.skaldytskiivladislav.task5_5;

import ru.skaldytskiivladislav.task5_5.abstractClass.Mammal;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Feedable;
import ru.skaldytskiivladislav.task5_5.interfaceZoo.Trainable;

public class Dog extends Mammal implements Feedable, Trainable {
    private String breed;
    private String[] learnedCommands;
    private int commandCount;
    private int trainingLevel;

    public Dog(String name, int age, double weight, String breed) {
        super(name, "Собака", age, weight, true);
        this.breed = breed;
        this.learnedCommands = new String[20];
        this.commandCount = 0;
        this.trainingLevel = 0;
    }

    @Override
    public String makeSound() {
        return getName() + ": Гав-Гав!";
    }

    @Override
    public void feed(String foodType, double amount) {
        System.out.printf("%s съедает %.1f кг %s%n", getName(), amount, foodType);
    }

    @Override
    public double getDailyFoodAmount() {
        return getWeight() * 0.03;
    }

    @Override
    public String getPreferredFood() {
        return "Мясо";
    }

    @Override
    public boolean train(String command) {
        for (int i = 0; i < commandCount; i++) {
            if (learnedCommands[i].equals(command)) {
                System.out.println(getName() + " уже знает команду " + command);
                return false;
            }
        }
        if (commandCount < learnedCommands.length) {
            learnedCommands[commandCount++] = command;
            trainingLevel = Math.min(10, trainingLevel + 1);
            System.out.println(getName() + " освоил команду: " + command);
            return true;
        }
        return false;
    }

    @Override
    public String[] getLearnedCommands() {
        String[] result = new String[commandCount];
        System.arraycopy(learnedCommands, 0, result, 0, commandCount);
        return result;
    }

    @Override
    public int getTrainingLevel() {
        return trainingLevel;
    }

    public String getBreed() {
        return breed;
    }
}
