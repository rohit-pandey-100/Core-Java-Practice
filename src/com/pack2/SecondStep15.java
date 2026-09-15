package com.pack2;

import java.util.ArrayList;
import java.util.Collections;

public class SecondStep15 {

    ArrayList<Student1> meth1(ArrayList<String> al1, boolean arr[], ArrayList<Integer> al2) {

        // Task 1
        System.out.println("Task 1: al1 in reverse order");

        for (int i = al1.size() - 1; i >= 0; i--) {
            System.out.println(al1.get(i));
        }


        // Task 2
        System.out.println("\nTask 2: Elements of arr");

        for (boolean data : arr) {
            System.out.println(data);
        }


        // Task 3
        System.out.println("\nTask 3: al2 in reverse order");

        ArrayList<Integer> newal2 = new ArrayList<Integer>();

        newal2.addAll(al2);

        Collections.reverse(newal2);

        System.out.println(newal2);


        // Task 4
        ArrayList<Student1> Students = new ArrayList<Student1>();

        Students.add(new Student1("Rohit", "Java", 85));
        Students.add(new Student1("Rahul", "Python", 90));
        Students.add(new Student1("Aman", "Java", 78));
        Students.add(new Student1("Vikas", "C++", 88));

        return Students;
    }


    public static void main(String[] args) {

        SecondStep15 obj = new SecondStep15();


        // ArrayList<String>
        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("Java");
        al1.add("Python");
        al1.add("HTML");
        al1.add("CSS");


        // boolean array
        boolean arr[] = {true, false, true, false};


        // ArrayList<Integer>
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);


        // Calling meth1()
        ArrayList<Student1> result = obj.meth1(al1, arr, al2);


        // Task 4
        System.out.println("\nTask 4: Student Name & Marks");

        for (Student1 s : result) {

            System.out.println(
                    "Student Name: " + s.studentName +
                    " | Marks: " + s.studentMarks
            );
        }
    }
}