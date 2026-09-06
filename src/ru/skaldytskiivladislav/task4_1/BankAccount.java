package ru.skaldytskiivladislav.task4_1;


public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма пополнения должна быть положительной");
            return false;
        }
        balance += amount;
        System.out.printf("Счет %s пополнен на %.2f руб. Баланс: %.2f%n", accountNumber, amount, balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма снятия должна быть положительной");
            return false;
        }

        if (amount > balance) {
            System.out.printf("Ошибка: недостаточно средств. Баланс: %.2f, запрошено: %.2f%n", balance, amount);
            return false;
        }
        balance -= amount;
        System.out.printf("Со счета %s снято %.2f руб. Баланс: %.2f%n", accountNumber, amount, balance);
        return true;
    }

    public void printStatement() {
        System.out.println("=".repeat(55));
        System.out.printf("Счёт: %-15s | Владелец: %s%n", accountNumber, ownerName);
        System.out.printf("Баланс: %.2f руб.%n", balance);
        System.out.println("-".repeat(55));
        System.out.println("=".repeat(55));
    }

    public String getId() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("10001", "Иван Иванов", 50000);

        BankAccount account2 = new BankAccount("10002", "Мария Петрова", 30000);

        BankAccount account3 = new BankAccount("10003", "Алексей Смирнов", 10000);

        System.out.println("Создано счетов: " + BankAccount.getTotalAccounts());

        account1.printStatement();

        account1.deposit(10000);
        account1.withdraw(5000);
        System.out.println("Баланс через getBalance(): " + account1.getBalance());

        account1.withdraw(10000);

        account2.printStatement();

        account2.deposit(5000);
        account2.withdraw(100000);

        account3.printStatement();
    }
}
