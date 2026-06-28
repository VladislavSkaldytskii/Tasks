package ru.skaldytskiivladislav.task2_1;

import java.math.BigDecimal;

public class Finance {
    public static void main(String[] args) {

        double a = 0.1 + 0.2;
        double b = 10.0 - 9.0 - 0.9;

        System.out.println("Вывод через double: ");
        System.out.println(a);
        System.out.println(b);

        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal a2 = new BigDecimal("0.2");

        System.out.println();
        System.out.println("Вывод через BigDecimal: ");
        System.out.println(a1.add(a2));

        BigDecimal b1 = new BigDecimal("10.0");
        BigDecimal b2 = new BigDecimal("9.0");
        BigDecimal b3 = new BigDecimal("0.9");

        System.out.println(b1.subtract(b2).subtract(b3));

    }
}
