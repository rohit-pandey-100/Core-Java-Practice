package com.pack1;

public class SecondAug18 extends Aug18
{
	void meth2()
	{
		System.out.println("Meth2() Called");
		System.out.println("Achiving the properties of another class methoed");
	}
	public static void main(String[] args) {
		Aug18 obj1=new Aug18();
		obj1.meth1(); // 1st-POINT Has-A-Relation
		//obj.meth2(); //C.E
		
		Aug18 obj2=new SecondAug18(); // 2nd-POINT
		obj2.meth1();
		//obj2.meth2(); //C.E
		
		SecondAug18 aboj=new SecondAug18(); // 3rd-POINT Is-A-Relation
		aboj.meth1();
		aboj.meth2();
		
		//SecondAug18 aboj=new Aug18(); // 4th-POINT //C.E
		
	}

}

// Aug18 ==> Parent class
// SecondAug18() ==> Child class