package Ass25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdrawal Amount: ");
        int withdrawalAmount = sc.nextInt();

        sc.close();

        try {
            if (withdrawalAmount <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount.");
            }

            if (withdrawalAmount % 10 != 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount.\nAmount must be a multiple of 10.");
            }

            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Transaction failed: Insufficient balance.");
            }

            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + (int) balance);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error occurred.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ATM transaction completed.");
        }
    }
}
