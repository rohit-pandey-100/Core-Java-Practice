package com.pack1;

public class Step16 
{
	//This class make for holding the emp data
	private String empName;
	private int empSal;
	private String empDept;
	
	public Step16(String empName, int empSal, String empDept)
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
	public int getEmpSal()
	{
		return empSal;
	}
	public String getEmpName()
	{
		return empName;
	}

}
