package Ass11;

import java.util.Scanner;

class Employee {
    private static int id = 5001;
    private String name;
    private String dept;
    private int eid;
    private int salary;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.eid = id++;
        this.salary = 3000;
    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.eid = id++;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Employee id: " + eid);
        System.out.println("salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();

        Employee e = new Employee(name, dept);
        e.displayInfo();

        System.out.println();

        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Department: ");
        String dept1 = sc.nextLine();
        System.out.print("Salary: ");
        int salary = sc.nextInt();

        Employee emp = new Employee(name1, dept1, salary);
        emp.displayInfo();

        sc.close();
    }
}
