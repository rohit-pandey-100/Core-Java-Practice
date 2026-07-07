package com.pack1;

public class ClassB {
	public void meth1()
	{
		System.out.println("Start");
	}
	public void meth2()
	{
		System.out.println("This is my first mthode code in the java");
	}
	public static void main(String[] args) {
		new ClassB().meth1();
		new ClassB().meth2();
	}
}