package Ass21.student;

public class Student {
    private  int studentId;
    private String studentName;
    private int rollNumber;

    public Student(int studentId, String studentName, int rollNumber){
        this.studentId=studentId;
        this.studentName=studentName;
        this.rollNumber=rollNumber;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);
    }
}