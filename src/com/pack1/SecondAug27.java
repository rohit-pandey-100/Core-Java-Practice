package com.pack1;

public class SecondAug27 
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
			//System.out.println("The catch blocked executed");
			// When we want to find the all info about to the exception so we can used three way to print the exeception info
			//First
			//System.out.println(ea.getMessage()); // it gives the resion of the exeception
			//Second
			//System.out.println(ea.toString()); // it gives the name & resion of the execpetion
			ea.printStackTrace(); // it gives full info about the exeception
			
		}
		finally
		{
			System.out.println("The finally blocked executed");
		}
		System.out.println(30);
	}
	public static void main(String[] args) {
		SecondAug27 obj=new SecondAug27();
		obj.meth1();
	}
}
