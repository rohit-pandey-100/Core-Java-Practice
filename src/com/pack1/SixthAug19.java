package com.pack1;

public class SixthAug19 
{
	void meth1()
	{
		System.out.println("SixthAug19 Meth1() Called");
	}
	SixthAug19()
	{
		System.out.println("SixthAug19 defult cons");
		this.meth1();
	}
	SixthAug19(int x)
	{
		this();
		this.meth1();
		System.out.println("SixthAug19 para cons: "+x);
	}
}
