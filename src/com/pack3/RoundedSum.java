package com.pack3;

import java.util.Scanner;

public class RoundedSum 
{
	public static int sumOfRoundedValues(int a, int b, int c)
    {
        // Check for invalid input
        if(a <= 0 || b <= 0 || c <= 0)
        {
            return -1;
        }

        // Round first number
        if(a % 10 < 5)
            a = a - (a % 10);
        else
            a = a + (10 - (a % 10));

        // Round second number
        if(b % 10 < 5)
            b = b - (b % 10);
        else
            b = b + (10 - (b % 10));

        // Round third number
        if(c % 10 < 5)
            c = c - (c % 10);
        else
            c = c + (10 - (c % 10));

        return a + b + c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = sumOfRoundedValues(a, b, c);

        if(result == -1)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println("Sum of rounded values: " + result);
        }
        
        sc.close();
    }
}