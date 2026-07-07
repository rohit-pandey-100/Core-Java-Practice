package com.pack1;

public class Tu23
{
	public int method1()
	{
		System.out.println("Java");
		return new Tu23().method3(new Tu23().method2(),7);
	}
	public String method2()
	{
		System.out.println("is the");
		return "new" ;
	}
	public int method3(String string, int b)
	{
		System.out.println("best");
		return 20;
	}
	public String method4()
	{
		System.out.println("language");
		return "best";
	}
	public static void main(String[] arg) 
	{
		Tu23 aboj=new Tu23();
		//aboj.method1();
		/*
		 * int result=aboj.method1(); System.out.println(result);
		 */
		System.out.println(aboj.method1());		
	}
}