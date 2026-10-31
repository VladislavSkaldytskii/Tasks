package ru.skaldytskiivladislav.task5_5;

public class Zoo {
    private final String name;
    private final ZooEnclosure[] enclosures;
    private int eclosuresCount;

    public Zoo(String name, int maxEnclosures) {
        this.name = name;
        this.enclosures = new ZooEnclosure[maxEnclosures];
    }

    public void addEnclosures(ZooEnclosure enclosure) {
        if (eclosuresCount < enclosures.length) {
            enclosures[eclosuresCount++] = enclosure;
        }
    }

    public void dailyRoutine() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Ежедневный распорядок зоопарка: " + name);
        System.out.println("=".repeat(50));

        for (int i = 0; i < eclosuresCount; i++) {
            enclosures[i].feedAll();
            enclosures[i].trainAll();
        }
    }

    public void printFullReport() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ОТЧЁТ ЗООПАРКА " + name);
        System.out.println("=".repeat(50));

        int totalAnimal = 0;
        for (int i = 0; i < eclosuresCount; i++) {
            enclosures[i].printStatus();
            totalAnimal += enclosures[i].getAnimalCount();
        }
        System.out.println("\nВсего вольеров: " + eclosuresCount);
        System.out.println("Всего животных: " + totalAnimal);
    }
}
