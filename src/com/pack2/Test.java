package com.pack2;

import java.io.*;

public class Test 
{
	/*
	public static void main(String[] args) 
	{
		try 
		{
			try 
			{
				String s = null;
				s.length();
			} 
			catch (NullPointerException e) 
			{
				System.out.println("NullPointerExceptionHandled");
			}
		} 
		catch (Exception e) 
		{
		System.out.println("OuterException");
		}
		
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		try 
		{
			int x = 10 / 2;
		} 
		catch (ArithmeticException e)
		{
			System.out.print("ArithmeticException");
		} 
		catch (Exception e) 
		{
		System.out.print("Exception");
		}
	}
	*/
	
	
	/*
	public static void main(String[] args) 
	{
		try 
		{
			System.out.print("T");
		} 
		catch (Exception e) 
		{
			System.out.print("C");
		}
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		final FileInputStream fis;
		try 
		{
			fis = new FileInputStream("a.txt");
			try (fis) 
			{
				System.out.println("Reading File");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occurred");
		}
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		try 
		{
			try 
			{
				throw new NullPointerException();
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("ArithmeticException");
			}
			finally {
				System.out.println("InnerFinally");
			}
		} 
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerExceptionHandled");
		}
	}
	*/
	
	
	/*
	public static void main(String[] args) 
	{
		try 
		{
			int x = 10 / 0;
		} 
		catch (ArithmeticException e) 
		{
			System.out.print("ArithmeticException");
			throw e;
		} 
		catch (Exception e) 
		{
			System.out.print("Exception");
		}
	}
	*/
	
	
	public static void main(String[] args) 
	{
		try 
		{
			Object o = null;
			o.toString();
		} 
		/* un orderd
		catch (RuntimeException e) 
		{
			System.out.print("RuntimeException");
		} 
		catch (NullPointerException e) 
		{
			System.out.print("NullPointerException");
		}
		*/
		catch (NullPointerException e) 
		{
			System.out.print("NullPointerException");
		}
		catch (RuntimeException e) 
		{
			System.out.print("RuntimeException");
		} 
	}

}
