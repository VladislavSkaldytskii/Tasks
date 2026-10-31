package ru.skaldytskiivladislav.task5_5.interfaceZoo;

public interface Feedable {
    void feed(String foodType, double amount);
    double getDailyFoodAmount();
    String getPreferredFood();
}
