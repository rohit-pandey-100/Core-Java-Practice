package com.pack2;

public class Main3 
{
	public static void main(String[] args) {
		MyRunnable obj = new MyRunnable();
		// Which statement correctly starts the thread?
		//new Thread(obj).start(); // Creating the new Thread and calling the start method
		obj.run(); 
		System.out.println("Main method ends");
	}

}
