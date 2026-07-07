package com.pack1;

public class Loop {
	void meth1()
	{
		System.out.println("Long");
		System.out.println("Short");
		
		Loop aboj=new Loop();
		aboj.meth2();
		
		System.out.println("java is awesome");
	}
	void meth2()
	{
		System.out.println("Fat");
		System.out.println("Thin");
		
		Loop aboj=new Loop();
		aboj.meth1();
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("End");
		
		Loop aboj=new Loop();
		aboj.meth1();
	}
}
