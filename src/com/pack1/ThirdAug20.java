package com.pack1;

public class ThirdAug20 
{
	void meth1()
	{
		System.out.println(10);
	}
	void meth1(int x)
	{
		System.out.println(20);
	}
	void meth1(String s)
	{
		System.out.println(30);
	}
	void meth1(char c)
	{
		System.out.println(40);
	}
	void meth1(boolean t)
	{
		System.out.println(50);
	}
	void meth1(double d)
	{
		System.out.println(60);
	}
	public static void main(String[] args) {
		ThirdAug20 obj=new ThirdAug20();
		obj.meth1();
		obj.meth1(10);
		obj.meth1("Rohit");
		
		
	}

}
