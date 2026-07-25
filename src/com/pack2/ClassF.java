package com.pack2;

import java.util.Scanner;

public class ClassF
{
    public static void meth1(int quantity)
    {
        int price = quantity * 60;

        if(price >= 120)
        {
            if(price > 300)
            {
                System.out.println("Congratulations!");
                System.out.println("You got a discount of Rs.50");
                System.out.println("Final Bill : Rs." + (price - 50));
            }
            else
            {
                switch(quantity)
                {
                    case 2:

                        int i = 1;

                        while(i <= 1)
                        {
                            do
                            {
                                System.out.println("Burger Price : Rs.60");
                                System.out.println("Quantity : " + quantity);

                                for(int j = 1; j <= quantity; j++)
                                {
                                    System.out.println("Burger " + j + " Prepared");
                                }

                                System.out.println("Total Bill : Rs." + price);
                                System.out.println("No Discount");
                                System.out.println("Final Bill : Rs." + price);

                                i++;

                            }
                            while(i <= 0);
                        }

                        break;

                    default:

                        System.out.println("Burger Price : Rs.60");
                        System.out.println("Quantity : " + quantity);
                        System.out.println("Total Bill : Rs." + price);
                        System.out.println("Discount : Rs.50");
                        System.out.println("Final Bill : Rs." + (price - 50));
                }
            }
        }
        else
        {
            System.out.println("Burger Price : Rs.60");
            System.out.println("Quantity : " + quantity);
            System.out.println("Total Bill : Rs." + price);
            System.out.println("You are not eligible for discount.");
            System.out.println("Final Bill : Rs." + price);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Burger Quantity : ");
        int quantity = sc.nextInt();

        meth1(quantity);

        sc.close();
    }
}