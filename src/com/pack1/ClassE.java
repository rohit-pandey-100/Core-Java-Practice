package com.pack1;

public class ClassE {
	void meth1()
	{
		System.out.println("Long");
		System.out.println("Short");
		
		ClassE aboj=new ClassE();
		aboj.meth2();
		
		System.out.println("java is awesome");
	}
	void meth2()
	{
		System.out.println("Fat");
		System.out.println("Thin");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("End");
		
		ClassE aboj=new ClassE();
		aboj.meth1();
	}

}
