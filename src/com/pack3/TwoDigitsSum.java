package com.pack3;

import java.util.Scanner;

//import java.util.*;

public class TwoDigitsSum
{
	// method to return sum of digit
	public static int getSumOfDigits(int num) // As the name of the method as condtion of the task
	{
		// chedk the vlaue roght or wrong 
		if(num<10 || num>99)
		{
			return -1;
		}
		
		int firstDigit=num / 10;
		int secondDigit=num % 10;
		
		return firstDigit + secondDigit;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a two-digit number: ");
		
		int num = sc.nextInt();
		
		int result = TwoDigitsSum.getSumOfDigits(num);
		
		if(result == -1)
        {
            System.out.println("Error: Please enter a valid two-digit number (10–99).");
        }
        else
        {
            System.out.println("Sum of digits: " + result);
        }		
        sc.close();
	}
}