package com.pack1;

public class FourthStep28 
{
	void meth1()
	{
		System.out.println("Meth1() called");
	}
	FourthStep28()
	{
		System.out.println("Constructor called");
	}
	{
		System.out.println("Instance block called");
	}
	static
	{
		System.out.println("Satic block called");
	}
	public static void main(String[] args) {
		
	}
}
/*
 	Every java program are start by main method
 	and static block are executed onlhy one tijme in our intire program
 	if in the program have cons,main(),static block so first is going to execute static bloc then main() then constructor
 	or the importent the instance block will be extucet hoe many objects are created in our intire programm 
*/