package Ass22.customer;

public class Customer {
    private int customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(int customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}