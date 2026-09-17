package ru.skaldytskiivladislav.task4_6;

public class Transaction {
    private final String type;
    private final double amount;
    private final double balanceAfter;
    private final String description;

    public Transaction(String type, double amount, double balanceAfter, String description) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    @Override
    public String toString() {
        return String.format("[%s] %.2f руб. | Баланс после: %.2f | %s",
                type, amount, balanceAfter, description);
    }
}
