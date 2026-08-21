package com.pack1;

public class Aug21
{
	void meth1() // overridden
	{
		System.out.println("Aug21-Meth1() Called");
	}
	protected int meth2(int x)
	{
		System.out.println("Aug21-Meth2() Called");
		return 2;
	}
	void meth3(String s, int x)
	{
		System.out.println("Aug21-Meth3() Called");
	}
	static void meth4()
	{
		System.out.println("Aug21-Meth4() Called");
	}
	Aug21 meth5()
	{
		System.out.println("Aug21-Meth5() Called");
		return new SecondAug21();
	}
}