package com.pack1;


import java.util.ArrayList;
import java.util.Iterator;

public class Step12 
{
	void meth1()
	{
		System.out.println("Implementing Arraylist\n");
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);//Insertion order is maintained
		al.add(33);//Heterogeneous data is allowed
		al.add(null);//null value is allowes
		al.add(10);//Duplicates are allowed
		al.add(45);//It's available from java 1.2V
		al.add(1);//It size increase by Half (current capacity*3/2)+1
		al.add(99);//It is Not syschronized
		
		System.out.println("al : "+al);
		System.out.println("Size(): "+al.size());
		System.out.println("get(index): "+al.get(0));
		System.out.println("get(index): "+al.get(al.size()-1));
		
		System.out.println("\nReleriving the data by using for loop");
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)+" ");
		}
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i)+" ");
		}
		System.out.println("\nReteriving the data by using foreach loop");
		for(Object data: al)
		{
			System.out.println(data+" ");
		}
		System.out.println("\nReterviing the data by using Iterator Interface");
		Iterator<Integer> i=al.iterator(); //[10, 33,10,6,45,1,99]
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\n-------------Methods-----------------");
		System.out.println("isEmpty(): "+al.isEmpty());
		//al.clear();
		//System.out.println("isEmpty(): "+al.isEmpty());
		System.out.println("Contains(): "+al.contains(99));
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(10);
		al2.add(450);
		
		System.out.println("containsAll(): "+al.contains(al2));
		System.out.println("Before: "+al);
		al.addAll(al2);
		System.out.println("After: "+al);
		al.add(3,50);
		System.out.println(al);
		al.add(al.size(),500);
		System.out.println(al);
		al.set(5, 450);
		System.out.println(al);
		al.remove((Object).500);
		System.out.println(al);
		al.remove(1);//Index position
		System.out.println(al);
		//al.removeAll(al2);
		al.retainAll(al2);
		System.out.println(al);
	}
	public static void main(String[] args) {
		Step12 aobj=new Step12();
		aobj.meth1();
	}

}
