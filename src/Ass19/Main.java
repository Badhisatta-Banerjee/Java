package Ass19;

class Person {
    String name;
    int age;
    long contactNumber;

    public Person(String name, int age, long contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }
}

class Student extends Person {
    int rollNumber;
    String course;
    int semester;

    public Student(String name, int age, long contactNumber, int rollNumber, String course, int semester) {
        super(name, age, contactNumber);
        this.rollNumber = rollNumber;
        this.course = course;
        this.semester = semester;
    }

    public void displayStudent() {
        System.out.println("===== STUDENT INFORMATION =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println();
    }
}

class Teacher extends Person {
    int employeeID;
    String subject;
    double salary;

    public Teacher(String name, int age, long contactNumber, int employeeID, String subject, double salary) {
        super(name, age, contactNumber);
        this.employeeID = employeeID;
        this.subject = subject;
        this.salary = salary;
    }
}

interface Researcher {
    void conductResearch();
}

class Professor extends Teacher implements Researcher {
    public Professor(String name, int age, long contactNumber, int employeeID, String subject, double salary) {
        super(name, age, contactNumber, employeeID, subject, salary);
    }

    @Override
    public void conductResearch() {
        System.out.println("Professor is conducting research.");
    }

    public void displayProfessor() {
        System.out.println("===== PROFESSOR INFORMATION =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: Rs. " + salary);
        conductResearch();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rahul Sharma", 20, 9876543210L, 101, "B.Tech CSE", 4);
        student.displayStudent();

        Professor professor = new Professor("Dr. Ananya Sen", 45, 9123456780L, 501, "Artificial Intelligence", 85000.0);
        professor.displayProfessor();
    }
}
