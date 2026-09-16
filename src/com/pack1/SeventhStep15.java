package com.pack1;

import java.util.ArrayList;

public class SeventhStep15 {

    void meth1() {

        System.out.println("Task 4");

        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(10);
        al1.add(20);
        al1.add(30);


        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al2.add(40);
        al2.add(50);
        al2.add(60);


        ArrayList<Integer> al3 = new ArrayList<Integer>();

        al3.addAll(al1);
        al3.addAll(al2);


        System.out.println("First ArrayList: " + al1);

        System.out.println("Second ArrayList: " + al2);

        System.out.println("Merged ArrayList: " + al3);
    }

    public static void main(String[] args) {

        SeventhStep15 obj = new SeventhStep15();

        obj.meth1();
    }
}