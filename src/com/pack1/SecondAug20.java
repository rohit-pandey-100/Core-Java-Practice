package com.pack1;

public class SecondAug20 extends Aug20 
{
	void meth2()
	{
		System.out.println("hello");
	}
	SecondAug20()
	{
		//this(300); //C.E because of Recursive constructor invocation
		System.out.println(30);
	}
	SecondAug20(int x)
	{
		this();
		this.meth2();
		super.meth1();
		System.out.println(40);
	}
	public static void main(String[] args) 
	{
		new SecondAug20(500);
	}
}
