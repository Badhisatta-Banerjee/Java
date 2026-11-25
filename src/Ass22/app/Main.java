package Ass22.app;

import Ass22.customer.Customer;
import Ass22.bank.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Phone: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Initial Balance: ");
        int balance = sc.nextInt();

        Customer c = new Customer(customerId, customerName, phoneNumber);
        Account a = new Account(1001, balance);

        System.out.print("\nDeposit: ");
        int deposit = sc.nextInt();
        a.deposit(deposit);

        System.out.print("Withdraw: ");
        int withdraw = sc.nextInt();

        if(a.withdraw(withdraw)){
            System.out.println("\nCustomer ID: " + c.getCustomerID());
            System.out.println("Customer Name: " + c.getCustomerName());
            a.displayBalance();
        }else{
            System.out.println("\nInsufficient Balance");
            a.displayBalance();
        }
        
        sc.close();
    }
}