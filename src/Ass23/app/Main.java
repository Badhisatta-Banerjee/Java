package Ass23.app;

import java.util.Scanner;
import Ass23.hr.HRManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Department: ");
        String dept = scanner.nextLine();

        HRManager manager = new HRManager(name, id, salary, dept);
        System.out.println();
        manager.displayInformation();

        scanner.close();
    }
}
