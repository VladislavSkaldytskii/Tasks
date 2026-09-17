package ru.skaldytskiivladislav.task4_6;

public class Bank {
    private final String name;
    private final BankAccount[] accounts;
    private int accountCount;
    public static final int MAX_ACCOUNTS = 50;

    public Bank(String name) {
        this.name = name;
        this.accounts = new BankAccount[MAX_ACCOUNTS];
        this.accountCount = 0;
    }

    public BankAccount openAccount(String ownerName, String type) {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Ошибка: достигнут лимит счетов");
            return null;
        }
        BankAccount account = new BankAccount(ownerName, type);
        accounts[accountCount++] = account;
        System.out.println("Открыть счет " + account.getId() + " для " + ownerName);
        return account;
    }

    public BankAccount findAccount(String id) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getId().equals(id)) return accounts[i];
        }
        return null;
    }

    public void printReport() {
        System.out.println("\n" + "=".repeat(55));
        System.out.println("ОТЧЁТ БАНКА: " + name);
        System.out.println("=".repeat(55));
        System.out.println("Всего счетов: " + accountCount);

        double totalBalance = 0;
        for (int i = 0; i < accountCount; i++) {
            totalBalance += accounts[i].getBalance();
            System.out.printf("%-12s | %-15s | %10.2f руб.%n", accounts[i].getId(), accounts[i].getOwnerName(), accounts[i].getBalance());
        }
        System.out.println("-".repeat(55));
        System.out.printf("Суммарный баланс: %.2f руб.%n", totalBalance);
        System.out.println("=".repeat(55));
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Альфа-Банк");

        BankAccount ivan = bank.openAccount("Иван Иванов", "DEBIT");
        BankAccount mari = bank.openAccount("Мария Петрова", "SAVINGS");
        BankAccount alex = bank.openAccount("Алексей Смирнов", "SAVINGS");

        ivan.deposit(50000, "Зарплата");
        ivan.deposit(10000, "Фриланс");
        ivan.withdraw(15000, "Аренда квартиры");
        ivan.withdraw(5000, "Продукты");
        alex.withdraw(10000,"Test");
        alex.deposit(-1000,"Test");

        mari.deposit(10000, "Накопления");

        ivan.transfer(alex, 8000);

        ivan.printStatement();
        mari.printStatement();
        alex.printStatement();

        bank.printReport();
    }
}
