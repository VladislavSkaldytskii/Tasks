package ru.skaldytskiivladislav.task2_4;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TimeOfDay {

    static public void timeOfDay(LocalDateTime dateTime) {
        int hour = dateTime.getHour();
        DayOfWeek day = dateTime.getDayOfWeek();
        String dayName;
        boolean isWeekday = day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
        boolean isWorkingHours = hour >= 9 && hour < 18;
        boolean isWorkTime = isWeekday && isWorkingHours;
        String timeOfDay;

        switch (day) {
            case MONDAY -> dayName = "Понедельник";
            case TUESDAY -> dayName = "Вторник";
            case WEDNESDAY -> dayName = "Среда";
            case THURSDAY -> dayName = "Четверг";
            case FRIDAY -> dayName = "Пятница";
            case SATURDAY -> dayName = "Суббота";
            case SUNDAY -> dayName = "Воскресенье";
            default -> dayName = "Неизвестный день";
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

        System.out.printf("Час: %d%n", hour);
        System.out.printf("День недели: %s%n", dayName);
        System.out.printf("Время суток: %s%n", timeOfDay);
        System.out.printf("Рабочее время: %s%n%n", isWorkTime ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        timeOfDay(LocalDateTime.of(2026, 8, 10, 10, 30));
        timeOfDay(LocalDateTime.of(2026, 8, 15, 20, 0));
        timeOfDay(LocalDateTime.of(2026, 8, 13, 3, 0));
        timeOfDay(LocalDateTime.of(2026, 5, 9, 3, 0));
    }
}
