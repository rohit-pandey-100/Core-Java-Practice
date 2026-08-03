package com.pack1;

public class Fri31Third 
{
	Fri31Third meth1()
	{
		System.out.println("Meth1() Called");
		return this;
	}
	Fri31Third meth2()
	{
		System.out.println("Meth2() Called");
		return this;
	}
	void meth3()
	{
		System.out.println("Meth3() Called");
	}
	public static void main(String[] args) {
		new Fri31Third().meth1().meth2().meth3();
		// method chaining
	}

}
