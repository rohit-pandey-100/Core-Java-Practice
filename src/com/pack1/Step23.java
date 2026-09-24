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
	@Override
	public int compareTo(Step23 o)
	{
		//return empSal-o.empSal; //Shorting basing on empSal
		return empName.compareTo(o.empName); //Shorting basing on empName
		//return empDept.compareTo(o.empDept); //Shorting basing on empDept
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpSal()
	{
		return empSal;
	}
	public String getEmpDept()
	{
		return empDept;
	}
}

/*
 	Positive Number : greater then the specified object
 	
 	Negative Number : Less then the specified object
 	
 	Equal to '0' : If both are equal
*/