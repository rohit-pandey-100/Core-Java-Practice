package com.pack1;

import java.util.Scanner;

public class EmployeeTracker 
{
	String employeeName =null;
	static int employeeCount=0;
	
	public static void registerEmployee()
	{
		employeeCount++;
	}
	public static void displayCount()
	{
		System.out.println("Total Employees Registered: "+employeeCount);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int num=Integer.parseInt(sc.nextLine().trim());
		
		for(int i=1;i<=num;i++)
		{
			EmployeeTracker emp=new EmployeeTracker();
			
			System.out.println("Enter employee names: ");
			emp.employeeName=sc.nextLine();
			registerEmployee();
		}
		displayCount();
		sc.close();
	}

}
