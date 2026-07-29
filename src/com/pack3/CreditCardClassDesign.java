package com.pack3;

import java.util.Scanner;

public class CreditCardClassDesign
{
    private String cardNumber;
    private String expiryDate;

    public String getCardNumber(String CardNum)
    {
        if(CardNum.length() != 16)
        {
            return "Error: Invalid card number";
        }

        for(int i = 0; i < 16; i++)
        {
            char ch = CardNum.charAt(i);

            if(ch < '0' || ch > '9')
            {
                return "Error: Invalid card number";
            }
        }

        cardNumber = CardNum;
        return "Valid";
    }

    public String getExpiryDate(String ExpDate)
    {
        if(ExpDate.length() != 5)
        {
            return "Error: Invalid expiry date";
        }

        if(ExpDate.charAt(2) != '/')
        {
            return "Error: Invalid expiry date";
        }

        expiryDate = ExpDate;
        return "Valid";
    }

    public void displayCardDetails()
    {
        System.out.print("Card Number: ");

        for(int i = 0; i < 12; i++)
        {
            System.out.print("*");
        }

        for(int i = 12; i < 16; i++)
        {
            System.out.print(cardNumber.charAt(i));
        }

        System.out.println();
        System.out.println("Expiry Date: " + expiryDate);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        CreditCardClassDesign obj = new CreditCardClassDesign();

        System.out.print("Enter 16-digit Card Number: ");
        String CardNum = sc.nextLine();

        String result = obj.getCardNumber(CardNum);

        if(result.equals("Valid"))
        {
            System.out.print("Enter Expiry Date (MM/YY): ");
            String ExpDate = sc.nextLine();

            result = obj.getExpiryDate(ExpDate);

            if(result.equals("Valid"))
            {
                obj.displayCardDetails();
            }
            else
            {
                System.out.println(result);
            }
        }
        else
        {
            System.out.println(result);
        }

        sc.close();
    }
}