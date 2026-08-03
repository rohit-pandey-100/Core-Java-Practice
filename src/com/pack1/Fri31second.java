package com.pack1;

public class Fri31second 
{
	static void meth1()
	{
		System.out.println("Meth1() Called");
		//this.meth4(); //C.E beacuse we cant use "this" keyword inside a STATIC AREA
		
	}
	void meth2()
	{
		this.meth1(); //As it is a static method, it is recommended to call with class name
		System.out.println("Meth2() Called ");
	}
	void meth3()
	{
		this.meth2();
		System.out.println("Meth3() called");
	}
	void meth4()
	{
		System.out.println("Java is awesome");
	}
	public static void main(String[] args)
	{
		new Fri31second().meth3();
		//this.meth3(); // C.E because we cant use this keyword inside a STATIC AREA
	}

}
