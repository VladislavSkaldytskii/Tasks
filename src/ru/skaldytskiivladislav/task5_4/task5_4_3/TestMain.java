package ru.skaldytskiivladislav.task5_4.task5_4_3;

import java.util.Comparator;

public class TestMain {
    public static void sortBubble(Student[] students) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void sortWith(Student[] students, Comparator<Student> comparator) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(students[j], students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Comparator<Student> byName = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Comparator<Student> byAge = (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge());
        Comparator<Student> byGpa = (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());

        Student[] students = {
                new Student("Alice", 3.8, 20),
                new Student("Bob", 3.2, 22),
                new Student("Charlie", 4.0, 19),
                new Student("Diana", 3.5, 21)
        };

        System.out.println("Исходный массив: ");
        printArray(students);

        Student[] copy1 = students.clone();
        sortBubble(copy1);
        System.out.println("\nПо GPA: ");
        printArray(copy1);

        Student[] copy2 = students.clone();
        sortWith(copy2, byName);
        System.out.println("\nПо имени: ");
        printArray(copy2);

        Student[] copy3 = students.clone();
        sortWith(copy3, byAge);
        System.out.println("\nПо возрасту: ");
        printArray(copy3);

        Student[] copy4 = students.clone();
        sortWith(copy4, byGpa);
        System.out.println("\nПо GPA: ");
        printArray(copy4);
    }

    private static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}

