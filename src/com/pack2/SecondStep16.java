package com.pack2;

import java.util.ArrayList;
import java.util.Vector;

public class SecondStep16
{
    Vector<Step16> meth1(ArrayList<Object> al)
    {
        Vector<Step16> v = new Vector<Step16>();

        for(int i = 0; i < al.size(); i++)
        {
            Step16 obj = (Step16) al.get(i);
            v.add(obj);
        }

        int count = 0;

        for(int i = 0; i < v.size(); i++)
        {
            Step16 obj = v.get(i);

            String name = obj.getEmpName();
            String rev = "";

            for(int j = name.length() - 1; j >= 0; j--)
            {
                rev = rev + name.charAt(j);
            }

            if(name.equalsIgnoreCase(rev))
            {
                System.out.println("Palindrome Employee Name : " + name);
                count++;
            }
        }

        System.out.println("Total Palindrome Names : " + count);

        return v;
    }

    public static void main(String[] args)
    {
        SecondStep16 obj = new SecondStep16();

        ArrayList<Object> al = new ArrayList<Object>();

        al.add(new Step16("Rohit", 20000, "Java"));
        al.add(new Step16("Naman", 20001, "Java"));
        al.add(new Step16("Madam", 20002, "Testing"));
        al.add(new Step16("Rahul", 20003, "Python"));

        obj.meth1(al);
    }
}