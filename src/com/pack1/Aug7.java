package com.pack1;

import java.util.Arrays;
//import java.util.Scanner;

public class Aug7
{
	void meth1()
	{
		System.out.println("Methed1() Called");
		
		String s1="Possible";
		String s2 = new String("Possible");
		String s3="Yes Possible";
		String s4=new String("Yes Possible");
		
		System.out.println("-------------equal()--------------");
		System.out.println(s1.equals(s2));
		System.out.println("Possible".equals(s1));
		System.out.println("possible".equals("Possible"));
		System.out.println("Possible".equalsIgnoreCase("possible"));
		System.out.println(s3.equals("possible"));
		System.out.println(s4.equals("Possible"));
		System.out.println(new String("Java").equals(new String("Java")));
		
		System.out.println("---------------==------------------");
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s2==s4);
		System.out.println(s3==s1);
		System.out.println(s1=="Possible");
		System.out.println("Possible"==new String("Possible"));
		System.out.println("Possible"=="Possible");
		System.out.println(new String("Possible")==new String("Possible"));
		System.out.println(s4==new String("Possible"));
		System.out.println("Possible"=="Po"+"ss"+"ib"+"le");
	}
	void meth2()
	{
		System.out.println("Implementing String Class Methods");
		String s1="Naruto";
		System.out.println("s1: "+s1);
		System.out.println("length: "+s1.length());
		System.out.println("Concat: "+s1.concat(" is a Nine tailed Ginechurikey"));
		System.out.println("S1: "+s1);
		System.out.println(s1.concat(" is a Nine tailed Ginechurikey").length());
		System.out.println("CharAt: "+s1.charAt(0));
		System.out.println("charAt: "+s1.charAt(s1.length()-2));
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Gender(M/F): ");
		char gender=sc.nextLine().charAt(0);
		
		switch(gender)
		{
		case 'M','m'-> System.out.println("User is Male");
		case 'F','f'-> System.out.println("User is Female");
		default-> System.out.println("Invalid Data");
		}
		sc.close();*/
		
		System.out.println("StartsWith: "+s1.startsWith("Na"));
		System.out.println("toUpperCase(): "+s1.toUpperCase());
		System.out.println("toLowerCase(): "+s1.toLowerCase());
		System.out.println("s1: "+s1);
		
		String s2="Naruto is a Nine tailed Ginechurikey";
		System.out.println("substring(): "+s2.substring(12));
		System.out.println("substring(): "+s2.substring(24,28));
		System.out.println("substring(): "+s2.substring(3,9));
		
		System.out.println("replace(): "+s2.replace("G", "g"));
		System.out.println("replace(): "+s2.replace("i", "I"));
		System.out.println("s2: "+s2);
		
		String s3="  Madara Uchia The ghost of the Uchia  ";
		System.out.println(s3.length());
		System.out.println(s3.trim());
		System.out.println(s3.trim().length());
		
		
		System.out.println("IndexOf(): "+s3.indexOf(1));
		System.out.println("indexOf(): "+s3.lastIndexOf(0));
		
		System.out.println("A".compareTo("D"));
		System.out.println("D".compareTo("A"));
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo("a"));
		System.out.println("a".compareTo("A"));
		
		String date="7-Aug-2026";
		String arr1[]=date.split("-");
		String arr2[]=date.split(" ");
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr2: "+Arrays.toString(arr2));
		
	
		String data="ABCDEF";
		byte arr3[]=data.getBytes();
		System.out.println("arr3: "+Arrays.toString(arr3));
		for(byte b:arr3)
		{
			System.out.println((char)b);
		}
	}
	public static void main(String[] args) {
		Aug7 obj=new Aug7();
		//obj.meth1();
		obj.meth2();
	}
}

/* 
equals():

1). equals in String class its implentation has changed.
2). Insted of compaaring the address locations, it is goi9ng to comapre the CONTENTS of the String
3). If BOTH the STRING are having same CONTENT then equals() is going to return true otherwise false

==;

1). == operator when used with string clas objects ut is going to compare the address locations of the String.
2). If BOTH the string are having same address locations it is going to return true otherwise fasle.
*/