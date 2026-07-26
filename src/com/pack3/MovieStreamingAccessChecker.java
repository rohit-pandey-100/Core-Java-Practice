package com.pack3;

import java.util.Scanner;

public class MovieStreamingAccessChecker 
{
	public static void StreamingUser(boolean activeSubscription,
            boolean isPremiumMovie,
            boolean hasPremiumSubscription)
	{
		if(activeSubscription)
		{
			if(isPremiumMovie)
			{
				if(hasPremiumSubscription)
					System.out.println("Access granted");
				else
					System.out.println("Access denied");
			}
			else
			{
				System.out.println("Access granted");
			}
		}
		else
		{
			System.out.println("Access denied");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean SubscriptionIsActive = sc.nextBoolean();
		boolean PremiumSubscription = sc.nextBoolean();
		boolean isPremiumMovie = sc.nextBoolean();
		
		StreamingUser(SubscriptionIsActive, PremiumSubscription, isPremiumMovie);
		
		sc.close();
		
	}

}
