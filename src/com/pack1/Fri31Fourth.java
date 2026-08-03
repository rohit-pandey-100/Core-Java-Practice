package com.pack1;

public class Fri31Fourth 
{
	void meth1()
	{
		System.out.println("Java is awesome");
	}
	Fri31Fourth()
	{
		this(1000);
		System.out.println("Fri31Fourth default cons");
		//new Fri31Fourth(500);
		//this(500); //C.E
		this.meth1();
	}
	Fri31Fourth(int x)
	{
		System.out.println("Fri31Fourth para cons: "+x);
		this.meth1();
	}
	public static void main(String[] args) {
		new Fri31Fourth();
	}

}
