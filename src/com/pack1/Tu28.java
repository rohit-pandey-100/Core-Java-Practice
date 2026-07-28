package com.pack1;

import java.util.Scanner;

public class Tu28
{
	static Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		System.out.println("Meth1() called");
		System.out.println("Enter 1st number");
		int x= Integer.parseInt(sc.nextLine());
		
		System.out.println("x value: "+x);
		
		System.out.println("Enter 2nd Number");
		
		int y=Integer.parseInt(sc.nextLine());
		System.out.println("y value: "+y);
		
		int z=x+y;
		System.out.println("Addition: "+z);
	}
	String checkVoteEligiblity()
	{
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("What is you age "+name+"?");
		int age=Integer.parseInt(sc.nextLine());
		
		if(age>=18)
		{
			System.out.println(name+" has passed the test");
			System.out.println("Enter your opinion");
			return sc.nextLine();
		}
		else
		{
			System.out.println(name);
			System.out.println("Enter your opinion");
			return sc.nextLine();
		}
	}
	void checkVechicle(int tyers, String name)
	{
		if(tyers==2)
		{
			System.out.println(name+"you are having two wheeler");
		}
		else if(tyers>=2)
		{
			System.out.println(name+"you having auto/car");
		}
		else
		{
			System.out.println(name+"you are having havey vehicle");
		}
	}
	public static void main(String[] args) {
		Tu28 obj=new Tu28();
		obj.meth1();
		
		String result =obj.checkVoteEligiblity();
		System.out.println("==>"+result);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("How many tyers your vehicle is having");
		int tyers=Integer.parseInt(sc.nextLine());
		
		obj.checkVechicle(tyers, name);
	}
}