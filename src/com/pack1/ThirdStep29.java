package com.pack1;

public class ThirdStep29 
{
	//method Local inner Class
	void meth1()
	{
		
		String s="java";
		class MethodInnerClassA
		{
			 void msg1()
			 {
				 System.out.println(s.concat(" is awesome"));
			 }
		}
		class MethodInnerClassB
		{
			void msg2()
			{
				System.out.println(s.concat(" is amazing"));
			}
		}
		new MethodInnerClassA().msg1();
		new MethodInnerClassB().msg2();
	}
	public static void main(String[] args) {
		ThirdStep29 obj=new ThirdStep29();
		obj.meth1();
	}

}
