package ru.skaldytskiivladislav.task5_2.task5_2_2;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String ownerName, double amount, String cardNumber, String expiryDate) {
        super(ownerName, amount);

        String digitsOnly = cardNumber.replaceAll("\\D", "");

        this.cardNumber = digitsOnly.substring(digitsOnly.length() - 4);
        this.expiryDate = expiryDate;
    }

    @Override
    public String processPayment() {
       String maskNumber = ("X".repeat(12) + cardNumber);

        return super.processPayment() + String.format("Тип: Кредитная карта%n" +
                "Номер карты: %s%n" +
                "Срок: %s%n", maskNumber, expiryDate);
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
