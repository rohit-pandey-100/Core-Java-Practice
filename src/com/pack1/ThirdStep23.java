package com.pack1;

import java.util.Comparator;

public class ThirdStep23 implements Comparator<Step23>
{
	@Override
	public int compare(Step23 o1, Step23 o2)
	{
		//return o1.getEmpSal()-o2.getEmpSal(); //Shorting the data basing on empSal
		return o1.getEmpName().compareTo(o2.getEmpName()); //Shorting the data basing on empName
		//return o1.getEmpDept().compareTo(o2.getEmpDept()); //Shorting the data basing on empDept
	}

}
