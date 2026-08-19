package com.pack1;

public class NinethAug19 extends EigthAug19 
{
	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	NinethAug19()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}//4
		System.out.println("hi");
		System.out.println(show(50));
	}
	NinethAug19(int a)
	{
		System.out.println("===>"+(a++ +show(50)));
	}
	public static void main(String[] args) {
		new NinethAug19().display();
	}

}
