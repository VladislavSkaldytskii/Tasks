package ru.skaldytskiivladislav.task2_3;

import java.util.Scanner;

public class ProfileBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        int age;

        while (true) {
            System.out.println("Введите возраст: ");
            age = scanner.nextInt();
            if (age >= 0 && age <= 150) {
                break;
            }
            System.out.println("Возраст должен быть от 0 до 150");
        }

        scanner.nextLine();

        System.out.println("Введите город: ");
        String city = scanner.nextLine();

        int birthYear = 2026 - age;
        int yearsToRetirement = 65 - age;

        System.out.printf("Имя: %s %s%n", name, lastName);
        System.out.printf("Возраст: %d%n", age);
        System.out.printf("Год рождения: %d%n", birthYear);
        System.out.printf("Город: %s%n", city);
        System.out.printf("До пенсии (65лет) осталось: %d лет%n", yearsToRetirement);
        scanner.close();

    }
}
