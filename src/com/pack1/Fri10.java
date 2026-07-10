package com.pack1;



// This program are for the Operators using the Increment or Decrement operators (++ or --)
public class Fri10
{
	void meth1()
	{
		System.out.println("Meth1() Called" );
		int num=100; //num=100
		
		System.out.println(num);// print number value is =100
		System.out.println(++num);//print 101 and the num=101 stored as the next num value this is the PRE-increment 
		System.out.println(num++);//print 101 and the num=102
		
		int y=num; // y=102
		System.out.println(++y);//103 printed then the y=103
		System.out.println(y++);// 103 printed the n the y=104
		System.out.println(y);//104 printed and the y=104
		num=++y + --num; // num= 105 + 101= 206 means the num=206
		
		int z=num;// z=num means the value of the z=206
		System.out.println(--z);// 205 will be printed and the the z=205
		System.out.println(z);// 205 printed her
		System.out.println(z-- + ++z);// before -- the value of the z=205 and after 204 now z=204 go to the next step ++z ther the vlue is going fot he task is the z=204  after task completed the value of the z=205 so the value will be add the 205+205 so the 410 and the still the value of the z=205
		
		num=z++ - --y; //num = 205-104= 101
		System.out.println(z);// print 205
		System.out.println(z--);// print 205 and the vlaue of the next z=204
		System.out.println(++z);// 206 printed
		System.out.println(num);// 101 printed 	
	}
	void meth2()
	{
		int a=50;
		int b=20;
		int c;
		int d;
		
		c=++a;// c=51 and a=51
		d=--b;// d=19 and also b=19
		
		System.out.println("Print the value of a: "+a);
		System.out.println("Print the value of b: "+b);
		System.out.println("Print the value of c: "+c);
		System.out.println("Print the value of d: "+d);
	}
	void meth3()
	{
		int q=20;
		System.out.println(q++);// print 20 , 21 new q=21, POST- Increment 
		System.out.println(q);//21
		System.out.println(++q);// PRE increment 22 new q=22
		System.out.println(--q);// PRE-Decrement q=21
		System.out.println(q--);// printed 21 new value new q=20
		System.out.println(q);//20
		System.out.println("Value of the q: "+ q);//printed 20
		q=q++ +5;// new value q=25
		System.out.println("new value q:"+q);
	}
	void meth4()
	{
		int t=50;//t=50
		
		/*System.out.println("T Vlaue:"+(t+t));// T=100 , t value still is 50
		System.out.println(t++);//t=50 new value t=51
		System.out.println(t--);// t=51 new value t=50
		System.out.println(t);// t=50*/
		
		System.out.println(++t);// t=51 printed new value=51
		System.out.println(t++);// print t=51 new value t=52
		System.out.println(--t);// print t=51 new value t=51
		System.out.println(t--);// print t=51 new value t=50
		t=t++ + --t;// t=50
	}
	public static void main(String[] args) {
		Fri10 obj=new Fri10();
		//obj.meth1();
		//obj.meth2();
		//obj.meth3();
		obj.meth4();
	}
}