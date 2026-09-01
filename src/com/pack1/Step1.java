package com.pack1;

public class Step1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("run() Execution started");
		for(int i=1;i<=5;i++)
			System.out.println("i value: "+i);
		System.out.println("Run() execution completed");
	}
	public static void main(String[] args) {
		Step1 sbj=new Step1();
		Thread t1=new Thread(sbj);
		//t1.start();
		/*
		 In this case a new Thread will be created which is responsible for executing the run() predent in Step1() because of method overriding
		 */
		t1.run();
		/*
		 In this case 'No' new Thread will be created which is responsible for executing the run() present in thread Class
		 */
		Thread t2=new Thread();
		//t2.start();
		/*
		 In this case 'No' new Thread will be created we are calling run() present in Thread calss just like a normal method call */
		
		t2.run();
		/*
		 *In this case a new Thread will be created which is respomsible for executing the run() present in Thread calss
		 */
	}
}
