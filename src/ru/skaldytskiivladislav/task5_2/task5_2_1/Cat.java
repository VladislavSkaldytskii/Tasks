package ru.skaldytskiivladislav.task5_2.task5_2_1;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... и просит добавки");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает: Мяу!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isIndoor=" + isIndoor +
                '}';
    }
}
