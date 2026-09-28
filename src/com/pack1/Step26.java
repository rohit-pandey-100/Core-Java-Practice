package com.pack1;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.stream.*;
import java.util.List;
public class Step26 
{
	void meth1()
	{
		System.out.println("Meth1() called");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.forEach(data->System.out.println(data));
		
	}
	void meth2()
	{
		System.out.println("Meth2() called");
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("java");
		al2.add("Rohit");
		al2.add("Monica");
		al2.add("Swaytha");
		
		//Stream<String> s1=al2.stream();
		//Stream<String> s2=s1.filter(data->data.length()<=5);
		//long val=s2.count();
		//System.out.println("There are "+val+" Objects whose length = 4");
		System.out.println("There are "+ al2.stream().filter(data->data.length()<=5).count()
		+" Objects whose length = 5");
	}
	void methd3()
	{
		System.out.println("Meth3() called");
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		
		al3.add(1);
		al3.add(2);
		al3.add(3);
		al3.add(4);
		al3.add(5);
		System.out.println("Before al3:"+al3);
		
		Stream<Integer> s1=al3.stream();
		Stream<Integer> s2=s1.map(data->
		{
			if(data%2==0)
			{
				return data*2;
			}
			else
			{
				return data;
			}
		}
		
		);
		List<Integer> li=s2.collect(Collectors.toList());
		System.out.println("After al3:"+li);
	}
	void meth4()
	{
		System.out.println("Meth4() called");
		ArrayList<Integer> al4=new ArrayList<Integer>();
		
		al4.add(1);
		al4.add(4);
		al4.add(5);
		al4.add(2);
		al4.add(3);
		System.out.println("Before sorting al4:"+al4);
		
		//Collections.sort(al4);
		//System.out.println("After sorting al4:"+al4);
		//Sorting the data by using the Lambda expresions
		
		List<Integer> li=al4.stream().sorted().collect(Collectors.toList());
		System.out.println("Using the Stream sorting al4:"+li);
		
	}
	public static void main(String[] args) {
		Step26 obj=new Step26();
		//obj.meth1();
		//obj.meth2();
		//obj.methd3();
		obj.meth4();
	}
}
