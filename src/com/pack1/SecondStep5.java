package com.pack1;

public class SecondStep5 extends Thread
{
	@Override
	public void run()
	{
		int count=1;
		
		while(true)
		{
			System.out.println("run(): "+count++);
		}
	}
	public static void main(String[] args) {
		SecondStep5 obj=new SecondStep5();
		
		Thread t=new Thread(obj);
		t.setDaemon(true);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main()===> "+i);
		}
		
	}

}
