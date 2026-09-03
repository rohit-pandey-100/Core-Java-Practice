package com.pack1;

public class ThirdStep3 
{
	public static void main(String[] args) {
		
		final String A="JAVA";
		final String B="PYTHON";
		
		Thread t1=new Thread()
		{
			//Anonomayous inner class start here
			
			@Override
			public void run()
			{
				synchronized(A) // Thread 1 is holding java
				{
					System.out.println("Thread 1 locked on A");
					
					try
					{
						Thread.sleep(5000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)// Thread will be waiting for B(Python)
					{
						System.out.println("Thread 1 locked on B");
					}
					System.out.println("no dead lock");
				}
			}
		} // Anonomyous Inner calss Ends here
		;
		
		Thread t2=new Thread()
		{
			@Override
			public void run()
			{
				synchronized(B)// Thread 2 is holding Python
				{
					System.out.println("Thread 2 locked on B");
					try
					{
						Thread.sleep(5000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(A) //Thread 2 will be waiting for A(JAVA)
					{
						System.out.println("Thread 2 locked on A");
					}
				}
				System.out.println("no dead lock");
			}
		}
		;
		t1.start();
		t2.start();
	}
}
