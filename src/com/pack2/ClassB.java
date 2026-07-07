package com.pack2;

public class ClassB
{
	public int meth1(int x, int y)
	{
		return new ClassB().meth2(x+y,y);
	}
	public int meth2(int sum,int y)
	{
		return new ClassB().meth3(sum-y,y);
	}
	public int meth3(int sub,int y)
	{
		return new ClassB().meth4(sub*y,y);
	}
	public int meth4(int mult, int y)
	{
		System.out.println("Result Mult:"+mult);
		System.out.println("Final Value:"+y);
		return mult;
	}
	public static void main(String[] args) {
		new ClassB().meth1(400,200);
		
	}
}