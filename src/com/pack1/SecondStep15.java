package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class SecondStep15 
{
	void meth1()
	{
		System.out.println("Passing Userdefined calss Object into ArrayList\n");
		
		ArrayList<Step15> emplist=new ArrayList<Step15>();
		
		Step15 obj1=new Step15("Rohit", 25000, "Java");
		Step15 obj2=new Step15("Roshni", 15000, "Cloud");
		Step15 obj3=new Step15("Ronak", 18000, "Tester");
		Step15 obj4=new Step15("Romiya", 20000, "Front-End");
		
		emplist.add(obj1);
		emplist.add(obj2);
		emplist.add(obj3);
		emplist.add(obj4);
		emplist.add(new Step15("Rio", 22000, "Back-End"));
		
		System.out.println("Reteriving the data by using the Iterator Interface");
		
		Iterator<Step15> i=emplist.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Step15 e=i.next();
			if(e.getEmpSal()>=20000)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		SecondStep15 obj=new SecondStep15();
		obj.meth1();
	}

}
