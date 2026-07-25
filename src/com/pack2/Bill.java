package com.pack2;

import java.util.Scanner;

public class Bill
{
    public static void BillPrice(int quantity)
    {
        int Totalprice = quantity * 60;

        if(Totalprice >= 120)
        {
            if(Totalprice > 120)
            {
                System.out.println("Congratulations!");
                System.out.println("You got a flat Rs.50 discount on your total bill.");
                System.out.println("Final Bill : Rs." + (Totalprice - 50));
            }
            else
            {
                switch(quantity)
                {
                    case 2:

                        int noteligible = 1;

                        do
                        {
                            System.out.println("Burger Price : Rs.60");

                            for(int j = 1; j <= quantity; j++)
                            {
                                System.out.println("Burger " + j + " Prepared");
                            }

                            System.out.println("Total Bill : Rs." + Totalprice);
                            System.out.println("No Discount");
                            System.out.println("Final Bill : Rs." + Totalprice);

                            noteligible++;

                        }
                        while(noteligible <= 0);

                        break;

                    default:

                        System.out.println("Burger Price : Rs.60");
                        System.out.println("Quantity : " + quantity);
                        System.out.println("Total Bill : Rs." + Totalprice);
                        System.out.println("Discount : Rs.50");
                        System.out.println("Final Bill : Rs." + (Totalprice - 50));

                        break;
                }
            }
        }
        else
        {
            System.out.println("Burger Price : Rs.60");
            System.out.println("Quantity : " + quantity);
            System.out.println("Total Bill : Rs." + Totalprice);
            System.out.println("You are not eligible for discount.");
            System.out.println("Final Bill : Rs." + Totalprice);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity of Burger: ");
        int quantity = sc.nextInt();

        BillPrice(quantity);

        sc.close();
    }
}