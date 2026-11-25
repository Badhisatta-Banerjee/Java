package Ass23.hr;

import Ass23.emp.Employee;

public class HRManager extends Employee {
    public HRManager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary, department);
    }

    public void displayInformation() {
        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
