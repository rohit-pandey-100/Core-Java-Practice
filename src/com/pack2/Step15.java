package com.pack2;

import java.util.ArrayList;

public class Step15 {

    ArrayList<Student> meth1(
            ArrayList<String> al1,
            boolean arr[],
            ArrayList<Integer> al2) {

        // Task 1:
        // Print all elements present in al1 in reverse order
        System.out.println("Task 1: al1 in reverse order");

        for (int i = al1.size() - 1; i >= 0; i--) {
            System.out.println(al1.get(i));
        }


        // Task 2:
        // Use for-each loop to print data in arr
        System.out.println("\nTask 2: Elements of arr");

        for (boolean value : arr) {
            System.out.println(value);
        }


        // Task 3:
        // Pass all elements of al2 into another ArrayList
        // in reverse order and print the new ArrayList
        System.out.println("\nTask 3: al2 in reverse order");

        ArrayList<Integer> newAl2 = new ArrayList<>();

        for (int i = al2.size() - 1; i >= 0; i--) {
            newAl2.add(al2.get(i));
        }

        System.out.println(newAl2);


        // Creating Student objects
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rohit", "Java", 85));
        students.add(new Student("Rahul", "Python", 90));
        students.add(new Student("Aman", "Java", 78));
        students.add(new Student("Vikas", "C++", 88));

        return students;
    }


    public static void main(String[] args) {

        // Creating object of ClassA
        Step15 obj = new Step15();


        // ArrayList<String>
        ArrayList<String> al1 = new ArrayList<>();

        al1.add("Java");
        al1.add("Python");
        al1.add("HTML");
        al1.add("CSS");


        // boolean array
        boolean arr[] = {true, false, true, false};


        // ArrayList<Integer>
        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);


        // Calling meth1()
        ArrayList<Student> result = obj.meth1(al1, arr, al2);


        // Task 4:
        // Print only Student Name & Marks
        System.out.println("\nTask 4: Student Name & Marks");

        for (Student s : result) {
            System.out.println(
                    "Student Name: " + s.studentName +
                    " | Marks: " + s.studentMarks
            );
        }
    }
}


// Student Class
class Student {

    String studentName;
    String studentBranch;
    int studentMarks;


    // Constructor
    Student(String studentName, String studentBranch, int studentMarks) {

        this.studentName = studentName;
        this.studentBranch = studentBranch;
        this.studentMarks = studentMarks;
    }
}