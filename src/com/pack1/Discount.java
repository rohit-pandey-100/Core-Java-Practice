package com.pack1;

import java.util.Scanner;

public class Discount 
{
	Scanner sc=new Scanner(System.in);
	
	public void Price()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter product type for product "+i+":"+"\n1-Electronics"+"\n2-Clothing"+"\n3-Groceries");
			int Product=Integer.parseInt(sc.nextLine());
			System.out.println("Enter price for product "+i+":"+" ₹");
			double Price=Double.parseDouble(sc.nextLine());
			
			switch(Product)
			{
			case 1:
				Price=Price-(Price*15)/100;
				break;
				
			case 2:
				Price=Price-(Price*15)/100;
				break;
				
			case 3:
				Price=Price-(Price*15)/100;
				break;
			}
			System.out.println("===>"+" ₹"+Price);
			
			if(Price>2000)
			{
				double discount=Price-(Price*5)/100;
				System.out.println("Congratulation you got additionaln 5% Discount");
				System.out.println("Final price for product "+i+":"+" ₹"+discount);
			}
			else
			{
				System.out.println("Final price for product "+i+":"+" ₹"+Price);
			}
		}
	}
	public static void main(String[] args) {
		Discount obj=new Discount();
		obj.Price();
	}
}
