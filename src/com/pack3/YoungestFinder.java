package com.pack3;

import java.util.Scanner;

public class YoungestFinder
{
    public static String findYoungest(int age1, int age2, int age3)
    {
        // All three are the same age
        if(age1 == age2 && age2 == age3)
        {
            return "All are of the same age";
        }

        // Tie for the youngest
        if((age1 == age2 && age1 < age3) ||
           (age1 == age3 && age1 < age2) ||
           (age2 == age3 && age2 < age1))
        {
            return "There is a tie for the youngest age";
        }

        // Person 1 is youngest
        if(age1 < age2 && age1 < age3)
        {
            return "Person 1 is the youngest";
        }

        // Person 2 is youngest
        if(age2 < age1 && age2 < age3)
        {
            return "Person 2 is the youngest";
        }

        // Person 3 is youngest
        return "Person 3 is the youngest";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();

        System.out.println(findYoungest(age1, age2, age3));

        sc.close();
    }
}