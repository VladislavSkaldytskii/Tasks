package ru.skaldytskiivladislav.task5_4.task5_4_1;

public class TestMain {
    public static void makeAllFly(Flyable[] fly) {
        for (Flyable flys : fly) {
            flys.fly();
            System.out.println("Со скоростью: " + flys.getMaxAltitude());
        }
    }

    public static void makeAllSwim(Swimmable[] swim) {
        for (Swimmable swims : swim) {
            swims.swim();
            System.out.println("Со скоростью: " + swims.getMaxDepth());
        }
    }

    public static void makeAllRun(Runnable[] run) {
        for (Runnable runs : run) {
            runs.run();
            System.out.println("Со скоростью: " + runs.getMaxSpeed());
        }
    }

    public static void main(String[] args) {
        Flyable[] fly = new Flyable[]{
                new Duck(),
                new Eagle()
        };
        Runnable[] run = new Runnable[]{
                new Duck(),
                new Eagle(),
        };
        Swimmable[] swim = new Swimmable[]{
                new Duck(),
                new Fish(),
                new Submarine()
        };

        makeAllFly(fly);
        System.out.println();
        makeAllRun(run);
        System.out.println();
        makeAllSwim(swim);
        System.out.println();
    }
}
