package com.pack1;

public class ThirdAug21 extends SecondAug21
{
	@Override
	public String toString()
	{
		return "You re calling the Class-ThirdAug21 Object";
	}
	static void meth4()
	{
		System.out.println("Java");
	}
	public static void main(String[] args) {
		ThirdAug21 obj=new ThirdAug21();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		//obj.meth4();
		
		Aug21 aobj=new ThirdAug21();
		aobj.meth4();
	}
	

}
