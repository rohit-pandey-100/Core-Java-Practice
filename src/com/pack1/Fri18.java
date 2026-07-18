package com.pack1;

public class Fri18
{
	void meth1()
	{
		 System.out.println("Implementing AutoBoxing");
		
		int i=10;
		Integer ival1=i;// 1st way
		Integer ival2=new Integer(i); // 2nd way
		Integer ival3=Integer.valueOf(i);// 3rd way
		
		System.out.println("Int PDT i: "+i);
		System.out.println("Integer WCO ival1: "+ival1);
		System.out.println("Integer WCO ival2: "+ival2);
		System.out.println("Integer WCO ival3: "+ival3);
		
		char c='A';
		Character cval1=c;
		Character cval2=new Character(c);
		Character cval3=Character.valueOf(c);
		
		System.out.println("\nChar PDT i: "+c);
		System.out.println("Character WCO cval1: "+cval1);
		System.out.println("Character WCO cval2: "+cval2);
		System.out.println("Character WCO cval3: "+cval3);
		
		
	}
	void meth2()
	{
		System.out.println("Implementing AutoUn-BOxing");
		
		Integer ival=new Integer(100);
		int i1=ival; //1st way
		int i2=ival.intValue(); //2nd way
		System.out.println("Integer WCO ival: "+ ival);
		System.out.println("int PDT i1: "+i1);
		System.out.println("int PDT i2: "+i2);
		
		Float fval = new Float(10.9f);
		float f1 = fval.floatValue();
		
		System.out.println("\nFlaot WCO fval: "+fval);
		System.out.println("flaot PDT f1: "+f1);
		
	}
	void meth3()
	{
		System.out.println("Meth3() Called\n");
		
		int x=Integer.parseInt("10");
		System.out.println("x: "+x);
		
		int y=Integer.parseInt("90");
		System.out.println("y: "+y);
		
		System.out.println("Addition: "+(x+y));
		
		boolean flag=Boolean.parseBoolean("Truee");
		System.out.println("\nboolean flag: "+flag);
		
		System.out.println("\nByte Range: "+Byte.MIN_VALUE+" to "+Byte.MIN_VALUE);
	}
	public static void main(String[] args) {
		Fri18 obj=new Fri18();
		//obj.meth1();
		//System.out.println("-------------------------");
		//obj.meth2();
		//System.out.println("-------------------------");
		obj.meth3();
	}
}