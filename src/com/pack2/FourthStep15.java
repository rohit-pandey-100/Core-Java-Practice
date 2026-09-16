package com.pack2;

import java.util.ArrayList;
import java.util.Scanner;

public class FourthStep15 {

    void meth1() {

        System.out.println("Task 2");

        ArrayList<String> al = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 words:");

        for (int i = 0; i < 5; i++) {

            al.add(sc.nextLine());
        }

        System.out.println("ArrayList:");

        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i));
        }

        sc.close();
    }

    public static void main(String[] args) {

        FourthStep15 obj = new FourthStep15();

        obj.meth1();
    }
}