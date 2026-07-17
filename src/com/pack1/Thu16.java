// First code

/*package com.pack1;

public class Thu16
{
	// This program for the type casting.
	public void meth1() 
	{
		System.out.println("Performing Implicit typecasting\n");
		// byte to convert into the int data type
		byte b1=20;
		int i1=b1;
		
		System.out.println("byte PDT b1: "+b1);
		System.out.println("int PDT i1: "+i1);
		
		// char to convert into the int, float data type
		char c1='R';
		int i2=c1;
		float f1=c1;
		
		System.out.println("\nchar PDT c1: "+c1);
		System.out.println("int PDT i2: "+i2);
		System.out.println("float PDT f1: "+f1);
	}
	void meth2()
	{
		System.out.println("Performing Explicit typecasting\n");
		
		int i3=100;
		byte b2=(byte)i3; // in the Explicit conversation we want to declared to the compiler this we want to convert into the another data type with the data type name
		
		System.out.println("byte PDT b2: "+b2);
		System.out.println("int PDT i3: "+i3);
		
		int i4=500;
		byte b3=(byte)i4;// The byte ranged is the -128 to 127
		
		System.out.println("byte PDT b3: "+b3);// we get the 100 output for the byte because when the value are highest value as compression to he data type value range then there applied the a formula
		// [minimumRange +(result - maximumRange - 1)]
		// -128 +(500 - 127 -1) = -128 +372 =244
		// 244 value is still not under the byte value range so again applied the formula
		// -128 +(244-128) =-128-116= 12
		System.out.println("int PDT i4: "+i4);
		
		// used the compile time constant value
		
		final int i5=30; // This is the compile time constant value
		byte b4=i5; // when we used the final constant value but in the ranged in the convert data type range so we don't want to declared the data type name on the front. 
		
		System.out.println("\nbyte PDT b4: "+b4);
		System.out.println("int PDT i5: "+i5);
		
		final int i6=300;
		byte b5=(byte)i6;
		
		System.out.println("\nbyte PDT b5: "+b5);
		System.out.println("int PDT i6: "+i6);
		
		
		// convert float into byte
		
		float f2=20.999f;
		byte b6=(byte)f2;
		
		System.out.println("\nbyte PDT b6: "+b6);
		System.out.println("float PDT f2: "+f2);
	}
	
	public void meth3(byte b)
	{
		System.out.println("Java is awesome: "+b+" "+"Time's");
	}
	public static void main(String[] args) {
		Thu16 aboj=new Thu16();
		//aboj.meth1();
		//aboj.meth2();
		aboj.meth3((byte)100);
	}
}*/


// Second code as task to gases the output

package com.pack1;

public class Thu16
{
	void Implicit()
	{
		byte b=10;
		System.out.println("byte value  is "+b);
		short s=b;
		System.out.println("Short value is "+s);
		s++;
		int i=s++;
		System.out.println("int value is "+i);
		System.out.println("short value is "+s);
		long l=i;
		System.out.println("long value is "+(--l));
		float f=1;
		System.out.println("The value of float is "+(f+b));
		double d=(--f);
		System.out.println("The value of double is "+d);
		show();
		if (!(d==f))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}
	public static void main(String[] args) {
		Thu16 a=new Thu16();
		a.Implicit();
	}
	static void show()
	{
		char c='A';
		int a=++c;
		System.out.println(a);
		Thu16 obj=new Thu16();
		String s=obj.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String s="Implicit casting is done by the compiler automatically";
		return s;
	}
}