package com.pack3;

import java.util.Scanner;

public class SwapWithoutThirdVariable 
{
	public static void  SwappedValues(int num1, int num2)
	{
		/*if(num1!=num2 && num2 != num1)
		{
			System.out.println("Before Swapping: ");
			System.out.println("num1 "+"= "+num1);
			System.out.println("num2 "+"= "+num2);
			
			System.out.println("\nAfter Swapping: ");
			System.out.println("num1 "+"= "+num2);
			System.out.println("num2 "+"= "+num1);
		}*/
		
		System.out.println("Before Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping without third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		SwappedValues(num1, num2);
		
		sc.close();
	}

}
