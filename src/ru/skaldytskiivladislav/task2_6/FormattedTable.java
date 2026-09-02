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

    public static int getMaxNameLength(List<StudentProfile> students) {
        int maxLength = "Имя".length();

        for (StudentProfile studentProfile : students) {
            if (studentProfile.name.length() > maxLength) {
                maxLength = studentProfile.name.length();
            }
        }

        return maxLength;
    }

    public static void printSeparator(int nameLength) {
        System.out.println("+----+-" + "-".repeat(nameLength) + "-+------+--------+");
    }

    public static void printHeader(int nameLength) {
        printSeparator(nameLength);

        System.out.printf("| %-2s | %-" + nameLength + "s | %-4s | %-6s |%n", "№", "Имя", "Воз.", "Балл");
    }

    public static void printRow(StudentProfile studentProfile, int nameLength, int number) {
        System.out.printf("| %2d | %-" + nameLength + "s | %4d | %6.2f |%n", number, studentProfile.name, studentProfile.age, studentProfile.grade);
    }

    public static void printFooter(int nameLength) {
        printSeparator(nameLength);
    }

    public static void printInfoStudent(List<StudentProfile> studentProfiles) {
        int nameLength = getMaxNameLength(studentProfiles);

        printHeader(nameLength);

        for (int i = 0; i < studentProfiles.size(); i++) {
            printRow(studentProfiles.get(i), nameLength, i + 1);
        }

        printFooter(nameLength);
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
