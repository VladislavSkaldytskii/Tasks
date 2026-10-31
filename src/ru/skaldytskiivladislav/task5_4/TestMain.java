package ru.skaldytskiivladislav.task5_4;

public class TestMain {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager(); // максимум 10 плагинов

        manager.addPlugin(new UpperCasePlugin());
        manager.addPlugin(new ReversePlugin());
        manager.addPlugin(new WordCountPlugin());

        System.out.println("=== Информация о плагинах ===");
        manager.printAll();

        System.out.println("\n=== Поиск плагина по имени ===");
        Plugin found = manager.findByName("Reverse");
        if (found != null) {
            System.out.println("Найден плагин: " + found.getDescription());
        } else {
            System.out.println("Плагин не найден");
        }

        String input = "Hello world this is a test";
        System.out.println("\n=== Выполнение всех плагинов ===");
        System.out.println("Входная строка: \"" + input + "\"");

        String[] results = manager.executeAll(input);
        for (int i = 0; i < results.length; i++) {
            System.out.println("Результат плагина " + i + ": " + results[i]);
        }
    }
}
