//BufferStream

package com.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class SecondStep9 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Reading the data from a file by using the BufferedInputStream");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Java IOStream\\File3.txt"));
		System.out.println("Connection Created");
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println("Data Reterived");
		bis.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Writing the data into a File by using BufferedOutputStream");
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Java IOStream\\File4.txt"));
		System.out.println("Connection created");
		String msg="Taarak Mehta Ka Ooltah Chashmah";
		byte arr[]= msg.getBytes();
		bos.write(arr);
		System.out.println("Data writed into a file");
		bos.close();
	}
	void FileOperation3() throws Exception
	{
		System.out.println("Copying tha data into a File by using the Bufferead");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Java IOStream\\File4.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Java IOStream\\File5.txt"));
		int i;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		System.out.println("Copying the data suces..");
		bis.close();
		bos.close();
	}
	void FileOperation4() throws Exception 
	{
		System.out.println("Reading the data from a File by using the BufferedReader");
		BufferedReader br=new BufferedReader(new FileReader("D:\\Java IOStream\\File5.txt"));
		System.out.println("Connection Created");
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("Data reterived");
		br.close();
	}
	void FileOperation5() throws Exception 
	{
		System.out.println("Writing the data into a File by using the BufferedWriter");
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Java IOStream\\File6.txt"));
		System.out.println("Connection Created");
		String msg="Hard work is the key fo the Success";
		bw.write(msg);
		System.out.println("Data writed");
		bw.close();
	}
	void FileOperation6() throws Exception
	{
		System.out.println("Copying the data into a File by using the Buffered");
		BufferedReader br=new BufferedReader(new FileReader("D:\\Java IOStream\\File6.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Java IOStream\\File7.txt"));
		System.out.println("Connection Created");
		int i;
		while((i=br.read())!=-1)
		{
			bw.write(i);
		}
		System.out.println("Data Copyed");
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws Exception
	{
		SecondStep9 obj=new SecondStep9();
		obj.FileOperation1();
		obj.FileOperation2();
		obj.FileOperation3();
		obj.FileOperation4();
		obj.FileOperation5();
		obj.FileOperation6();
	}

}
