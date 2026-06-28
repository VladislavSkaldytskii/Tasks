package ru.skaldytskiivladislav.task2_1;

public class Overflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Максимально значение int: " + maxInt);

        int overflow = maxInt + 1;
        // Проблема переполнение
        // После максимального значение мы получаем минимальное значение, в связи с переполнением памяти
        System.out.println(overflow);

        int secondsYearInt = 100 * 365 * 24 * 60 * 60;

        System.out.println("Кол-во секунд в 100 годах: " + secondsYearInt);
        // У int недостаточно памяти хранить такое большое число, поэтому результат неверный

        long secondsYearLong = 100 * 365 * 24 * 60 * 60L;

        System.out.println("Кол-во секунд в 100 годах: " + secondsYearLong);
        // Long имеет большее количество памяти, достаточное для этого числа
    }
}
