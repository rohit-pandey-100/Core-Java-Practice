package com.pack1;

public class ClassD {
	public void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(100);
	}
	public void meth2()
	{
		System.out.println("meth2() called");
		System.out.println(200);
	}
	public static void main(String[] args) {
		System.out.println("This code belong's to the methode calling");
		System.out.println("Java is awesome");
		
		ClassD aboj=new ClassD();
				aboj.meth1();
				aboj.meth2();
				System.out.println("End");
	}

}
