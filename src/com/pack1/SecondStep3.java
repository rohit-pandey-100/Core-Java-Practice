package com.pack1;

public class SecondStep3 extends Thread 
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" Entered in criticalResource()" );
		
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+" ==> i value: "+i);
			}
		}
		System.out.println(name+" completed executed criticalResource()");
	}
	public static void main(String[] args) {
		
		SecondStep3 obj=new SecondStep3();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("Oooo");
		t2.setName("Ffffaaa");
		
		t1.start();
		t2.start();
		
		
	}

}
