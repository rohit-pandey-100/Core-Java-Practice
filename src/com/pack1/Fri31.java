package com.pack1;

public class Fri31
{
	int num=10; //Instance Variable
	static int num2=20;
	
	void meth1()
	{
		System.out.println("Meth1() called ");
		System.out.println("static variable: "+ Fri31.num2);
		System.out.println("\nfrom meth1(): "+this.hashCode());
	}
	public static void main(String[] args) {
		Fri31 obj1=new Fri31();
		obj1.meth1();
		
		System.out.println("From main()obj: "+obj1.hashCode());
		System.out.println("------------------------");
		
		Fri31 obj2=new Fri31();
		obj2.meth1();
		System.out.println("From main()obj: "+obj2.hashCode());
	}
}