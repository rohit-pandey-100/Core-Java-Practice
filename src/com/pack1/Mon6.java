package com.pack1;

public class Mon6
{
	int x=10;  // This is a instance (or) Non-Static (or) Global Variable 
	static int y=20; // This is a static variable (or) Class variable 
	
	int a; // Instance 
	static boolean flag; // Static 
	
	//byte x=20;
	//static byte x=20;
	//static Stirng y=20;
	//Mon6 a=new Mon6();
	
	
	void meth1()
	{
		System.out.println("Meth1() called \n");
		
		int z=30; //Local variable
		System.out.println("Instance Variable X:"+ x);// By using the identifier name
		System.out.println("Instance Variable X:"+new Mon6().x);// By using the Class obj Name
		
		
	
		System.out.println("\nStatic Variable Y:"+y);// By using the identifier name
		System.out.println("\nStatic Variable Y:"+new Mon6().y);// By using the Class obj Name
		System.out.println("\nStatic Variable Y:"+Mon6.y);// By using the respective Class Name
		
		
		
		System.out.println("\nLocal variable Z:"+z);// By using the identifier name
	}
	
	void meth2()
	{
		int x=111;
		int y=222;
		
		System.out.println("\nInstance Variable X:"+new Mon6().x);
		System.out.println("Static Variable Y:"+Mon6.y);
		//System.out.println("Local Variable Z:"+z);
		System.out.println("Local Variable X:"+x+"y:"+y);
	}
	void meth3()
	{
		System.out.println("Meth3() Called\n");
		
		char c='A'; //Local variable
		
		// static String s="Java"; // C.E
		
		System.out.println("Instance Variable a:"+a);
		System.out.println("Static variable flag:"+Mon6.flag);
		System.out.println("Local Variable c:"+c);
	}
	public static void main(String[] args) {
		Mon6 aboj=new Mon6();
		aboj.meth1();
		aboj.meth2();
		aboj.meth3();
	}
}