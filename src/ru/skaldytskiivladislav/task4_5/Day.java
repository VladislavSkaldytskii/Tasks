package ru.skaldytskiivladislav.task4_5;

public enum Day {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресение", true);

    private final String rusName;
    private final boolean weekend;

    Day(String rusName, boolean weekend) {
        this.rusName = rusName;
        this.weekend = weekend;
    }

    public String getRusName() {
        return rusName;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isWorkday() {
        return !isWeekend();
    }
}