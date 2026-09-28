package com.pack1;

import java.util.Optional;

public class SecondStep28 
{
	void meth1()
	{
		String arr[]=new String[5];
		arr[1]="Java";
		arr[2]="Rohit";
		
		//System.out.println(arr[1].toUpperCase());
		Optional<String> o=Optional.ofNullable(arr[2]);
		//System.out.println(o);
		if(o.isPresent())
		{
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else
		{
			System.out.println("It is empty");
		}
	}
	public static void main(String[] args) {
		SecondStep28 obj=new SecondStep28();
		obj.meth1();
	}
}
