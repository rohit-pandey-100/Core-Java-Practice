package com.pack2;

import java.util.ArrayList;
import java.util.HashMap;

public class Step25 
{
	HashMap<Object, Object> meth1(ArrayList<Integer> al3)
	{
		for(int i=al3.size()-1;i>=0;i--)
		{
			System.out.println(al3.get(i));
		}
		HashMap<Object, Object> hm=new HashMap<Object, Object>();
		hm.put(1,"Javaa");
		hm.put(2,false);
		hm.put(3,'A');
		
		return hm;
	}
	static void meth2(int p, int q)
	{
		System.out.println("This is static method referncing: "+(p+q));
	}
	Step25()
	{
		System.out.println("This is constructor referencing ");
	}

}
