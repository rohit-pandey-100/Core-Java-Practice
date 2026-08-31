package com.pack2;

public interface FivethAug31 extends FourthAug31 // for some code replaced the interfaces with the class
{
	/*
	public static void main(String[] args) 
	{
		FourthAug31.show();
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		FourthAug31 a = new FivethAug31();
		a.show();
	}
	*/
	/*
	public static void main(String[] args) 
	{
		FourthAug31.show();
	}
	*/
	
	/*
	public static void main(String[] args) 
	{
		FourthAug31 a = null;
		FourthAug31.show();
	}
	*/
	
	default void show() 
	{
		System.out.print("B");
	}
}
