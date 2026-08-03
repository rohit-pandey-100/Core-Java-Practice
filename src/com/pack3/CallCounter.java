package com.pack3;

import java.util.Scanner;

public class CallCounter
{
    static int count = 0;

    public static void trackCall()
    {
        int localCount = 0;
        localCount++;

        count++;

        System.out.print(localCount + " ");
        System.out.print(count + " ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of times to call the function:");
        int n = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Local Counter Output:");
        for (int i = 1; i <= n; i++)
        {
            int localCount = 0;
            localCount++;
            System.out.print(localCount + " ");
        }

        System.out.println();

        System.out.println("Static Counter Output:");
        for (int i = 1; i <= n; i++)
        {
            trackCall();
        }

        sc.close();
    }
}