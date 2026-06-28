package ru.skaldytskiivladislav.task2_2;

public class ExchangeOfVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        int x = 10;
        int y = 20;
        x = y + x;
        y = x - y;
        x = x - y;

        System.out.println(x + " " + y);

        int z = 10;
        x = 10; y = 20;
        boolean r1 = x == z; //true
        boolean r2 = x != y; //true
        boolean r3 = x < y && y > z; //true
        boolean r4 = x > y || x == z; //
        boolean r5 = !(x == y) && (y >= 20); // true
        boolean r6 = x == 10 || 1 / 0 > 0; // Левая часть true, правая часть не вычисляется, поскольку результат очевиден,
        // поэтому не была вызвана ошибка деления на 0 это называется короткое замыкание для увелечения скорости работы программы.

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);


    }
}
