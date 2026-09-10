package com.pack1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FourthStep10 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Implementing the ObjectStream");
		
		SecondStep10 obj1=new SecondStep10();
		ThirdStep10 obj2=new ThirdStep10();
		
		System.out.println(obj1.a+" "+obj1.b);
		System.out.println(obj2.x+" "+obj2.y);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Java IOStream\\File5.ser"));
		System.out.println("Connection created");
		
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		
		System.out.println("Serilaization Completed");
		
		oos.close();
		
		System.out.println("Reading the data from a file by implementing the ObjectStream");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Java IOStream\\File5.ser"));
		SecondStep10 obj3=new SecondStep10();
		ThirdStep10 obj4=new ThirdStep10();
		
		System.out.println(obj3.a+" "+obj3.b);
		System.out.println(obj4.x+" "+obj4.y);
		
		ois.close();
	}
}
