package Ass26;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > accountBalance) {
            throw new InsufficientBalanceException("Transaction failed: Insufficient balance.");
        }

        accountBalance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + (int) accountBalance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Account Balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();

        BankAccount account = new BankAccount("123456789", "User", initialBalance);

        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Available Balance: " + (int) account.accountBalance);
        } finally {
            System.out.println("Transaction completed.");
        }

        scanner.close();
    }
}
