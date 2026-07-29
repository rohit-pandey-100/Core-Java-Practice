package com.pack1;

import java.util.Scanner;

public class MenuPriceCalculator
{
    static int totalbill = 0;

    public void Categories()
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++)
        {
            while(true) // While is runing untill the condtion for loop is not satisfied
            {
                System.out.println("Enter Category for Customer " + i + ":");
                System.out.println("1 - Starters");
                System.out.println("2 - Main Course");
                System.out.println("3 - Desserts");

                int categories = Integer.parseInt(sc.nextLine());

                switch(categories)
                {
                    case 1:
                        totalbill = totalbill + 100;
                        break; // out form the switch case

                    case 2:
                        totalbill = totalbill + 200;
                        break; // out form the switch case

                    case 3:
                        totalbill = totalbill + 150;
                        break; // out form the switch case

                    default:
                        System.out.println("Wrong Category! Please re-enter the category.\n");
                        continue; // out form the switch case and again go to the while loop
                }

                break; // it used for come out from the while loop
            }
        }

        System.out.println("Total Bill : " + totalbill);

        if(totalbill > 500)
        {
        	int actualBill = totalbill;
        	int discount = (actualBill * 10) / 100;
        	int finalBill = actualBill - discount;

        	System.out.println();
        	System.out.println("╔════════════════════════════════════════════════════════════╗");
        	System.out.println("║              🍴 ROYAL FOOD RESTAURANT 🍴                 ║");
        	System.out.println("╠════════════════════════════════════════════════════════════╣");
        	System.out.println("║                                                          ║");
        	System.out.println("║              🎊 CONGRATULATIONS! 🎊                      ║");
        	System.out.println("║                                                          ║");
        	System.out.println("║       🌟 You Unlocked Today's Special Offer! 🌟         ║");
        	System.out.println("║                                                          ║");
        	System.out.println("║  💰 Original Bill        : ₹" + actualBill);
        	System.out.println("║  🎁 Discount (10%)       : ₹" + discount);
        	System.out.println("║  💳 Final Payable Amount : ₹" + finalBill);
        	System.out.println("║                                                          ║");
        	System.out.println("║      ❤️ Thank You For Visiting Us ❤️                    ║");
        	System.out.println("║      🌹 We Look Forward To Serving You Again 🌹          ║");
        	System.out.println("║                                                          ║");
        	System.out.println("╚════════════════════════════════════════════════════════════╝");
        }
        else
        {
        	int remainingAmount = 501 - totalbill;

        	System.out.println("\n╔════════════════════════════════════════════════════╗");
        	System.out.println("║            🍽️ THANK YOU FOR VISITING 🍽️          ║");
        	System.out.println("╠════════════════════════════════════════════════════╣");
        	System.out.println("║ 💰 Total Bill : ₹" + totalbill);
        	System.out.println("║ 🔥 You're only ₹" + remainingAmount + " away from");
        	System.out.println("║ 🎉 claiming your 10% Special Day Discount!");
        	System.out.println("║ 🍕 Add more delicious dishes & save!");
        	System.out.println("║ 🌟 We look forward to serving you again!1");
        	System.out.println("╚════════════════════════════════════════════════════╝");
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        MenuPriceCalculator obj = new MenuPriceCalculator();
        obj.Categories();
    }
}