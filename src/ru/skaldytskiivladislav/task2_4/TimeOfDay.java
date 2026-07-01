package ru.skaldytskiivladislav.task2_4;

public class TimeOfDay {

    public static void main(String[] args) {

        int hour = 14;
        int day = 3;
        String timeOfDay;
        String dayName;

        switch (day) {
            case 1 -> dayName = "Понедельник";
            case 2 -> dayName = "Вторник";
            case 3 -> dayName = "Среда";
            case 4 -> dayName = "Четверг";
            case 5 -> dayName = "Пятница";
            case 6 -> dayName = "Суббота";
            case 7 -> dayName = "Воскресение";
            default -> dayName = "Ведите день недели от 1-7";
        }

        if (hour >= 5 && hour <= 11) {

            timeOfDay = "Утро";

        } else if (hour >= 12 && hour <= 17) {

            timeOfDay = "День";

        } else if (hour >= 18 && hour <= 22) {

            timeOfDay = "Вечер";

        } else {

            timeOfDay = "Ночь";
        }
        boolean isWeekday = day >= 1 && day <= 5;
        boolean isWorkingHours = hour >= 9 && day < 18;

        boolean isWorkTime = isWeekday && isWorkingHours;

        System.out.printf("Час: %d%n", hour);
        System.out.printf("День недели: %s%n", dayName);
        System.out.printf("Время суток: %s%n", timeOfDay);
        System.out.printf("Рабочее время: %s%n", isWorkTime ? "Да" : " Нет");

    }
}
