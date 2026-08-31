package com.pack1;

import java.util.Scanner;

public class FourthAug29 
{
	static double current_balance =1000;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ammount to withdrawal");
		int n=Integer.parseInt(sc.nextLine());
		try
		{
			if(current_balance<n)
			{
				throw new ThiredAug29("Have Sufficient balance first!!!");
			}
			else
			{
				System.out.println("Please take the money: "+n);
			}
		}
		catch(ThiredAug29 e)
		{
			System.out.println("hi");
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
