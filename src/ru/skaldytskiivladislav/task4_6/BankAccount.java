package ru.skaldytskiivladislav.task4_6;

public class BankAccount {
    private static int nextId = 1000;

    private final String id;
    private final String type;
    private String ownerName;
    private double balance;
    private final Transaction[] transactions;
    private int transactionCount;
    private static final int MAX_TRANSACTIONS = 100;

    public BankAccount(String type, String ownerName) {
        this.id = "ACC-" + (++nextId);
        this.type = type;
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.transactions = new Transaction[MAX_TRANSACTIONS];
        this.transactionCount = 0;
    }

    public boolean deposit(double amount, String description) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма пополнения должна быть положительной");
            return false;
        }
        balance += amount;
        addTransaction("Пополнение", amount, description);
        System.out.printf("Счет %s пополнен на %.2f руб. Баланс: %.2f%n", id, amount, balance);
        return true;
    }

    public void addTransaction(String type, double amount, String description) {
        if (transactionCount < MAX_TRANSACTIONS) {
            transactions[transactionCount++] = new Transaction(type, amount, balance, description);
        }
    }

    public boolean withdraw(double amount, String description) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма снятия должна быть положительной");
        }
        if (amount > balance) {
            System.out.printf("Ошибка: недостаточно средств. Баланс: %.2f, запрошено: %.2f%n", balance, amount);
            return false;
        }
        balance -= amount;
        addTransaction("Снятие ", amount, description);
        System.out.printf("Со счета %s снято %.2f руб. Баланс: %.2f%n", id, amount, balance);
        return true;
    }

    public boolean transfer(BankAccount target, double amount) {
        if (this.withdraw(amount, "Перевод на счет " + target.getId())) {
            target.deposit(amount, "Перевод на счет " + this.id);
            return true;
        }
        return false;
    }

    public void printStatement() {
        System.out.println("=".repeat(55));
        System.out.printf("Счёт: %-15s | Тип %-10s | Владелец: %s%n", id, ownerName, type);
        System.out.printf("Баланс: %.2f руб.%n", balance);
        System.out.println("-".repeat(55));
        if (transactionCount == 0) {
            System.out.println("Операций нет");
        } else {
            for (int i = 0; i < transactionCount; i++) {
                System.out.println(transactions[i]);
            }
        }
        System.out.println("=".repeat(55));
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
