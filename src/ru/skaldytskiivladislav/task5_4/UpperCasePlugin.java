package ru.skaldytskiivladislav.task5_4;

public class UpperCasePlugin implements Plugin {
    @Override
    public String getName() {
        return "UpperCasePlugin";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String execute(String data) {
        return data.toUpperCase();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
