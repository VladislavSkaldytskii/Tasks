package ru.skaldytskiivladislav.task4_3;

public record Course(int id, String title, String instructor, int durationHours, double price) {
    public Course {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }

        if (durationHours <= 0) {
            throw new IllegalArgumentException("Продолжительность курса должна быть больше 0");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
    }

    public boolean isPremium() {
        return price > 5000;
    }

    public String shortDescription() {
        return String.format("%s (%d ч) — %s.", title, durationHours, instructor);
    }

    public static void main(String[] args) {
        Course course1 = new Course(1, "Java для начинающих", "Иван Иванов", 40, 5100);
        Course course2 = new Course(2, "Продвинутая Java", "Алишев Наиль", 13, 3000);
        Course course3 = new Course(3, "Веб-разработка", "Мария Петрова", 60, 4500);
        System.out.println(course1.shortDescription());
        System.out.println(course2.shortDescription());
        System.out.println(course3.shortDescription());

        System.out.println(course1.isPremium());
        System.out.println(course3.isPremium());

        System.out.println(course1.toString());

        Course course1Copy = new Course(1, "Java для начинающих", "Иван Иванов", 40, 5100);
        System.out.println(course1.equals(course1Copy));
    }
}
