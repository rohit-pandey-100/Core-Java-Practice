package com.pack2;

public class Test2 //Main4
{
	synchronized void display() throws InterruptedException 
	{
		System.out.println(Thread.currentThread().getName() + " starts");
		wait();
		System.out.println(Thread.currentThread().getName() + " resumes");
	}

}
