package com.pack2;

import java.util.ArrayList;
import java.util.HashMap;

public class Step25A 
{
	void display()
	{
		System.out.println("Implementing lambda expresions");
		
		SecondStep25 iaboj=new Step25()::meth1;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		HashMap<Object, Object> hm1=iaboj.msg(al);
		System.out.println("Keys: "+hm1.keySet());
		System.out.println("Values: "+hm1.values());
		
		
		ThiredStep25 ibobj=Step25::meth2;
		ibobj.meth2(99, 1);
		
		FourthStep25 icobj=Step25::new;
		icobj.meth3();
	}
	public static void main(String[] args) {
		Step25A obj=new Step25A();
		obj.display();
	}

}
