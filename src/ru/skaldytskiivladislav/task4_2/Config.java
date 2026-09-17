package ru.skaldytskiivladislav.task4_2;

public class Config {
    String host;
    int port;
    int maxConnections;
    int timeOut;
    boolean debug;

    private static int instanceCount;

    {
        host = "localhost";
        port = 8080;
        maxConnections = 100;
        timeOut = 30;
        debug = false;
        instanceCount++;
    }

    public Config() {
    }

    public Config(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Config(String host, int port, int maxConnections, int timeOut, boolean debug) {
        this.host = host;
        this.port = port;
        this.maxConnections = maxConnections;
        this.timeOut = timeOut;
        this.debug = debug;
    }

    public void printConfig() {
        System.out.println("=".repeat(55));
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("Max Connection: " + maxConnections);
        System.out.println("Timeout: " + timeOut);
        System.out.println("Debug: " + debug);
        System.out.println("Всего создано объектов Config: " + instanceCount);
        System.out.println("=".repeat(55));

    }

    public static void main(String[] args) {
        Config config1 = new Config();
        Config config2 = new Config("localhost", 8083);
        Config config3 = new Config("localhost", 8081, 200, 60, true);

        config1.printConfig();
        config2.printConfig();
        config3.printConfig();
    }
}
