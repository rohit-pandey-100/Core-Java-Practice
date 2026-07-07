package com.pack1;

public class ClassC {
	int meth1()
	{
		System.out.println("start");
		return 10;
	}
	int meth2()
	{
		System.out.println("This is the first int code");
		return 20;
	}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
		aobj.meth1();		
		aobj.meth2();
	}

}
