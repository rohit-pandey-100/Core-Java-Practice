package com.pack1;

public class Aug6
{
	void meth1()
	{
		System.out.println("Meth1() Called");
		String s1="JAVA";
		String s2=new String("JAVA");
		char arr[]= {'J','A','V','A'};
		String s3=new String(arr);
		String s4=new String(arr,2,2);
		
		System.out.println("S1: "+s1+" ("+s1.length()+")");
		System.out.println("S2: "+s2+" ("+s1.length()+")");
		System.out.println("S3: "+s3+" ("+s1.length()+")");
		System.out.println("S4: "+s4+" ("+s1.length()+")");
	}
	void meth2()
	{
		System.out.println("Meth2() Called");
		System.out.println("String Class is Immutable!!!");
		String s="Java";
		s=s.concat(" is awesome");
		//System.out.println("After concat(): "+s.concat(" is awesome"));
		System.out.println("After s: "+s);
	}
	public static void main(String[] args) {
		Aug6 obj=new Aug6();
		//obj.meth1();
		obj.meth2();
	}
}