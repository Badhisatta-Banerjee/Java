package Ass12;

import java.util.Scanner;

class Borrower {
    private int borrowerId;
    private String borrowerName;

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void displayBorrowerDetails() {
        System.out.println("Borrower ID: " + borrowerId + ", Name: " + borrowerName);
    }
}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private Borrower borrower;

    public void setData(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.borrower = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void borrowBook(Borrower borrower) {
        if (this.isAvailable) {
            this.isAvailable = false;
            this.borrower = borrower;
            System.out.println("Success: '" + title + "' has been borrowed by " + borrower.getBorrowerName() + ".");
        } else {
            System.out.println("Sorry: '" + title + "' is currently already borrowed.");
        }
    }

    public void returnBook() {
        if (!this.isAvailable) {
            this.isAvailable = true;
            this.borrower = null;
            System.out.println("Success: '" + title + "' has been returned successfully.");
        } else {
            System.out.println("Notice: '" + title + "' was not borrowed.");
        }
    }

    public void displayDetails() {
        System.out.print("Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
        if (!isAvailable && borrower != null) {
            System.out.print("Borrowed By: " + borrower.getBorrowerName() + " (ID: " + borrower.getBorrowerId() + ")");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[3];
        Borrower[] borrowers = new Borrower[3];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
        }
        books[0].setData("Java Programming", "James Gosling", true);
        books[1].setData("Data Structures", "Robert Lafore", true);
        books[2].setData("Clean Code", "Robert C. Martin", true);

        for (int i = 0; i < borrowers.length; i++) {
            borrowers[i] = new Borrower();
        }
        borrowers[0].setBorrowerId(101);
        borrowers[0].setBorrowerName("Alice Smith");

        borrowers[1].setBorrowerId(102);
        borrowers[1].setBorrowerName("Bob Johnson");

        borrowers[2].setBorrowerId(103);
        borrowers[2].setBorrowerName("Charlie Brown");

        int choice = 0;

        while (choice != 7) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display All Books");
            System.out.println("2. Display All Borrowers");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- All Books ---");
                    for (Book b : books) {
                        b.displayDetails();
                    }
                    break;

                case 2:
                    System.out.println("\n--- All Borrowers ---");
                    for (Borrower b : borrowers) {
                        b.displayBorrowerDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Title to search: ");
                    String searchTitle = sc.nextLine();
                    boolean titleFound = false;
                    for (Book b : books) {
                        if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                            b.displayDetails();
                            titleFound = true;
                        }
                    }
                    if (!titleFound)
                        System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Author Name to search: ");
                    String searchAuthor = sc.nextLine();
                    boolean authorFound = false;
                    for (Book b : books) {
                        if (b.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            b.displayDetails();
                            authorFound = true;
                        }
                    }
                    if (!authorFound)
                        System.out.println("No books found by that author.");
                    break;

                case 5:
                    System.out.print("Enter Borrower ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();

                    Borrower currentBorrower = null;
                    for (Borrower b : borrowers) {
                        if (b.getBorrowerId() == bId) {
                            currentBorrower = b;
                            break;
                        }
                    }

                    if (currentBorrower == null) {
                        System.out.println("Borrower ID not found.");
                        break;
                    }

                    System.out.print("Enter the Title of the book you want to borrow: ");
                    String borrowTitle = sc.nextLine();
                    boolean bookFoundForBorrow = false;

                    for (Book b : books) {
                        if (b.getTitle().equalsIgnoreCase(borrowTitle)) {
                            b.borrowBook(currentBorrower);
                            bookFoundForBorrow = true;
                            break;
                        }
                    }
                    if (!bookFoundForBorrow)
                        System.out.println("Book not found.");
                    break;

                case 6:
                    System.out.print("Enter the Title of the book you want to return: ");
                    String returnTitle = sc.nextLine();
                    boolean bookFoundForReturn = false;

                    for (Book b : books) {
                        if (b.getTitle().equalsIgnoreCase(returnTitle)) {
                            b.returnBook();
                            System.out.println("Updated Book Details:");
                            b.displayDetails();
                            bookFoundForReturn = true;
                            break;
                        }
                    }
                    if (!bookFoundForReturn)
                        System.out.println("Book not found.");
                    break;

                case 7:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option (1-7).");
            }
        }
        sc.close();
    }
}
