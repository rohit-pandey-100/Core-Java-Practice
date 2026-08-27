package com.pack1;

public class Aug27
{
	void meth1()
	{
		System.out.println(10);
		//System.out.println(20/0); // Due to This line of the code occured the exception 
		//Used Excepetion Handling
		try
		{
			System.out.println("The try block executed");
			System.out.println(20/0);
		}
		catch(ArithmeticException ea)
		{
			System.out.println("The catch blocked executed");
			
		}
		finally
		{
			System.out.println("The finally blocked executed");
		}
		System.out.println(30);
	}
	public static void main(String[] args) {
		Aug27 obj=new Aug27();
		obj.meth1();
	}
}