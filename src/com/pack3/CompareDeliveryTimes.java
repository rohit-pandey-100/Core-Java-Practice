package com.pack3;

import java.util.Scanner;

public class CompareDeliveryTimes 
{
	public static void DeliveryTime(int estimateddeliverytime, int actualdeliverytime)
	{
		if(estimateddeliverytime>=actualdeliverytime)
		{
			System.out.println("On Time");
		}
		else
		{
			System.out.println("Delayed");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int estimateddeliverytime=sc.nextInt();
		int actualdeliverytime=sc.nextInt();
		
		DeliveryTime(estimateddeliverytime,actualdeliverytime);
		
		sc.close();
	}

}
