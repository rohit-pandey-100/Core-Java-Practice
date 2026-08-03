package com.pack1;

public class Fri31Sixth 
{
	public int meth1(int a, int b)
	{
		System.out.println("MEth1() called");
		System.out.println(b);
		System.out.println(100);
		return (a+b)+10+(a-b);
	}
	public int meth2()
	{
		System.out.println("Meth2 Called");
		return this.meth3()+8; 
	}
	public Fri31Sixth()
	{
		this("java is awesome");
		System.out.println(50);
	}
	int meth3()
	{
		System.out.println("Meth3() Called");
		return 10;
	}
	public String meth4(int a, String s)
	{
		System.out.println("Meth4() Called");
		a=a+4;
		System.out.println("a value ==> "+a);
		System.out.println("s value ==>"+s);
		
		return s+"is object orientend prograaming language";
	}
	public int meth5(int a)
	{
		System.out.println("Meth5() Called");
		return 10-a;
	}
	public Fri31Sixth(String s)
	{
		String result=this.meth4(this.meth1(this.meth2(), this.meth5(5)+'A'-('a')),"Java");
		System.out.println(result);
		System.out.println(5);
	}
	public static void main(String[] args) {
		new Fri31Sixth();
	}

}
