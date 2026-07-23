package com.pack1;

public class Thu23
{
	void meth1(int i)
	{
		System.out.println("-------Meth1()--------");
		
		while(i<=5)
		{
			System.out.println("i value: "+i);
			break; // it used for the termiated the program or out from the block
		}
		System.out.println("Meth1() execution completed");
	}
	void meth2(int i)
	{
		System.out.println("-------Meth2()--------");
		
		while(i<=5)
		{
			System.out.println("i value: "+i++);
			//break; // if i am write the break statment so the prgram only one time will be executed when i removed the breake condtion so the program are exectued when the condition are not stasified or terminated
			
		}
		System.out.println("Meth2() execution completed");
	}
	void meth3(int i)
	{
		System.out.println("-------Meth3()--------");
		
		while(i<=10) // 13<=10
		{
			//System.out.println("i vlaue: "+ i+++ ++i); // there the i++ + ++i is a not add ther they are connected with other menas 1 3
			//System.out.println("i value: "+ (i++ + ++i));// in thsi codetion the i vlaue are going to the add to other value
			//System.out.println("i value: "+ ++i);
			i++;
		}
		System.out.println("Meth3() execution completed");
	}
	void meth4(int i)
	{
		System.out.println("-------Meth4()--------");
		
		while(i<=5) //3 <=5
		{
			if(i==2)
			{
				int j=5;
				while(j>=1) //0>=1
					System.out.println(j-- +" "+ i++); // 1 6 j=0,i=7
			}
			System.out.println("i value: "+ ++i); //8
		}
		System.out.println("Meth4() execution completed");
	}
	void meth5(int i)
	{
		System.out.println("-------Meth5()--------");
		
		while(i<=5)
		{
			int j=5;
			while(j>=1)
			{
				System.out.println(--j +" "+ i);
				
				while(j>=3)
					System.out.println(++i +" "+ --j);
			}
			System.out.println("i value: "+ ++i);
		}
		System.out.println("Meth5() execution completed");
	}
	void meth6(int i)
	{
		System.out.println("-------Meth6()--------");
		
		do
		{
			System.out.println("i value: "+ i);
			i++;
		}
		while(i<=5);
		System.out.println("Meth6() execution completed");
	}
	void meth7(int i)
	{
		System.out.println("-------Meth7()--------");
		
		while(true)
		{
			System.out.println("i value: "+ i++); // without break condtion it will be make a C.E unreachable code
			break;
		}
		System.out.println("Meth7() execution completed"); // C.E unreachable code
	}
	public static void main(String[] args) {
		Thu23 obj=new Thu23();
		//obj.meth1(1);
		//obj.meth2(1);
		//obj.meth3(1);
		//obj.meth4(1);
		//obj.meth5(1);
		//obj.meth6(1);
		obj.meth7(1);
	}
}