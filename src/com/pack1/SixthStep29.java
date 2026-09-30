package com.pack1;

public class SixthStep29 
{
	void meth1()
	{
		System.out.println("Implementing Enum\n");
		
		Days d=Days.wednesday;
		System.out.println("Today is "+d);
		
		switch(d)
		{
			case tuesday: 
				System.out.println("Today is the last class for core java");
			case wednesday:
				System.out.println("There is NO Class TODAY!!!");
				break;
			default:
				System.out.println("System out");
				break;
		}
	}
	public static void main(String[] args) {
		new SixthStep29().meth1();
	}
}
