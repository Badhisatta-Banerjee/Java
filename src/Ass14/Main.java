package Ass14;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee id: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;
    private String department;

    public Manager(int employeeId, String name, double salary, int teamSize, String department) {
        super(employeeId, name, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    public void displayManagerInfo() {
        System.out.println("--- Manager details ---");

        displayEmployeeInfo();

        System.out.println("Team size: " + teamSize);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        int employeeId = 101;
        String name = "Rahul";
        double salary = 75000.0;
        int teamSize = 8;
        String department = "Software Development";

        Manager manager = new Manager(employeeId, name, salary, teamSize, department);
        manager.displayManagerInfo();
    }
}
