package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SecondStep23 
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		
		ArrayList<Step23> al=new ArrayList<Step23>();
		
		Step23 obj1=new Step23("Rohit",20000,"Java");
		Step23 obj2=new Step23("Mohit",220000,"Adv-Java");
		Step23 obj3=new Step23("Karan",60000,"Core");
		Step23 obj4=new Step23("Kundan",5500,"Tester");
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		
		Iterator<Step23> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-------------------------------------------");
		Collections.sort(al); //Comparable
		Collections.sort(al, new ThirdStep23());//Comparator
		Iterator<Step23> i2=al.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	public static void main(String[] args) {
		SecondStep23 obj=new SecondStep23();
		obj.meth1();
	}

}
