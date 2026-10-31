package ru.skaldytskiivladislav.task5_2.task5_2_2;

public class PaymentMethod {
    private String ownerName;
    private double amount;

    public PaymentMethod(String ownerName, double amount) {
        this.ownerName = ownerName;
        this.amount = amount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String processPayment() {
        return String.format("Обрабатываем платёж на сумму %.2f%n", amount);
    }
}
