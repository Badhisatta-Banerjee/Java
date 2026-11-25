package Ass27;

import java.util.Scanner;

class OrderConfirmation extends Thread {
    private String customerName;

    public OrderConfirmation(String customerName) {
        this.customerName = customerName;
        setName("OrderConfirmation");
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + ": Order confirmed for " + customerName);
            sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Order confirmation interrupted.");
        }
    }
}

class FoodPreparation extends Thread {
    public FoodPreparation() {
        setName("FoodPreparation");
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + ": Food preparation started");
            sleep(800);
            System.out.println(getName() + ": Food preparation completed");
        } catch (InterruptedException e) {
            System.out.println("Food preparation interrupted.");
        }
    }
}

class Delivery extends Thread {
    public Delivery() {
        setName("Delivery");
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + ": Delivery started");
            sleep(600);
            System.out.println(getName() + ": Order delivered");
        } catch (InterruptedException e) {
            System.out.println("Delivery interrupted.");
        }
    }
}

class Order {
    private int orderId;
    private String customerName;
    private String foodItem;

    public Order(int orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void processOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println();

        OrderConfirmation cf = new OrderConfirmation(customerName);
        FoodPreparation pr = new FoodPreparation();
        Delivery dl = new Delivery();

        try {
            cf.start();
            cf.join();

            pr.start();
            pr.join();

            dl.start();
            dl.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Order ID: ");
        int orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Food Item: ");
        String foodItem = sc.nextLine();

        System.out.println("\nOutput");

        Order order = new Order(orderId, customerName, foodItem);
        order.processOrder();

        sc.close();
    }
}