package ru.skaldytskiivladislav.task2_6;


import java.util.List;

public class FormattedTable {
    public static class StudentProfile {
        String name;
        int age;
        double grade;

        public StudentProfile(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    public static void printInfoStudent(List<StudentProfile> studentProfiles) {
        System.out.println("+----+------------------+------+--------+");
        System.out.printf("| %-2s | %-16s | %-4s | %-6s |%n", "№", "Имя", "Воз.", "Балл");
        System.out.println("+----+------------------+------+--------+");
        for (int i = 0; i < studentProfiles.size(); i++) {
            StudentProfile s = studentProfiles.get(i);
            System.out.printf("| %2d | %-16s | %4d | %6.2f |%n", i + 1, s.name, s.age, s.grade);
        }
        System.out.println("+----+------------------+------+--------+");
    }

    public static void main(String[] args) {
        List<StudentProfile> students = List.of(
                new StudentProfile("Иван Иванов", 20, 4.70),
                new StudentProfile("Алексей Смирнов", 19, 3.70),
                new StudentProfile("Мария Петрова", 21, 4.90)
        );
        printInfoStudent(students);
    }
}
