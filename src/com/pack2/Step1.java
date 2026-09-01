package com.pack2;

public class Step1 
{
	/*
	static void meth1() throws Exception
	{
		System.out.println("Before Exception");
		throw new Exception();
	}
	
	public static void main(String[] args)
	{
		try
		{
			meth1();
		}
		catch(Exception e)
		{
			System.out.println("Handle");
		}
	}
	*/
	
	
	/*
	public static void main(String[] args) 
	{
		try 
		{
			System.out.print("A ");
			throw new IllegalArgumentException();
		} 
		catch (RuntimeException e) 
		{
			System.out.print("B ");
		}
	}
	*/
	
	
	
	/*
	static void a() throws Exception
	{
		b();
	}

	static void b() throws Exception 
	{
		System.out.print("B ");
	}

	public static void main(String[] a) throws Exception 
	{
		a();
	}
	*/
	
	
	
	public static void main(String[] args) 
	{
		try 
		{
			System.out.print("A ");
			throw new Exception();
		} 
		catch (Exception e) 
		{
			System.out.print("B ");
			return;
		} 
		finally 
		{
			System.out.print("C ");

		}
	}
}
