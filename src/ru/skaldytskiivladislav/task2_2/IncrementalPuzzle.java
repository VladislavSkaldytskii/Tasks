package ru.skaldytskiivladislav.task2_2;

public class IncrementalPuzzle {
    public static void main(String[] args) {

        int a = 5;
        int b = a++; // постфикс b = 5 , a = 6
        int c = ++a; // префикс c = 7 потому что и а = 7
        int d = a-- + --b; // 7 - 4 = 11, а с постфиксом а = 6
        //Вывод: 6 4 7 11
        System.out.println(a + " " + b + " " + c + " " + d);

    }
}
