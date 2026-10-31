package ru.skaldytskiivladislav.task5_2.task5_2_2;

public class BankTransfer extends PaymentMethod {
    private String bankAccount;

    public BankTransfer(String ownerName, double amount, String bankAccount) {
        super(ownerName, amount);
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String processPayment() {
        return super.processPayment() + String.format("Тип: Банковский перевод%n" +
                "Счет: %s%n", bankAccount);
    }
}
