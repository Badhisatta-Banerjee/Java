package Ass24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Second Number: ");
        int secondNumber = sc.nextInt();

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Calculation completed.");
        }
        
        sc.close();
    }
}