package ru.skaldytskiivladislav.task4_5;

import java.net.http.HttpClient;

public class DayMain {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            String type = day.isWorkday() ? "рабочий" : "выходной";
            System.out.printf("%-10s — %s (%s)%n",day, day.getRusName(), type);
        }

    }
}
