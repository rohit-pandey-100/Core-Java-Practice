package com.pack3;

import java.util.Scanner;

public class ASCIIValueFinder 
{
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Character ch = sc.next().charAt(0);

	        int ascii = ch.compareTo('\u0000');

	        System.out.println("ASCII value of " + ch + ": " + ascii);
	        
	        sc.close();
	    }
}
