package com.pack1;

public class Step29
{
	//Nested InnerClass
	private void meth1()
	{
		System.out.println("Outer Class method");
	}
	Step29()
	{
		System.out.println("Outer Class Construtor");
	}
	static
	{
		System.out.println("Static static block");
	}
	class InnerClassStep29
	{
		void msg()
		{
			System.out.println("Inner Class msg() Called");
		}
		InnerClassStep29()
		{
			System.out.println("Inner Class Constructor");
		}
		{
			System.out.println("Inner Class Instance block");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer Class main()");
		Step29.InnerClassStep29 obj=new Step29().new InnerClassStep29();
		obj.msg();
	}
}