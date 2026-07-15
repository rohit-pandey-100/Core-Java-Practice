package com.pack1;

/*public class Wen15
{
	// when the static variable or the static block are present in out program so the both having the equal priority in our program.
	// In this program the first will be static variable are executed then the static block  
	static int x=Wen15.meth1();
	
	static int meth1()
	{
		System.out.println("Static method1() called");
		return 10;
	}
	static 
	{
		System.out.println("static block called");
	}
	public static void main(String[] args) {
		System.out.println("main() called");
		
	}
}*/

// Second program calling the static variable or the static variable

/*public class Wen15
{
	static int x=10;
	
	static
	{
		System.out.println("1st Static blocked called ");
		System.out.println("Value of the static variable x: "+x);
	}
	public void meth1()
	{
		System.out.println("Print the value of the x: "+x);
	}
	Wen15()
	{
		++x;
		System.out.println("Increased the value of the x: "+x);
	}
	public static void main(String[] args) {
		System.out.println("main() called");
		x=50;
		new Wen15().meth1();
	}
	static 
	{
		++x;
		
		System.out.println("2nd static block are executed");
		System.out.println("Print the new value of the x: "+x);
		
	}
}*/


// Using the normal variable or the local variable

/*public class Wen15
{
	public static void main(String[] args) {
		int x=20;// This is the normal variable
		System.out.println(x);
	}
	static 
	{
		int x=10;//This is the local variable
		System.out.println(x+ " ");
	}
}*/

// using instance variable, normal or local variable


/*public class Wen15
{
	int x=10;
	
	public static void main(String[] args) {
		int x=20;
		System.out.println(x);
	}
	static
	{
		int x=30;
		System.out.println(x+" ");
	}
}*/

//instance variable calling into the main()

/*public class Wen15
{
	int x=20;
	
	public static void main(String[] args) {
		System.out.println(new Wen15().x);
		//System.out.println(Wen15().x); // There we are gating the error because we are calling the instance variable with the class name but is is not possible. Only we can called the static variable with the calss name.
		
	}
	static 
	{
		int x=30;
		System.out.println(x);
	}
}*/

// changed the static value in the main method

/*public class Wen15
{
	static int x=10;
	
	public static void main(String[] args) {
		Wen15 t1=new Wen15();
		Wen15 t2=new Wen15();
		Wen15 t3=new Wen15();
		
		t1.x=20;
		
		System.out.println(t1.x);
		System.out.println(x+" ");
		System.out.println(t2.x);
		
		t1.x=50;
		
		System.out.println(t3.x);
		
	}
	
}*/

// static value are printing 


/*public class Wen15
{
	static int x=10;
	static int y=20;
	
	static 
	{
		System.out.println("---Test11 SB1 called---");
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		
	}
	static void m1()
	{
		int x=100;
		
		System.out.println("Static method called");
		System.out.println("X: "+x);
		System.out.println("y: "+y);
	}
	public static void main(String[] args) {
		m1();
	}
	static 
	{
		System.out.println("---Test11 SB2 called---");
		System.out.println("X: "+x);
		System.out.println("y: "+y);
		
	}
}*/


// calling the static variable


/*public class Wen15
{
	static int x=m1();
	
	public static void main(String[] args) {
		System.out.println(Wen15.x);
	}
	static 
	{
		System.out.println(x);
		Wen15.x=x+20;	
	}
	static int m1()
	{
		System.out.println(x);
		return m2();
	}
	static int m2()
	{
		System.out.println(Wen15.x);
		return 100;
	}
}*/

// same code 

/*public class Wen15
{
	static int x=m1();
	
	public static void main(String[] args) {
		System.out.println(Wen15.x);
	}
	static 
	{
		System.out.println(x);
		Wen15.x=x+20;	
	}
	static int m1()
	{
		Wen15.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(Wen15.x);
		return 100;
	}
}*/

// Accessing the instance or the static variable

/*public class Wen15
{
	static int a=0; // This is the static variable
	int b=0; // This is the instance variable
	
	Wen15()
	{
		a++;
		b++;
		System.out.println("Static variable===>"+a);
		System.out.println("Static variable===>"+b);
		System.out.println("----------------------");
	}
	void display()
	{
		System.out.println("******Accessing static variable******");
		System.out.println(Wen15.a);
		System.out.println(a);
		System.out.println(new Wen15().a);
		System.out.println(Wen15.a);
	}
	public static void main(String[] args) {
		new Wen15();
		new Wen15();
		new Wen15();
		System.out.println("#########################");
		new Wen15().display();
	}	
}*/


// summary of the code

public class Wen15
{
	int c;
	static int e;
	
	Wen15()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a=34;
		int b=21;
		new Wen15().c-=a++ + ++b;
		int d= -a + --b + new Wen15().c;
		e=a + +b + new Wen15().c+ --d;
		int f= a + --b + -new Wen15().c - d++;
		int sum = a+b+new Wen15().c+d+e+f;
		System.out.println("sum= "+sum);
	}
}