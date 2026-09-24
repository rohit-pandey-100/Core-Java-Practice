package com.pack1;

public class Step24 
{
	void meth1()
	{
		System.out.println("Implementing the Lambda expresion");
		
		//SecondStep24 x=()->System.out.println("Hello World!!!");
		//x.meth1();
		//SecondStep24 x=(String s)->System.out.println("Hello World!!!");
		//x.meth2("Java");
		//SecondStep24 x=(int a, int b)->System.out.println("Addition: "+(a+b));
		//x.meth3(99, 101);
		SecondStep24 x=(int r, int s)->
		{
			if(r>=20)
			{
				System.out.println("if block executed");
				return 100;
			}
			else
			{
				System.out.println("else block executed");
				return 999;
			}
		};
		int result=x.meth4(30, 5);
		System.out.println("Meth4() is returning : "+result);
	}
	public static void main(String[] args) {
		Step24 obj=new Step24();
		obj.meth1();
	}

}
