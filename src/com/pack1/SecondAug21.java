package com.pack1;

public class SecondAug21 extends Aug21 
{
	@Override
	void meth1() //over ridding
	{
		System.out.println(10);
	}
	@Override
	public int meth2(int data)
	{
		System.out.println(20);
		return 2;
	}
	@Override
	protected void meth3(String data, int i)
	{
		System.out.println(30);
	}
	//@Override
	static void meth4() // static method can't be overriding it allways do overhidden
	{
		System.out.println(40);
	}
	Aug21 meth5()
	{
		System.out.println();
		return new SecondAug21();
	}
	public static void main(String[] args) 
	{
		Aug21 obj=new Aug21();
		obj.meth1();
		
		System.out.println("----------------");
		Aug21 obj2=new SecondAug21();
		obj2.meth1();
		obj2.meth2(500);
		obj2.meth3("Java", 100);
		obj2.meth4();
		obj.meth5();
		
	}
}
