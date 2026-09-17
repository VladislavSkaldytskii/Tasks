package ru.skaldytskiivladislav.task4_5;

public class User {
    private int id;
    private String name;

    private static int nextId = 0;

    public User(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public static int getTotalCreated() {
        return nextId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new User("Иван");
        User user1 = new User("Андрей");
        System.out.println(user.toString());
        System.out.println(getTotalCreated());
    }
}
