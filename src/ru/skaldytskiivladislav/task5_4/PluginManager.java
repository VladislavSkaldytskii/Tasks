package ru.skaldytskiivladislav.task5_4;

import ru.skaldytskiivladislav.task5_2.task5_2_1.Animal;

public class PluginManager {
    private Plugin[] plugins;
    private int size;

    public PluginManager() {
        this.plugins = new Plugin[2];
        this.size = 0;
    }

    public void addPlugin(Plugin plugin) {
        if (size == plugins.length) {
            Plugin[] plugins1 = new Plugin[plugins.length * 2];

            System.arraycopy(plugins, 0, plugins1, 0, plugins.length);

            plugins = plugins1;
        }

        plugins[size] = plugin;
        size++;
    }

    public String[] executeAll(String data) {
        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            result[i] = plugins[i].execute(data);
        }
        return result;
    }

    public Plugin findByName(String name) {
        for (int i = 0; i < size; i++) {
            if (plugins[i].getName().equals(name)) {
                return plugins[i];
            }
        }
        return null;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            Plugin p = plugins[i];
            System.out.println(p.getDescription());
            System.out.println("Включен: " + p.isEnabled());
        }
    }
}
