package ru.skaldytskiivladislav.task5_2.task5_2_2;

public class CryptoWallet extends PaymentMethod {
    private String walletAddress;
    private String currency;

    public CryptoWallet(String ownerName, double amount, String walletAddress, String currency) {
        super(ownerName, amount);
        this.walletAddress = walletAddress;
        this.currency = currency;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    @Override
    public String processPayment() {
        return super.processPayment() + String.format("Тип: Криптокошелек%n" +
                "Валюта: %s%n" +
                "Адрес: %s%n", currency, walletAddress);
    }
}
