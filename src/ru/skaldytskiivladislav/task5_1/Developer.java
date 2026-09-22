package ru.skaldytskiivladislav.task5_1;

public class Developer extends Employee {
    private String programmingLanguage;
    private int experienceYears;

    public Developer(String name, double salary, String programmingLanguage, int experienceYears) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
    }

    @Override
    public double getSalary() {
        double experienceBonus = experienceYears * 5000;
        return salary + experienceBonus;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Опыт: %d год.%n" +
                "Язык программирования: %s%n", experienceYears, programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Опыт: %d год.%n" +
                "Язык программирования: %s%n", experienceYears, programmingLanguage);
    }
}
