package com.pack2;

public class ClassE
{
	void meth1(int r) 
	{
		System.out.println("---Meth1() while condtion started---");
		
		while(r<=10)
		{
			System.out.println("r value: "+r++);
			r++;
		}
		System.out.println("---Meth1() while condtion ended---");
	}
	void meth2(int r)
	{
		System.out.println("---Meth2() while condtion started---");
		
		while(r<=5)
		{
			int j=2;
			if(j==2)
			{
				System.out.println("j vlaue: "+ j++ +"\nr value: "+ r++);
				
				while(j<=10)
					System.out.println(j++ +" "+ r++);
			}
			System.out.println("r value: "+ r++);
		}
		System.out.println("---Meth2() while condtion ended---");
		
	}
	void meth3(int r)
	{
		System.out.println("---Meth3() do while condtion started---");;
		
		do
		{
			System.out.println("r value: "+ r++);
		}
		while(r<=5);
		System.out.println("---Meth3() do while condtion ended---");
	}
	public static void main(String[] args) {
		ClassE obj=new ClassE();
		//obj.meth1(1);
		//obj.meth2(1);
		obj.meth3(1);
	}
}