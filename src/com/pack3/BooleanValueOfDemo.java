package com.pack3;

import java.util.Scanner;

public class BooleanValueOfDemo 
{
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();

	        Boolean value = Boolean.valueOf(input);

	        System.out.println("Boolean value: " + value);
	        
	        sc.close();
	    }
}
