package com.pack1;

public class SixthStep7 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Implementing clone() present in object");
		
		FourthStep7 aobj1=new FourthStep7();
		System.out.println(aobj1.a+" "+aobj1.b);
		
		FourthStep7 aobj2=new FourthStep7();
		aobj2.b=1000;
		
		System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);
		
		FivethStep7 bobj1=new FivethStep7();
		System.out.println(bobj1.x+" "+bobj1.y);
		
		FivethStep7 bobj2=new FivethStep7();
		bobj2.y=1000;
		
		System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.x+" "+bobj2.y);
	}

}
