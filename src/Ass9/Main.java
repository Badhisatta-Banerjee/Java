package Ass9;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();

        Rectangle rect = new Rectangle(length, breadth);
        System.out.println(rect.area());
    }
}
