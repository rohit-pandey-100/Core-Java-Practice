package com.pack1;

public class Thr9
{
	private int customerID;
	private String customerName; // they all three are the instance variable
	private int customerAge;
	
	private static String customerCity="Hyd"; 
	// This is a static variable and also this is a common property of this program.
	// mean this variable value are common for the all customer.
	// in the java we don't need to a create a same passed value in inter Class a instance variable we can create the static variable for this value.
	
	Thr9(int ID, String Name, int Age)// this is the local variable parameter constructor 
	{
		customerID=ID;
		customerName=Name;
		customerAge=Age;
		//on this line we are assign the value to the instance by helping with the local variable
		
	}
	public static void main(String[] args) {
		Thr9 customer1=new Thr9(123,"Rohit",21);
		Thr9 customer2=new Thr9(124,"Mohit",29);
		Thr9 customer3=new Thr9(125,"Shiva",25);
		
		System.out.println("Customer Detailed: "+customer1.customerID+" "+customer1.customerName+" "+customer1.customerAge+" "+Thr9.customerCity);
		System.out.println("Customer Detailed: "+customer2.customerID+" "+customer2.customerName+" "+customer2.customerAge+" "+Thr9.customerCity);
		System.out.println("Customer Detailed: "+customer3.customerID+" "+customer3.customerName+" "+customer3.customerAge+" "+Thr9.customerCity);
		
		
		customer1.customerID=126;
		customer1.customerAge=22;
		customer1.customerName="Kartik";
		customerCity="Delhi";
		
		
		
		System.out.println("\nCustomer Detailed: "+customer1.customerID+" "+customer1.customerName+" "+customer1.customerAge+" "+Thr9.customerCity);
		System.out.println("Customer Detailed: "+customer2.customerID+" "+customer2.customerName+" "+customer2.customerAge+" "+Thr9.customerCity);
		System.out.println("Customer Detailed: "+customer3.customerID+" "+customer3.customerName+" "+customer3.customerAge+" "+Thr9.customerCity);
		
		
	}
	
	
	
}
