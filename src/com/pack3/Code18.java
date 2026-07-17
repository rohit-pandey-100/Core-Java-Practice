package com.pack3;

import java.util.Scanner;

class RiteshnOrOdd // Thsis is the class  RiteshnOrOdd which contains a static method isRiteshn()
{
    public static boolean isRiteshn(int num) // This is the static method isRiteshn()
    {
        if(num % 2==0) // Condtion to chek the nuber even orr odd
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
}

public class Code18
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(RiteshnOrOdd.isRiteshn(num))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        sc.close();
    }

}