package com.pack1;

public class Step4 
{
	int amount=10000; //Instance
	
	synchronized void with_draw(int amount) throws InterruptedException //20000
	{
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance");
			wait(3000);
			//Thread.sleep(30000);
			System.out.println("Amount credited");
			this.amount-=amount;
			System.out.println("With draw successsfull \nBalance is "+ this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("With draw successfuly \nBalance is "+this.amount);
		}
	}
	synchronized void deposit(int amount)
	{
		this.amount +=amount;
		System.out.println("Deposited successfully \nBalance is "+ this.amount);
		
		//notify();
		//notifyAll();
	}
}
