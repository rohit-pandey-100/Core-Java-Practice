package com.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Step8
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileInputStream fis=new FileInputStream("D:\\File.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fis.read())!=-1)
		{
			//System.out.print(i);
			System.out.print((char)i);
		}
		System.out.println("\nReading Completed");
		fis.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Write the data into a file");
		FileOutputStream fos=new FileOutputStream("D:\\File1.txt", true);
		System.out.println("Connection Created");
		String msg=", and it is used web tech or Aptech etc.";
		byte arr[]=msg.getBytes();
		fos.write(arr);
		System.out.println("Data Entered ");
		fos.close();
	}
	void FileOperation3() throws Exception
	{
		System.out.println("Copying the data into a file");
		FileInputStream fis=new FileInputStream("D:\\File1.txt");
		FileOutputStream fos=new FileOutputStream("D:\\File2.txt");
		System.out.println("Connection created");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Copying sucessfully ");
		fis.close();
		fos.close();
		
	}
	public static void main(String[] args) throws Exception
	{
		Step8 obj=new Step8();
		//obj.FileOperation1();
		//obj.FileOperation2();
		obj.FileOperation3();
	}
}