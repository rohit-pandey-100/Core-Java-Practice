package com.pack1;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Enumeration;

public class SecondStep16 
{
	public void meth1()
	{
		System.out.println("Implementing the Vector\n");
		
		Vector<Object> v=new Vector<Object>();
		
		v.add(10); // Insertion order is maintained
		v.add("Java"); // Heterogeneous data is allowed
		v.add(null); // null value is allowed
		v.add(30); // Duplicates are allowed
		v.add(true); // It is available from java 1.0V[ It is called Legacy class]
		v.add('A'); // It's default capacity is 10
		v.add("Core"); // It's size incred by DOUBLE
		v.add(false); // It is Synchronized by default
		
		System.out.println(v);
		v.add(3,100);
		System.out.println(v);
		v.add(5,200);
		System.out.println(v);
		System.out.println("Size(): "+v.size());
		System.out.println("Capacity(): "+v.capacity());
		v.add("Advanced");
		System.out.println("Size(): "+v.size());
		System.out.println("Capacity(): "+v.capacity());
		
		System.out.println("\nReteriving the data by using the for loop");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println(" ");
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("Reteriving the data by using the foreach loop\n");
		for(Object data:v)
		{
			System.out.print(data+" ");
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nReteriving the data by using the Enumeration Interface\n");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nReteriving the data by using the Iterator Interface\n");
		Iterator<Object> I=v.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nPassing all the elemnts are presting in the vector into Arraylist\n");
		ArrayList<Object> al=new ArrayList<Object>(v);// Writing the v in the arraylist object is easy or simple way
		//By using the addAll method
		//al.addAll(v);
		//By using foreach loop
		/*for(Object data:v)
		{
			//System.out.println(al.add(data));
			al.add(data);
		}
		*/
		//By using for loop
		/*for(int i=0;i<=v.size()-1;i++)
		{
			al.add(v.get(i));
		}
		*/
		System.out.println("Vector(): "+v);
		System.out.println("ArrayList(): "+al);
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nPassing the user define ClassObject into the Vector\n");
		
		Vector<Step16> emp=new Vector<Step16>();
		
		emp.add(new Step16("Rohit", 29000, "Java"));
		emp.add(new Step16("Rohit", 26000, "Spring"));
		emp.add(new Step16("Roshni", 15000, "Cloud"));
		emp.add(new Step16("Ronak", 18000, "Tester"));
		emp.add(new Step16("Rohit", 20000, "Oracle"));
		emp.add(new Step16("Romiya", 20000, "Front-End"));
		emp.add(new Step16("Rohit", 26000, "Python"));
		
		ArrayList<String> empNames=new ArrayList<String>();
		
		Enumeration<Step16> em=emp.elements();
		while(em.hasMoreElements())
		{
			Step16 obj=em.nextElement();
			if(obj.getEmpSal()>=21000)
			{
				empNames.add(obj.getEmpName());
			}
		}
		System.out.println("\nEmployess whose salary is >=22000 are listed below");
		int count=1;
		for(String data:empNames)
		{
			System.out.println(count++ +")"+data);
		}	
	}
	public static void main(String[] args) {
		SecondStep16 obj=new SecondStep16();
		obj.meth1();
	}
}
