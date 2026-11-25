package Ass21.app;

import Ass21.student.Student;
import Ass21.result.Result;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        
        System.out.print("Roll No: ");
        int rollNumber = sc.nextInt();
        
        System.out.print("Marks 1: ");
        int mark1 = sc.nextInt();
        
        System.out.print("Marks 2: ");
        int mark2 = sc.nextInt();
        
        System.out.print("Marks 3: ");
        int mark3 = sc.nextInt();

        Student s = new Student(studentId, studentName, rollNumber);
        Result r = new Result(mark1, mark2, mark3);

        System.out.println("\n--- Output ---");
        s.displayStudentInfo();
        System.out.println("Total Marks: " + r.calculateTotal());
        System.out.printf("Percentage: %.2f\n", r.calculatePercentage());
        System.out.println("Result: " + r.getFinalResult());
        
        sc.close();
    }
}