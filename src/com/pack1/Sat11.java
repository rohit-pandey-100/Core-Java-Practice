// Today's going to practice some task like:
// Write a method 2 method with void return type with one void passed three parameter
// and second void with two parameter then write the tow default constructor or one is the parameter constructor
// Task is the to add value, subtract value, multiplied the value and divided the value

package com.pack1;

/*public class Sat11
{
	void meth1(int x, int y, int z)
	{
		System.out.println("Addition: "+(x+y+z));
		new Sat11().meth2(20,40);
	}
	void meth2(int x, int y)
	{
		System.out.println("Subtraction: "+(x-y));
	}
	Sat11()
	{
		System.out.println("Multiplication: "+(10*2));
	}
	Sat11(int x)
	{
		System.out.println("Division: "+(x/2));
	}
	public static void main(String[] args)
	{
		new Sat11(20).meth1(20,10,30);
	}
}*/



// if and else practice or the logical operators like AND, OR, and NOT


/*public class Sat11
{
	void meth1()
	{
		int a=10;
		int b=20;
		
		if(a==b)
		{
			System.out.println("You are correct");
		}
		else
		{
			System.out.println("You are wrong bro");
		}
	}
	
	void meth2(int x, int y)
	{
		if(x==y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	void meth3(int x, int y)
	{
		if(x==y && x>y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	// check the eligibility for the exam
	void meth4(String s, int x)
	{
		if(!(x>=21 && x<=35))
		{
			System.out.println("You are eligible for the exam");
		}
		else
		{
			System.out.println("You are NOT eligible for this Exam");
		}
	}
	public static void main(String[] args) {
		//new Sat11().meth1();
		new Sat11().meth4("Rohit", 38);
	}
}*/


// Next code for the boolean or condition check true or false


public class Sat11
{
	void meth1()
	{
		System.out.println("Meth1() called");
		int x=7; int y=3;
		boolean isEqual=x==y;
		boolean isGreaterThan=x>y;
		boolean isLessThan=x<y;
		boolean isNoEqual=x!=y;
		
		System.out.println("IS Equal: "+isEqual);
		System.out.println("Is Greater Than: "+isGreaterThan);
		System.out.println("Is Less Than: "+isLessThan);
		System.out.println("Is No Equal: "+isNoEqual);
	}
	void meth2()
	{
		System.out.println("Meth2() called");
		boolean p=true, q=false;
		
		boolean logicalAND = p && q;
		boolean logicalOR = p || q;
		boolean logicalNOTp =!p;
		boolean logicalNOTq = !q;
		
		System.out.println("logical AND: "+logicalAND);
		System.out.println("logical OR: "+logicalOR);
		System.out.println("logical NOT p: "+logicalNOTp);
		System.out.println("logical NOT q: "+logicalNOTq);
	}
	void meth3()
	{
		
	}
	public static void main(String[] args) {
		new Sat11().meth1();
		System.out.println("---------------------");
		new Sat11().meth2();
	}
}


