
// Group of Thread

package com.pack1;

public class ThirdStep4 implements Runnable 
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		
		ThirdStep4 obj=new ThirdStep4(); // class Object
		
		ThreadGroup tg=new ThreadGroup("Parent ThreadGroup");
		
		Thread t1=new Thread(tg,obj,"One");
		t1.start();
		//t1.start(); // Generates IllegalThreadStateException(We can't start the Thread multipletime
		
		Thread t2=new Thread(tg,obj,"Two");
		t2.start();
		
		Thread t3=new Thread(tg,obj,"Third");
		t3.start();
		
		System.out.println("Active Thread: "+ tg.activeCount());
		System.out.println("Thread group Name: "+tg.getName());
		tg.setMaxPriority(10);
	}

}
