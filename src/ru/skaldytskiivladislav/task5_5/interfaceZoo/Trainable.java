package ru.skaldytskiivladislav.task5_5.interfaceZoo;

public interface Trainable {
    boolean train(String command);
    String[] getLearnedCommands();
    int getTrainingLevel();
}
