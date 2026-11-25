package Ass23.emp;

public class Employee {
    private String name;
    int employeeId;
    protected double salary;
    public String department;

    public Employee(String name, int employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}