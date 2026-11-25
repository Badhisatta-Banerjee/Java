package Ass28;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount, String customerName) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(customerName + ": Withdrawal successful: " + amount);
        } else {
            System.out.println(customerName + ": Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Final Balance: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Output");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println();
    }
}

class CustomerThread implements Runnable {
    private BankAccount account;
    private int withdrawalAmount;
    private String customerName;

    public CustomerThread(BankAccount account, int withdrawalAmount, String customerName) {
        this.account = account;
        this.withdrawalAmount = withdrawalAmount;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        account.withdraw(withdrawalAmount, customerName);
    }
}

public class BankCounterTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Account Holder: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Initial Balance: ");
        int initialBalance = sc.nextInt();

        System.out.println();

        System.out.print("Customer-1 Withdrawal: ");
        int customer1Amount = sc.nextInt();

        System.out.print("Customer-2 Withdrawal: ");
        int customer2Amount = sc.nextInt();
        System.out.println();

        sc.close();

        BankAccount bank = new BankAccount(accountNumber, accountHolderName, initialBalance);

        bank.displayAccountInfo();

        Thread customer1 = new Thread(new CustomerThread(bank, customer1Amount, "Customer-1"));
        Thread customer2 = new Thread(new CustomerThread(bank, customer2Amount, "Customer-2"));

        customer1.start();
        customer2.start();

        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println();
        bank.displayBalance();
    }
}