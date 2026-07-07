package com.pack1;

public class TClassF {
	public String method1()
	{
		System.out.println("Who is the best");
		return new TClassF().method2(new TClassF().method4());
	}
	public String method2(int x)
	{
		System.out.println("is the best");
		return new TClassF().method3();
	}
	public int method4()
	{
		System.out.println("Rohit");
		return 10;
	}
	public String method3()
	{
		System.out.println("yes");
		return "Okay";
	}
	public static void main(String[] args) {
		TClassF aboj=new TClassF();
		aboj.method1();
	}

}
