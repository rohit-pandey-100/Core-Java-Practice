package com.pack3;

/*import java.util.Scanner;

public class CreditCard
{
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String Number, String Date)
    {
        cardNumber = Number;
        expiryDate = Date;

        // Validate and mask card number
        if(Number.matches("\\d{16}"))
        {
            cardNumber = "************" + cardNumber.substring(12);
        }
        else
        {
            cardNumber = "Card Number: Is not valid";
        }

        // Validate expiry date
        if(Date.matches("(0[1-9]|1[0-2])/\\d{2}"))
        {
            expiryDate = Date;
        }
        else
        {
            expiryDate = "Invalid Expiry Date";
        }
    }

    public void displayCardDetails()
    {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getExpiryDate()
    {
        return expiryDate;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 16-digit Card Number: ");
        String Number = sc.nextLine();

        System.out.print("Enter Expiry Date (MM/YY): ");
        String Date = sc.nextLine();

        CreditCard creditCard = new CreditCard(Number, Date);

        creditCard.displayCardDetails();

        sc.close();
    }
}*/


// Second code similar

//import java.util.Scanner;

public class CreditCard
{
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String Number, String Date)
    {
        cardNumber = Number;
        expiryDate = Date;

        // Validate and mask card number
        if(Number.matches("\\d{16}"))
        {
            cardNumber = "************" + cardNumber.substring(12);
        }
        else
        {
            cardNumber = "Card Number: Is not valid";
        }

        // Validate expiry date
        if(Date.matches("(0[1-9]|1[0-2])/\\d{2}"))
        {
            expiryDate = Date;
        }
        else
        {
            expiryDate = "Invalid Expiry Date";
        }
    }

    public void displayCardDetails()
    {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public String getExpiryDate()
    {
        return expiryDate;
    }

    public static void main(String[] args)
    {
        //Scanner sc = new Scanner(System.in);

        //System.out.print("Enter 16-digit Card Number: ");
        //String Number = sc.nextLine();

        //System.out.print("Enter Expiry Date (MM/YY): ");
        //String Date = sc.nextLine();

        CreditCard creditCard = new CreditCard("1234567890123456", "01/12");

        creditCard.displayCardDetails();

        //sc.close();
    }
}