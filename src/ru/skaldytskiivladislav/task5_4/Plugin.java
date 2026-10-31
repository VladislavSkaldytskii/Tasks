package ru.skaldytskiivladislav.task5_4;

public interface Plugin {
    String getName();

    String getVersion();

    String execute(String data);

    boolean isEnabled();

    default String getDescription() {
        return "Плагин " + getName() + " v" + getVersion();
    }
}
