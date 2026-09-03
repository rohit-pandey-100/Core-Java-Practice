package com.pack1;

public class Step3 extends Thread 
{
	@Override
	public void run()
	{
		criticalResource();
	}
	synchronized void criticalResource() //Synchronized method
	{
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" Entered in criticalResource()" );
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" ==> i value: "+i);
		}
		System.out.println(name+" completed executed criticalResource()");
	}
	public static void main(String[] args) {
		Step3 obj=new Step3();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("TOM-Thread");
		t2.setName("JERRY-Thread");
		
		t1.start();
		t2.start();
	}

}
