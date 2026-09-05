package com.pack1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Step5 extends Thread
{
	private String msg;
	
	public Step5(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" (Bigining) message==> "+msg);
		processMessage();
		System.out.println(Thread.currentThread().getName()+" (Ending)");
		processMessage();
	}
	private void processMessage()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=5;i++) // 5 Iterations===> 5 task
		{
			Step5 tpdobj=new Step5(" "+i);
			
			Thread t=new Thread(tpdobj);
			executor.execute(t);
		}
		executor.shutdown();
		while(!executor.isTerminated()) //!(True) => False
		{
			
		}
		System.out.println("Finsihed all thread");
	}
}
