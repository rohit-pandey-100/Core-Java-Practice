package com.pack1;

import java.util.Scanner;

public class SecondAug17
{
	Scanner sc=new Scanner(System.in);
	Aug17 obj=new Aug17();
	
	void meth1()
	{
		System.out.println("Implementing Encapsulation\n");
		
		System.out.println("Enter the Emp Name: ");
		//String Name=sc.nextLine();
		//obj.empName=Name;
		//obj.empName=sc.nextLine();// C.E because we are accessing the private variable
		obj.setEmpName(sc.nextLine());
		
		System.out.println("Enter the Emp Id: ");
		//int Id=Integer.parseInt(sc.nextLine());
		//obj.empId=Id;
		//obj.empId=Integer.parseInt(sc.nextLine()); // C.E because we are accessing the private variable
		obj.setEmpId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter the Dept Name: ");
		//String Dept=sc.nextLine();
		//obj.DeptName=Dept;
		//obj.DeptName=sc.nextLine(); // C.E because we are accessing the private variable
		obj.setDeptName(sc.nextLine());
		
		//System.out.println("Emp Name: "+obj.empName);
		//System.out.println("Emp Id: "+obj.empId);
		//System.out.println("Emp Dept Name: "+obj.DeptName);
		
		System.out.println("Emp Name: "+obj.getEmpName());
		System.out.println("Emp Id: "+obj.getEmpId());
		System.out.println("Emp Dept Name: "+obj.getDeptName());
	}
	public static void main(String[] args) {
		SecondAug17 obj=new SecondAug17();
		obj.meth1();
	}
}