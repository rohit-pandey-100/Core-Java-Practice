package com.pack2;

import java.util.ArrayList;

public class ThirdStep15 
{
	void meth1()
	{
		System.out.println("Implementing Arraylist\n");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}		
	}
	public static void main(String[] args) {
		ThirdStep15 obj=new ThirdStep15();
		obj.meth1();
	}

}
