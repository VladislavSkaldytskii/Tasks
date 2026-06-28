package ru.skaldytskiivladislav.task1_4;

// 1. Неправильно назван класс, не подходит под формат правил закрепленных конвенцией
public class StudentCalculator {
    // 2. Константы пишутся большими буквами
    public static final double PI = 3.14;

    // 3. Методы пишутся с маленькой буквы
// 4. Названия переменных должны быть понятными
// 5. Названия переменных пишутся с маленькой буквы
    public static double calculateCircleArea(double radius) {
// 6.должны быть пробелы вокруг операторов
        double area = PI * radius * radius;
// 7.у булевых переменных имя должно читаться как вопрос с ответом да/нет
        boolean IsResult = true;
        return area;
    }

    public static void main(String[] args) {
//8.переменные называем сначала с маленькой буквы, а последующие слова в названии с большой
        double myRadius = 5;
        System.out.println(calculateCircleArea(myRadius));
    }
}

