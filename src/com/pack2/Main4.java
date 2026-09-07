package com.pack2;

public class Main4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Test2 t = new Test2();
		Thread th = new Thread(() -> 
		{
		try 
		{
		t.display();
		} 
		catch (InterruptedException e) 
		{
			
		}
		}, "Thread-1");
		th.start();
		Thread.sleep(1000);
		System.out.println("Main thread ends");
		}

}
