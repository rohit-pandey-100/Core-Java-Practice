package com.pack3;

import java.util.Scanner;

public class AutoboxingDemo 
{
	    public static void main(String[] args) 
	    {

	        Scanner sc = new Scanner(System.in);

	        // Primitive int variable
	        int num = Integer.parseInt(sc.nextLine());

	        // Integer object using autoboxing
	        Integer nums = num;

	        System.out.println("Integer value: " + nums);

	        sc.close();
	    }
}
