package com.pack2;

public class Step16 
{
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
