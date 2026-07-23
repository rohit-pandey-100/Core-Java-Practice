package com.pack3;

import java.util.Scanner;

public class CalculateSurface
{
	public static double CalcualteArea(int r, int h)
	{
		double pi = 3.14159;
		
		return  2 * pi * r * h + 2 * pi * r * r;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt();
		int h=sc.nextInt();
		
		double result=CalculateSurface.CalcualteArea(r,h);
		
		System.out.printf("Total Surface Area of the cylinder is: %.3f", result);
	}
}