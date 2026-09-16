package com.pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class SixthStep15 {

    void meth1() {

        System.out.println("Task 3");

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(2);
        al.add(3);
        al.add(5);
        al.add(4);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(10);
        al.add(11);

        Iterator<Integer> i = al.iterator();

        while (i.hasNext()) {

            Integer e = i.next();

            if (e % 2 == 0) {

                i.remove();
            }
        }

        System.out.println(al);
    }

    public static void main(String[] args) {

        SixthStep15 obj = new SixthStep15();

        obj.meth1();
    }
}