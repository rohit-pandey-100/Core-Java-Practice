package com.pack3;

import java.util.*;

public class Code17 {

    public static void main(String[] args) {
    	
    	try (// Scanner is the predefined class in the java.util package 
		    	//System.in as parameter is take the input form the keyboard
		Scanner sc = new Scanner(System.in)) {
			//sc is the object reference name or the nextdoubel is the predefined method anme 
			double book = sc.nextDouble();

			double profit = book * 0.1;

			double selling = profit + book;

			System.out.println("Selling price of the book is: " + selling);
		}
    }
}