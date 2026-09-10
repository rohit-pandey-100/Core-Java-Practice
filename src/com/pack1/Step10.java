package com.pack1;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class Step10 
{
	void FileOperation1() throws Exception
	{
		System.out.println("Implementing the data stream");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Java IOStream\\File4.txt"));
		System.out.println("Connection created");
		dos.writeInt(1000);
		dos.writeBoolean(true);
		dos.writeChar('A');
		dos.writeInt(2000);
		System.out.println("Data writed");
		dos.close();
	}
	void FileOperation2() throws Exception
	{
		System.out.println("Implementing the data stream");
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Java IOStream\\File4.txt"));
		System.out.println("Connection Created\n");
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println("\nData reterived");
		dis.close();
	}
	public static void main(String[] args) throws Exception
	{
		Step10 obj=new Step10();
		obj.FileOperation1();
		obj.FileOperation2();
		
	}
}
