package com.pack3;

import java.util.*;

public class BookMyShowRefundCheck
{
    public static void checkRefundEligibility(boolean isCancelled,
                                              boolean paymentSuccess,
                                              boolean isShowStarted)
    {
        if(isCancelled && paymentSuccess && !isShowStarted)
        {
            System.out.println("Refund processed successfully");
        }
        else
        {
            System.out.println("Refund cannot be processed");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean isCancelled = sc.nextBoolean();
        boolean paymentSuccess = sc.nextBoolean();
        boolean isShowStarted = sc.nextBoolean();

        checkRefundEligibility(isCancelled, paymentSuccess, isShowStarted);

        sc.close();
    }
}