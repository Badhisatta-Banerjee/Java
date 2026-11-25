package Ass20;

public class ElectricityBill {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("3 Arguments Required.");
            return;
        }

        String customerName = args[0];
        String customerId = args[1];
        int unitsConsumed = Integer.parseInt(args[2]);

        double basicBill = 0.0;

        if (unitsConsumed <= 100) {
            basicBill = unitsConsumed * 2.00;
        } else if (unitsConsumed <= 200) {
            basicBill = (100 * 2.00) + ((unitsConsumed - 100) * 3.00);
        } else {
            basicBill = (100 * 2.00) + (100 * 3.00) + ((unitsConsumed - 200) * 5.00);
        }

        double surcharge = 0.0;
        if (basicBill > 1000) {
            surcharge = basicBill * 0.05;
        }

        double totalBill = basicBill + surcharge;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.printf("Basic Bill    : Rs.%.2f\n", basicBill);
        System.out.printf("Surcharge     : Rs.%.2f\n", surcharge);
        System.out.printf("Total Bill    : Rs.%.2f\n", totalBill);
    }
}