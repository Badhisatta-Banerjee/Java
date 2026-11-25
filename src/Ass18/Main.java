package Ass18;

abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void displayBasicDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + amount);
    }

    public abstract void processPayment();

    public abstract void displayPaymentDetails();
}

class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment processed using Credit Card.");
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("Credit Card Payment Details displayed.");
    }
}

class UPIPayment extends Payment {

    public UPIPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment processed using UPI.");
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println("UPI Payment Details displayed.");
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment ccPayment = new CreditCardPayment("TXN101", 2500.0);
        UPIPayment upiPayment = new UPIPayment("TXN102", 1500.0);

        System.out.println("----- CREDIT CARD PAYMENT -----");
        ccPayment.displayBasicDetails();
        ccPayment.processPayment();
        ccPayment.displayPaymentDetails();

        System.out.println();

        System.out.println("----- UPI PAYMENT -----");
        upiPayment.displayBasicDetails();
        upiPayment.processPayment();
        upiPayment.displayPaymentDetails();
    }
}