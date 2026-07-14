
// By using the void call the static variable

package com.pack1;

/*public class Tu14
{
	int x;// This is the Instance variable
	static int y;// This is the static variable
	
	
	public void meth1()
	{
		x++;
		y++;
		
		System.out.println("Print the value of the x: "+x);
		System.out.println("Print the value of the y: "+y);
	}
	public static void main(String[] args) {
		Tu14 aobj=new Tu14();
		aobj.meth1();
		System.out.println("------------------------------");
		aobj.meth1();
		System.out.println("------------------------------");
		aobj.meth1();
		
	}
}*/


// By using the constructor calling the static variable

/*public class Tu14
{
	int x;
	static int y;
	
	Tu14()
	{
		x++;
		y++;
		
		System.out.println("Print the value of the x: "+x);
		System.out.println("Print the value of the y: "+y);
	}
	public static void main(String[] args) {
		new Tu14();
		System.out.println("------------------------------");
		new Tu14();
		System.out.println("------------------------------");
		new Tu14();
	}
}*/


// By using static method calling the static variable


/*public class Tu14
{
	int x;
	static int y;
	
	static void meth1()
	{
		//x++;
		y++;
		
		System.out.println("Print the value of the x: "+new Tu14().x);
		System.out.println("Print the value of the y: "+y);
	}
	public static void main(String[] args) {
		new Tu14();
		meth1();
		new Tu14().meth1();
		Tu14.meth1();
		
		
	}
}*/


//Both Static and the non-static method 

/*public class Tu14
{
	int x=10;
	static int y=20;
	
	public void meth1()
	{
		System.out.println("Meth1() Called");
		System.out.println("Print the value of the x: "+x);
		System.out.println("Print the value of the y: "+y);
	}
	static void meth2()
	{
		System.out.println("Meth2() Called");
		System.out.println("Print the value of the x: "+new Tu14().x);// In the static method we are not able to called the 
		// instance variable but we used the respective class object we can called the instance varibale 
		System.out.println("Print the value of the y: "+y);
	}
	public static void main(String[] args) {
		Tu14 obj=new Tu14();
		obj.meth1();
		//meth1();
		//Tu14.meth1();
		System.out.println("------------------------------");
		
		Tu14.meth2();// Calling the meth2 by using respective class name
		System.out.println("------------------------------");
		obj.meth2();//calling the meth2 by using the respective class object
		System.out.println("------------------------------");
		meth2();// Calling the meth2 by using Identifier name
	}
}*/


// static block



/*public class Tu14
{
	static // This is called the static block
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("world");
		
	}
	static 
	{
		System.out.println("Java");
	}
	// when we are calling the main method in our program if there any static block are available so the first priority given to the static variable.
	// The static block are executes from top to bottom after executed all the static block then the main method are executing
}
*/

// final static variable

public class Tu14
{
	final static int a=10;// this value is the consent for the entire program
	
	static // This is called the static block
	{
		//a=20;
		System.out.println("Hello");
		System.out.println("1st static block executed, value of a: "+a);
		//a=20;
	}
	public static void main(String[] args) {
		//a=30;
		System.out.println("world");
		System.out.println("main() executed, value of a: "+a);
		//a=30;
		
	}
	static 
	{
		//a=40; // compile time error because final is a compile time consent 
		System.out.println("Java");
		System.out.println("2nd static block executed, value of a: "+a);
		//a=40;
	}
}

