// Multi-level inheritance


package com.pack2;

import com.pack1.SecondAug18;

public class ThirdAug18 extends SecondAug18
{
	void meth3()
	{
		System.out.println("Meth3() Called");
		System.out.println("Multi-level Inheritance");
	}
	public static void main(String[] args) {
		ThirdAug18 obj=new ThirdAug18();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}
