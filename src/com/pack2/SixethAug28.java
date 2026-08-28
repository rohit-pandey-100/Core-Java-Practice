package com.pack2;

public class SixethAug28 
{
	SixethAug28(double d) // Widening conversion double to int this is the first priority over the Boxing conversion
	{
		System.out.println("double");
	}
	SixethAug28(Integer i) // Boxing conversion Integer to int
	{
		System.out.println("int");
	}
	public static void main(String[] args) {
		new SixethAug28(5);
	}

}
