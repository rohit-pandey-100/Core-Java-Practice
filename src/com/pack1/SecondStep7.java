package com.pack1;

public final class SecondStep7 // Fibnal calssed can't be inherited
{
	final int i=10;
	
	final void meth1() //final methods can't be Overriden but we can inherit
	{
		System.out.println("meth1() called");
		//System.out.println(i++); //C.E because of compiletime constant
	}
}

//Q) What is the difference between final & private methods?
//A) final methods are can we inherit but we can't inherit or final methods we can't Override and private we can't inherit or not Override