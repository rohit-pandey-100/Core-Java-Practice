package com.pack1;

public class Fri24
{
	void meth1()
	{
		System.out.println("----------Meth1()----------");
		for(int i=1; i<=5; ++i)
		{
			System.out.println("i value: "+i);
		}
		System.out.println("Meth1() execution completed");
	}
	void meth2()
	{
		System.out.println("----------Meth2()----------");
		
		for(int i=1;i<=10;i++)
			System.out.println("i value: "+ i++);
		System.out.println("Meth2() execution completed");
	}
	void meth3()
	{
		System.out.println("----------Meth3()----------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1; i++,--j)
			{
				System.out.println("i value: "+i);
				System.out.println("j value: "+j);
				System.out.println("------------");
			}
			System.out.println("i ===> "+i);
		}
		System.out.println("Meth3() execution completed");
	}
	void meth4()
	{
		System.out.println("----------Meth4()----------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1; i++,--j)
			{
				if(j==3)
				{
					i=j;
					System.out.println("===> "+ (i++ + ++j));
				}
				System.out.println("i value: "+i);
				System.out.println("j value: "+j);
				System.out.println("--------------");
				break;
			}
		}
		System.out.println("Meth4() execution completed");
	}
	void meth5()
	{
		System.out.println("----------Meth5()----------");
		
		Fri24 obj=new Fri24();
		int i =obj.meth6()-64;
		for(;i<=5;obj.meth7())
		{
			System.out.println("i value: "+ i++);
			i++;
		}
		System.out.println("Meth5() execution completed");
	}
	int meth6()
	{
		System.out.println("----------Meth6()----------");
		return 'A';
	}
	void meth7()
	{
		System.out.println("----------------------------");
	}
	void meth8()
	{
		int i=1;
		for(System.out.print("----------Meth8()"),System.out.println("----------");;)
		{
			System.out.println("i value: "+ i);
			i++;
			break;
		}
		System.out.println("Meth8() execution completed"); // C.E beacuase of unreachable code
	}
	void meth9()
	{
		System.out.println("----------Meth9()----------");
		
		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j =1;j<=i; j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		System.out.println("Meth9() execution completed");
	}
	void meth10()
	{
		System.out.println("----------Meth10()----------");
		
		int sum=0;
		for(int i=1;i<=3;i++)
			sum +=i;
		for(int j=1; j<=5; j++)
			if(j%2 == 0)
				sum +=j;
			else 
				sum -=j;
		int k=1;
		while(k<=3)
		{
			sum += k*2;
			k++;
		}
		int m=5;
		
		do
		{
			sum -=m;
			m--;
		}
		while(m>2);
		System.out.println("final sum = "+ sum);
		System.out.println("Meth10() execution completed");
	}
	public static void main(String[] args) {
		Fri24 obj=new Fri24();
		//obj.meth1();
		//obj.meth2();
		//obj.meth3();
		//obj.meth4();
		//obj.meth5();
		//obj.meth8();
		//obj.meth9();
		obj.meth10();
	}
}