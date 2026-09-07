package com.pack1;

public class Step7 
{
	void meth1()
	{
		System.out.println("meth1() called");
		Step7 obj=new Step7();
	}
	@Override
	protected void finalize()
	{
		System.out.println("Object Destroyed");
	}
	public static void main(String[] args) {
		Step7 aobj1=new Step7(); //1st Object
		Step7 aobj2=new Step7(); //2nd objec
		
		//System.out.println("aobj1: "+aobj1.hashCode());
		//System.out.println("aobj2: "+aobj2.hashCode());
		
		aobj1.meth1();
		
		aobj1=null; // Nullyfing the reference
		aobj1=aobj2; //Reassiging the reference
		
		System.gc();
		
		//System.out.println("\naobj1: "+aobj1.hashCode());
		//System.out.println("aobj2: "+aobj2.hashCode());
	}

}
