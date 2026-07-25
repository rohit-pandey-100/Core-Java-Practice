package com.pack1;

public class Mon20
{
	public void meth1(int i)
	{
		System.out.println("------Statment one called-----------");
		
		if(i<=10)
		{
			System.out.println("!st if block executed");
		}
		System.out.println("--------------------");
		if(i<=100)
		{
			System.out.println("2nd if block executed");
			System.out.println("i value: "+1);
			
			if(i%2==0)
			{
				System.out.println("it is EVEn number");
			}
			else
			{
				System.out.println("it is ODD number");
			}
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int i)
	{
		System.out.println("-------Meth2() start--------");
		
		if(i<0)
			
			//int x=500  //C.E becuase we should not write any declerative code in thsi line
		System.out.println("if block executed");// only first line is under the if condtion or the only one line is effacted  y the if condion or or other stem are not effeacted by the if condition
		// when we want to exuted every line so teh write every line of code in the flower braces {} after if condtion
		System.out.println("JAVA is awseome");
		System.out.println("Meth2() execution completed" );
	}
	void meth3(int i)
	{
		System.out.println("---------meth3()---------------");
		
		if(!((i==10) && new Mon20().meth4(10)))
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}
		System.out.println("Meth3() execution completed");
	}
	boolean meth4(int val)
	{
		System.out.println("Meth4() called");
		
		if (val<=10)
			return true;
		return false;
	}
	void meth5(int i)
	{
		System.out.println("--------------Meth5()----------");
		
		if(true)// if condtion should always give the true or false value so if the if condion should be tur so the neve be the else ocndion can't be runed 
		{
			System.out.println("if block executed");
		}
		/*else // thsi is the resion ther e give to the woarning by the compiler
		{
			System.out.println("else block executed");
		}*/
		System.out.println("Meth5() execution completed");
	}
	void meth6(int i)
	{
		System.out.println("----------Meth6()----------");
		
		if(i>0)// when the onlhy one statment has been to run so we can write like this
			System.out.println("it is positive");
		else if(i<0)
			System.out.println("it is negative");
		else
			System.out.println("it is equal to 0");
		System.out.println("Meth6() execution completed");
	}
	public static void main(String[] args) {
		Mon20 obj=new Mon20();
		//obj.meth1('A'-59);
		//obj.meth2(50);
		//obj.meth3(10);
		//obj.meth5(1000);
		obj.meth6(0);
	}
	
}