/* package com.pack2;

public class ClassD
{
	void meth1(int a, int b, int c)
	{
		System.out.println("--------Meth1() Start----------");
		
		if(!(!(a==b)))
		{
			System.out.println("False code");
		}
		else
		{
			System.out.println("Print the value of int c: "+c);
		}
	}
	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.meth1(10, 50, 25);
	}
}*/

// Second code 

/*package com.pack2;

public class ClassD
{
    void meth1(int a, int b, int c)
    {
        if (c == 25)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("Not 25");
        }
    }

    public static void main(String[] args)
    {
        ClassD obj = new ClassD();

        obj.meth1(10, 5, 25);
        obj.meth1(100, 5000, 25);
        obj.meth1(-50, 9999, 25);
    }
}*/

// Code three

/*package com.pack2;

public class ClassD
{
    void meth1(int a, int b, int c)
    {
        if (true)
        {
            System.out.println("Print the value of c : " + c);
        }
        else
        {
            System.out.println("This will never execute.");
        }
    }

    public static void main(String[] args)
    {
        ClassD obj = new ClassD();

        obj.meth1(10, 5, 25);
        obj.meth1(100, 5000, 25);
        obj.meth1(-20, 99999, 25);
    }
}*/


//Fourthe code 

package com.pack2;

public class ClassD
{
    protected void meth1(int a, int b, int c)
    {
        if (a > b)
        {
            System.out.println("Print the value of c : " + c);
        }
        else
        {
            System.out.println("Condition is false");
        }
    }

    public static void main(String[] args)
    {
        ClassD obj = new ClassD();
        obj.meth1(10, 5, 25);      // Prints 25
        obj.meth1(10, 5000, 25);   // Prints "Condition is false"
    }
}