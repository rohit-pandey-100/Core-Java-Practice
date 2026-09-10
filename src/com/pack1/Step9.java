//Char IOStream

package com.pack1;

import java.io.FileReader;
import java.io.FileWriter;

public class Step9 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileReader fr=new FileReader("D:\\Java IOStream\\File1.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\nData reterived");
		fr.close();
	}
	void FileOperation2()throws Exception
	{
		System.out.println("Writing the data into a file");
		FileWriter fw=new FileWriter("D:\\Java IOStream\\File2.txt", true);
		System.out.println("connection created");
		String msg="Today is the Wednesday";
		fw.write(msg);
		System.out.println("Data writed");
		fw.close();
	}
	void FileOperation3()throws Exception
	{
		System.out.println("Copying the data into a file");
		FileReader fr=new FileReader("D:\\Java IOStream\\File2.txt");
		FileWriter fw=new FileWriter("D:\\Java IOStream\\File3.txt");
		System.out.println("connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("Data reterived");
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		Step9 obj=new Step9();
		//obj.FileOperation1();
		//obj.FileOperation2();
		obj.FileOperation3();
	}

}
