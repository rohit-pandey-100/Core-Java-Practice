package com.pack2;

public class ExceptionHandling 
{
	static void nit(String password) throws InvalidPassword 
	{ 
		if(password.length() < 5) 
			throw new InvalidPassword("Invalid Password"); 
		else 
			System.out.println("Valid Password"); 
	} 

	public static void main(String[] args) 
	{ 
		try 
		{ 
			nit("Dead"); 
		} 
		catch (InvalidPassword e) { 
			System.out.println("Exception "+e); 
		} 
	} 

}
