package com.pack1;

import java.util.Scanner;


public class Employee 
{
	// Static varibale
	static String companyName="TechCorp";
	
	//Non-Static Variable
	int empId;
	String empName;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Creating two Employee objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // Employee 1 details
        System.out.print("Enter Employee 1 ID: ");
        emp1.empId = Integer.parseInt(sc.nextLine());
        //sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee 1 Name: ");
        emp1.empName = sc.nextLine();

        // Employee 2 details
        System.out.print("Enter Employee 2 ID: ");
        emp2.empId = Integer.parseInt(sc.nextLine());
        //sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee 2 Name: ");
        emp2.empName = sc.nextLine();

        // Display employee details before changing company name
        System.out.println("\n--- Employee Details ---");

        System.out.println("Employee ID: " + emp1.empId);
        System.out.println("Employee Name: " + emp1.empName);
        System.out.println("Company Name: " + Employee.companyName);

        System.out.println();

        System.out.println("Employee ID: " + emp2.empId);
        System.out.println("Employee Name: " + emp2.empName);
        System.out.println("Company Name: " + Employee.companyName);

        // Change static variable
        System.out.print("\nEnter new company name to update for all employees: ");
        Employee.companyName = sc.nextLine();

        // Display updated details
        System.out.println("\n--- Updated Employee Details ---");

        System.out.println("Employee ID: " + emp1.empId);
        System.out.println("Employee Name: " + emp1.empName);
        System.out.println("Company Name: " + Employee.companyName);

        System.out.println();

        System.out.println("Employee ID: " + emp2.empId);
        System.out.println("Employee Name: " + emp2.empName);
        System.out.println("Company Name: " + Employee.companyName);

        sc.close();
	}
}
