package ru.skaldytskiivladislav.task2_6;

public class FormattedTable {

    public static void main(String[] args) {

        String name1 = "Иван Иванов";
        int age1 = 20;
        double grade1 = 4.70;

        String name2 = "Мария Петрова";
        int age2 = 21;
        double grade2 = 4.90;

        String name3 = "Алексей Смирнов";
        int age3 = 19;
        double grade3 = 3.70;

        System.out.println("+----+------------------+------+--------+");

        System.out.printf("| %-2s | %-16s | %-4s | %-6s |%n", "№", "Имя", "Воз.", "Балл");


        System.out.println("+----+------------------+------+--------+");
        System.out.printf("| %2d | %-16s | %4d | %6.2f |%n", 1, name1, age1, grade1);
        System.out.printf("| %2d | %-16s | %4d | %6.2f |%n", 2, name2, age2, grade2);
        System.out.printf("| %2d | %-16s | %4d | %6.2f |%n", 3, name3, age3, grade3);
        System.out.println("+----+------------------+------+--------+");
    }
}
