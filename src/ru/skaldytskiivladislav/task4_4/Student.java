package ru.skaldytskiivladislav.task4_4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(email, student.email) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) && Objects.equals(email, student.email);   // Сгенерированный через (Alt + Insert)
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email);    // если hashcode не определен вместе с equals,то сломается Hashset и Hashmap так как они сначала сравнивают по hashcode, а только после equals
//
//
//    }


    public static void main(String[] args) {
        Student student1 = new Student("Иван Иванов", 25, "Test@mail.ru");
        Student student2 = new Student("Иван Иванов", 25, "Test@mail.ru");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        System.out.println(student1.equals(student2));
        System.out.println(students.size());

        Set<Student> students1 = new HashSet<>();
        students1.add(new Student("Иван Иванов", 30, "Test@mail.ru"));
        students1.add(new Student("Иван Иванов", 30, "Test@mail.ru"));
        students1.add(new Student("Иван Иванов", 30, "Test@mail.ru"));
        students1.add(new Student("Сергей Иванов", 19, "Ivanov@mail.ru"));
        students1.add(new Student("Андрей Смирнов", 17, "Smirnov@mail.ru"));

        System.out.println(students1.size());
    }
}
