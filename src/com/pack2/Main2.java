package com.pack2;

public class Main2  
{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		// Which method is required here to start the thread?
		//t.start();
		
		t.run(); 
		System.out.println("Main method ends");
	}

}
