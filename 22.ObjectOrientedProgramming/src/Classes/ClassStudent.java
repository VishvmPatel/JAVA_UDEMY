package Classes;

import java.util.Scanner;

class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String details() {
        return "Roll No: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
}

public class ClassStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter the Roll No: ");
        s.roll = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter the Full Name of the Student: ");
        s.name = sc.nextLine();

        System.out.println("Enter the Course: ");
        s.course = sc.nextLine();

        System.out.println("Enter Marks of the Student in 3 Subjects: ");
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();

        System.out.println("\nDetails:\n" + s.details());
        System.out.println("Total: " + s.total());
        System.out.println("Average: " + s.average());
        System.out.println("Grade achieved: " + s.grade());
    }
}

