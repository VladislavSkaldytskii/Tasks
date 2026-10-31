package ru.skaldytskiivladislav.task5_2.task5_2_2;

public class TestMain {
    public static void processAll(PaymentMethod[] paymentMethod) {
        for (PaymentMethod paymentMethods : paymentMethod) {
            System.out.println(paymentMethods.processPayment());
        }
    }

    public static void printTypes(PaymentMethod[] paymentMethods) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            String description = switch (paymentMethod) {
                case CreditCard cc ->
                        cc.getOwnerName() + " - Кредитная карта" + ", " + "Сроком до: " + cc.getExpiryDate();
                case CryptoWallet cw ->
                        cw.getOwnerName() + " - Крипто-кошелек" + ", " + "Адрес: " + cw.getWalletAddress();
                case BankTransfer bt -> bt.getOwnerName() + " - Перевод" + ", " + "Счет: " + bt.getBankAccount();
                default -> paymentMethod.getOwnerName() + " - Оплата наличкой";
            };
            System.out.println(description);
        }
    }


    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[]{
                new CreditCard("Иван", 1000, "128768", "2015"),
                new BankTransfer("Степан", 2000, "123432"),
                new CryptoWallet("Василий", 3000, "Test", "Test"),
                new PaymentMethod("Виталий", 5000),
                new CreditCard("Алексей", 1000, "1111 1111 11111 1111", "2016")
        };
        processAll(paymentMethods);
        System.out.println();
        printTypes(paymentMethods);
    }
}
