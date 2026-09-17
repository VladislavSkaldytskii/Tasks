package ru.skaldytskiivladislav.task4_2;

public class Book {
    private String title;
    private String author;
    private int year;
    private int numberOfPages;
    private double price;

    public Book(String title, String author) {
        this(title, author, 0, 0, 0);
    }

    public Book(String title, String author, int year) {
        this(title, author, year, 0, 0);
    }

    public Book(String title, String author, int year, int numberOfPages) {
        this(title, author, year, numberOfPages, 0);
    }

    public Book(String title, String author, int year, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public boolean isClassic() {
        return year < 1950;
    }

    public void printInfo() {
        System.out.println("-".repeat(55));
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println("Количество страниц: " + numberOfPages);
        System.out.println("Цена: " + price + " р");
        System.out.println("Классика: " + isClassic());
        System.out.println("-".repeat(55));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Братья Карамазовы", "Федор Достоевский");
        Book book2 = new Book("Понедельник начинается в субботу", "Аркадий и Борис Стругацкие", 1965);
        Book book3 = new Book("Мартин Иден", "Джек Лондон", 1908, 448);
        Book book4 = new Book("Вишневый Сад", "Антон Чехов", 1904, 352, 447);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
        book4.printInfo();
    }
}
