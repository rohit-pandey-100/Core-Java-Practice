package com.pack1;

public class FivethStep7 implements Cloneable
{
	int x=111;
	int y=222;
	
	public FivethStep7 createClone() throws CloneNotSupportedException
	{
		FivethStep7 aobj=(FivethStep7)super.clone();
		return aobj;
	}
}
