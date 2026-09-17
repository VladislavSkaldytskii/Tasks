package ru.skaldytskiivladislav.task4_5;

public class AppConstants {
    public static final String APP_NAME = "Visual code"; // все константы пишутся в этом стиле в связи c стандартами java UPPER_SNAKE_CASE
    public static final float VERSION =  1.0f;  // поля final можно инициализировать всего раз, дальше их менять нельзя
    public static final int MAX_USERS = 100;
    public static final float PI =  3.14f;

    public static void main(String[] args) {
        //VERSION = 2; // данной переменой нельзя присвоить значение потому что она final
    }
}
