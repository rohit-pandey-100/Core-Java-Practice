package com.pack1;

public class SecondStep29 
{
	//Static InnerClass
	
	int x=10; //Instance Variable
	static int y=20; //static variable
	SecondStep29()
	{
		System.out.println("Outer Class 1");
	}
	{
		System.out.println("Outer Class Instance block");
	}
	static
	{
		System.out.println("Outer class Static Block");
	}
	static class InnerClassSecondStep29
	{
		void msg()
		{
			System.out.println("Inner Class msg() Called");
			System.out.println("Outer Class Variable: "+new SecondStep29().x);
			System.out.println("Outer Class Variable:"+y);
		}
		InnerClassSecondStep29()
		{
			System.out.println("Inner class COnstructor");
		}
		{
			System.out.println("Inner class Instance Block");
		}
		static 
		{
			System.out.println("Inner Class static block");
		}
		public static void main(String[] args) {
			System.out.println("Inner class main()");
			new InnerClassSecondStep29().msg();
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer Class main()");
		SecondStep29.InnerClassSecondStep29 obj=new SecondStep29.InnerClassSecondStep29();
		obj.msg();
	}

}
