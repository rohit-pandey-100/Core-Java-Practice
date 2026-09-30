package com.pack1;

public class FourthStep29 
{
	//Anonmyous InnerClass
	void meth1()
	{
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		new FourthStep29()
		{
			@Override
			void meth1()
			{
				System.out.println("Java is awesome");
			}
		}
		.meth1();
	}

}
