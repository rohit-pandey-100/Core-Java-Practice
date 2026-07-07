package com.pack1;

/*public class Tu7
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		new Tu7(500).meth2();
	}
	void meth2()
	{
		System.out.println("Mmeth2() Called");
		new Tu7('A');
	}
	Tu7()
	{
		System.out.println("Non-parameterized Construtor");
		new Tu7(100);
	}
	Tu7(int x)
	{
		System.out.println("Parameterized Construtor:"+x);
		System.out.println("Java is Awesome");		
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Tu7 aboj=new Tu7();
		aboj.meth1();
		System.out.println("End");
	}
}*/



// Second code

/*public class Tu7
{
	public Tu7()
	{
		System.out.println("Sunday");
		Tu7 obj=new Tu7(10); 
		System.out.println("Tuesday");
		String s=obj.display("Challange Accepted");
		System.out.println(s);
	}
	public Tu7(int temp)
	{
		System.out.println("Saturday");
		Tu7 obj=new Tu7(10,20);
		int a=obj.meth1()+temp;
		System.out.println("==>"+(a+obj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the next statement I am returning String value");
		return s;
	}
	int meth()
	{
		return 100;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public Tu7(int data,int emp)
	{
		System.out.println("Thrusday");
		System.out.println("==>"+(data+new Tu7("Hi").meth2()-emp));
	}
	Tu7(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		Tu7 obj=new Tu7();
		System.out.println("Output verified");
	}
	
} */



//Third Code Assignment 

/*public class Tu7
{
	int calculate(int x)
	{
		System.out.println("Inside Calculate:"+x);
		return x*3;
	}
	int compute(int a, int b)
	{
		System.out.println("Inside Compute:"+a+","+b);
		return a+b;
	}
	int process(int m, int n)
	{
		System.out.println("Inside process:"+m+","+n);
		return m-n;
	}
	int analyze(int p, int a, int r)
	{
		System.out.println("Inside analyze:"+p+","+a+","+r);
		return x/2;
	}
	Tu7()
	{
		System.out.println(10);
	}
	Tu7 (int a, String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	Tu7(String s, int x)
	{
		System.out.println(s);
		System.out.println((x*2)+100);
	}
	public static void main(String[] args) {
		int result=new Tu7().calculate(new Tu7(new Tu7().evaluate(6),"hi").compute(10,new Tu7().process(8, 4)+new Tu7("hi",20).analyze(5, 3, new Tu7().evaluate(6)));
		System.out.println("Final Result:"+result);
	}
}*/

public class Tu7
{
	int x=100;
	static int y=10;
	
	
	
	public void meth1()
	{
		final int x=20;
		System.out.println("Start");
		meth2(20,20);
		System.out.println("Print the value of instance:"+x);
		new Tu7(100);
		System.out.println("end");
		new Tu7().meth3(50,40);
		
	}
	Tu7()
	{
		System.out.println("1,2,3");
	}
	public int meth2(int x, int y)
	{
		System.out.println("Run");
		return x+y;
	}
	Tu7(int x)
	{
		System.out.println("Run");
		System.out.println("Meth1() Passed the value:"+x);
		
	}
	public int meth3(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		Tu7 obj=new Tu7();
		obj.meth1();
	}
}





