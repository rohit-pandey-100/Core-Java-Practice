package com.pack1;

public class FivethStep29 
{
	InterfaceA meth1()
	{
		System.out.println("HI from meth1");
		return new InterfaceA()
		{
			public void msg1()
			{
				System.out.println("Java is awesome");
			}
			public void msg2()
			{
				System.out.println("Java is amazing!!!");
			}
		}
		;
	}
	public static void main(String[] args) {
		FivethStep29 obj=new FivethStep29();
		InterfaceA iaboj=obj.meth1();
		iaboj.msg1();
		iaboj.msg2();
	}

}
