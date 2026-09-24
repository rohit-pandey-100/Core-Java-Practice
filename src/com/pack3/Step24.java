package com.pack3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Step24 
{
	public static void main(String[] args) 
	{
		//interface SecondStep24 
		SecondStep24 x=(a,al)->
		{
			System.out.println("SecondStep24");
			System.out.println("Interface SecondStep24 integer Value: "+a);
			System.out.println("Interface SecondStep24 ArrayList: "+al);
		};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add("Java");
		//al.add('A');
		//al.add(false);
		al.add(100);
		al.add(1000);
		al.add(10000);
		
		x.meth1(1, al);
		
		//interface ThirdStep24
		
		ThirdStep24 y=(a,s,c)->
		{
			return a+" "+s+" "+c;
		};
		String result=y.meth2(10, "Java", 'A');
		System.out.println(result);
		
		//interface FourthStep24
		
		FourthStep24 z=(a,b)-> 
		{
			System.out.println("Interface FourthStep24");
			System.out.println("Interface FourthStep24 integer value: "+a);
			b.display();
		};
		SeventhStep24 obj=new SeventhStep24();
		z.meth3(10, obj);
		
		// interface FivethStep24
		
		FivethStep24 p=(map, list)->
		{
			System.out.println("interface FivethStep24");
			System.out.println("interface FivethStep24 HashMap: "+map);
			System.out.println("interface FivethStep24 ArrayList: "+list);
		};
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Python");
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Rohit");
		list.add("Python");
		list.add("Core Java");
		
		p.meth4(map, list);
		
		//interface SixthStep24
		
		SixthStep24 q=(arr, ts)->
		{
			System.out.println("interface SixthStep24");
			System.out.println("interface SixthStep24 TreeSet: "+ts);
			
			return arr;	
		};
		
		int arr[]= {10,20,30,40,50};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(1000);
		ts.add(10000);
		ts.add(100000);
		
		int resultArr[]=q.meth5(arr, ts);
		
		System.out.println("Returned Array");
		
		for(int data:resultArr)
		{
			System.out.println(data);
		}
	}
}
