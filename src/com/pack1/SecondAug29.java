package com.pack1;

import java.io.FileInputStream;

public class SecondAug29
{
	int val_amt=1000;
	
	void with_draw(int wd_amt)
	{
		if(val_amt<wd_amt)
		{
			throw new RuntimeException("Insufficient Balance ");
		}
		else
		{
			System.out.println("Transaction Sucess");
			System.out.println("Take"+wd_amt);
		}
	}
	void fileOperations() throws Exception
	{
		System.out.println("Connecting toa file");
		
		FileInputStream fis=new FileInputStream("D:\\Note's\\When we want to see the all user we.txt");
		System.out.println("Connection Created");
		fis.close();
	}
	public static void main(String[] args) throws Exception 
	{
		SecondAug29 obj=new SecondAug29();
		//obj.with_draw(4000);
		obj.fileOperations();
		
	}
}