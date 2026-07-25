package com.pack1;

public class Sat25
{
	void meth1()
	{
		System.out.println("meth1() called\n");
		
		String names[]=  {"Trishka", "Crysatal", "Athena", "Anjum", "Sujatah"};
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println("\nReturning the elements in BOTH directions by using for loop");
		
		for(int i=0; i<=4;i++)
		{
			System.out.print(names[i]+"\n");
		}
		System.out.println();
		for(int i=4; i>=0;i--)
		{
			System.out.print(names[i]+"\n ");
		}
		System.out.println("\nReturing the elements by using for loop\n");
		
		for(String data:names)
		{
			System.out.print(data+" ");
		}
		System.out.println("\nReturing the elements by using foreach loop");
	}
	public static void main(String[] args) {
		Sat25 obj=new Sat25();
		obj.meth1();
	}
}