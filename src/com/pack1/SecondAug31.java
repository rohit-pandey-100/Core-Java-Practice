package com.pack1;

public class SecondAug31 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread Started executing run()");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value: "+i);
		}
		System.out.println("run() execution completed");
	}
	public static void main(String[] args) {
		SecondAug31 obj=new SecondAug31();
		Thread t=new Thread(obj);
		t.start();
	}
}
