package com.pack1;

public class Step23 implements Comparable<Step23>
{
	private String empName;
	private int empSal;
	private String empDept;
	
	public Step23(String empName, int empSal, String empDept)
	{
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empName+" "+empSal+" "+empDept;
	}
	
	
}