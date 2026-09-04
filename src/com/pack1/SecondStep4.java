package com.pack1;

public class SecondStep4 extends Thread
{
	public static void main(String[] args) {
		
		Step4 obj=new Step4();
		
		new Thread() //First Thread
		{ // Anonymous Inner class starts here
			
			@Override
			public void run()
			{
				try
				{
					obj.with_draw(20000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}// Anonymous Inners class End here
		.start();
		
		new Thread() //Thread 2
		{ //Anonymous Inner class starts here
			
			@Override
			public void run()
			{
				obj.deposit(900000);
			}
		}// Anonymous Inner class Ends here
		.start();
	}

}
