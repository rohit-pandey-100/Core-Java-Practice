package com.pack3;

import java.util.*;

public class DominosBillingProgram
{
	public static void meth1(double ChickenRolls, double VegetablePuffs)
	{
		double Cost_of_Chicken_Rolls = ChickenRolls*60;
		double Cost_of_Vegetable_Puffs = VegetablePuffs*25;
		
		double Total_Bill_Before_Discount = (Cost_of_Chicken_Rolls + Cost_of_Vegetable_Puffs);
		
		//There is a special Yoga Day discount of Rs 50 on the final bill amount. 
		
		double Yoga_Day_Discount = 50;
		double Final_Bill_after_discount = (Total_Bill_Before_Discount - Yoga_Day_Discount);
		
		// Calculate and print final bill as well as all item bill. 
		
		System.out.println("Itemized Bill:");
		System.out.println("Cost of Chicken Rolls: "+"Rs "+Cost_of_Chicken_Rolls);
		System.out.println("Cost of Vegetable Puffs: "+"Rs "+Cost_of_Vegetable_Puffs);
		System.out.println("Total Bill Before Discount: "+"Rs "+Total_Bill_Before_Discount);
		System.out.println("Yoga Day Discount: "+"Rs "+Yoga_Day_Discount);
		System.out.println("Final Bill after discount: "+"Rs "+Final_Bill_after_discount);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double ChickenRolls=sc.nextDouble();
		double VegetablePuffs=sc.nextDouble();
		
		meth1(ChickenRolls,VegetablePuffs);
		
		sc.close();
		
	}
}