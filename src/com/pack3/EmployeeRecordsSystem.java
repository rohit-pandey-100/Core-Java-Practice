package com.pack3;

import java.util.Scanner;

public class EmployeeRecordsSystem 
{
	 // Static variable
    static String companyName = "TechCorp";

    // Non-static variables
    int empId;
    String empName;

    // Method to assign values
    public void setEmployee(int id, String name)
    {
        empId = id;
        empName = name;
    }

    // Method to display details
    public void display()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company Name: " + companyName);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int id = sc.nextInt();
        
        String name = sc.next();
        
        EmployeeRecordsSystem emp = new EmployeeRecordsSystem();
        
        emp.setEmployee(id,name);
        
        sc.close();
    }
}
