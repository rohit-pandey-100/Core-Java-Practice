package com.pack1;

public class Math {
	int add(int a, int b, int c, int d, int e, int f)
	{
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(e+f);
		int r=a+b+c+d+e+f;
		return r;
	}
	int sub(int a, int b, int c, int d, int e, int f)
	{
		System.out.println(a-b);
		System.out.println(c-d);
		System.out.println(e-f);
		int s =a-b-c-d-e-f;
		return s;
	}
	int mult(int a, int b, int c, int d, int e, int f)
	{
		System.out.println(a*b);
		System.out.println(c*d);
		System.out.println(e*f);
		int x=a*b*c*d*e*f;
		return x;
	}
	int div(int a, int b, int c, int d, int e, int f)
	{
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(e/f);
		int y=a/b/c/d/e/f;
		return y;
	}
	public static void main(String[] args) {
		Math aboj=new Math();
	    aboj.add(10, 20, 30, 40, 50, 60);
	    aboj.sub(10, 20, 30, 40, 50, 60);
		aboj.mult(10, 20, 30, 40, 50, 60);
		aboj.div(10, 20, 30, 40, 50, 60);
		
	System.out.println(aboj.add(10, 20, 30, 40, 50, 60)+
	aboj.sub(10, 20, 30, 40, 50, 60)+
	aboj.mult(10, 20, 30, 40, 50, 60)+
	aboj.div(10, 20, 30, 40, 50, 60)) ;
		
	}

}
