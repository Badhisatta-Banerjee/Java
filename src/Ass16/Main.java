package Ass16;

class Products {
    private int productID;
    private String productName;
    private double price;

    public Products(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Products {
    private String warranty;
    private String brand;

    public Electronics(int productID, String productName, double price, String warranty, String brand) {
        super(productID, productName, price);
        this.warranty = warranty;
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== ELECTRONICS =====");
        super.displayInfo();
        System.out.println("Warranty: " + warranty);
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Products {
    private String size;
    private String fabric;

    public Clothing(int productID, String productName, double price, String size, String fabric) {
        super(productID, productName, price);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== CLOTHING =====");
        super.displayInfo();
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}

class Book extends Products {
    private String author;
    private String publisher;
    
    public Book(int productID, String productName, double price, String author, String publisher) {
        super(productID, productName, price);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== BOOK =====");
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

public class Main {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, "Laptop", 55000.0, "2 years", "Dell");
        e.displayInfo();

        System.out.println();

        Clothing c = new Clothing(102, "T-Shirt", 999.0, "L", "Cotton");
        c.displayInfo();

        System.out.println();

        Book b = new Book(103, "Java Programming", 650.0, "Herbert Schildt", "McGraw Hill");
        b.displayInfo();
    }
}