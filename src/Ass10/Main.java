package Ass10;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        if (grade != null && !grade.isEmpty()) {
            System.out.println("Grade: " + grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        
        Student s=new Student(name, age);
        s.displayInfo();

        String name1=sc.nextLine();
        int age1=sc.nextInt();
        sc.nextLine();
        String grade1=sc.nextLine();

        Student s1=new Student(name1, age1,grade1);
        s1.displayInfo();
        
        sc.close();
    }
}