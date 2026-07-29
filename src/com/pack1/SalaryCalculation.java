package com.pack1;

import java.util.Scanner;

public class SalaryCalculation 
{
	Scanner sc=new Scanner(System.in);
	
	public void EmployeeSalary()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter hours worked for Employee "+i+":");
			int hours=Integer.parseInt(sc.nextLine());
			System.out.println("Enter job type "+"\n1-Manager"+"\n2-Developer"+"\n3-Intern");
			int JobType=Integer.parseInt(sc.nextLine());
			int salary=0;
			
			switch(JobType)
			{
			case 1:
				salary=hours*500;
				break;
				
			case 2:
				salary=hours*300;
				break;
				
			case 3:
				salary=hours*100;
				break;
			}
			System.out.println("Salary of Employee "+i+" ₹"+salary);
			
			if(salary>10000)
			{
				System.out.println("Eligible for Bonus");
			}
			else
			{
				System.out.println("NO Bonus");
			}
		}
	}
	public static void main(String[] args) {
		SalaryCalculation obj=new SalaryCalculation();
				obj.EmployeeSalary();
	}

}
