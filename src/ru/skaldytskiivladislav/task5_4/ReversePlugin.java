package ru.skaldytskiivladislav.task5_4;

public class ReversePlugin implements Plugin {
    @Override
    public String getName() {
        return "Reverse";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String execute(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

