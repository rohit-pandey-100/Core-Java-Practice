package com.pack1;

public class SecondStep1 extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		
		System.out.println(name+" entered run()");
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+"("+priority+")"+"==>"+i);
		}
		System.out.println(name+" Completed executing ren()");
	}
	public static void main(String[] args) {
		SecondStep1 sobj=new SecondStep1();
		Thread t1=new Thread(sobj);
		t1.setName("First-Thread");
		t1.setPriority(1);
		//t1.setPriority(MIN_PRIORITY); //we can write like this also
		//t1.setPriority(100);// t genrates IllegalArgumentException
		t1.start();
		//t1.start();// It generates IllgealThreadStatementExecption
		
		Thread t2=new Thread(sobj,"Second-Thread");
		//t2.setName("Second-Thread");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		
	}

}

/*
 Thread Schedular:
 --------------------
 
 1). Thread Schedular will decide which Thread must start its execution FIRST, depending upon'2' aspects
 	==> Thread Priorities
 	==> Underlying os
 	
 	Thread Priorites:
 		1). Every Thread wiil be having a priority.
 		2). Thtead priorited varies between [1 to 10]
 			==> Minimum priority: 1
 			==> Maximum priority: 10
 			==> Default/Normal priority: 5
 */
