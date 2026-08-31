package com.pack1;

public class Aug31 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thred Started executing run()");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value: "+i);
		}
		System.out.println("run() execution completed");
	}
	public static void main(String[] args) {
		Aug31 obj=new Aug31();
		Thread t=new Thread(obj);
		t.start();
	}
}