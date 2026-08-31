package com.pack1;

public class ThiredAug29 extends Exception
{
	String message;
	
	public ThiredAug29(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}

}
