package com.pack1;

public class ClassF {
	public String method1()// comes from main method 
	{
		System.out.println(100);
		return new ClassF().method5(new ClassF().method2(10)+ new ClassF().method4("Java",7))+"&"+new ClassF().method3(new ClassF().method6()-5);
	// ClassF().method5(5+28)+"&"+new ClassF().method3(45);
		// ClassF().method5(5+28)+"&"+Result:46;
		// Value34 & Result:46
	}
	public int method2(int x)// Comes from method1 x=10
	{
		System.out.println(200);
		return new ClassF().method7();// return value is the 5 it's come from method 7
		
	}
	public String method3(int y)// here come from the method1 the value of y is the 45
	{
		System.out.println(300);
		return "Result:"+(y+1);// Returning value is the y+1=46
	}
	public int method4(String s, int times)// again come form the method1 there is the value of String=Java and the value of the int=7 
	{
		System.out.println(400);
		return 4*times;// 4*7 = 28 to the method1
	}
	public String method5(int val)// here come from the method1 val=33
	{
		System.out.println(500);
		return "Value:"+(val+1);// val+1=34 and the return value is the Value 34
	}
	public int method6()// there come from the method1 -5 
	{
		System.out.println(600);
		return 50;// -5 so the return value is the 45 and it is return to the method1
	}
	public int method7()// comes from method2
	{
		System.out.println(700);
		return 5;// return 5 to method2
	}
	public static void main(String[] args) {
		ClassF obj=new ClassF();
		System.out.println("Final Output:"+obj.method1());
	}
	
}
