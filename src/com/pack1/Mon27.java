package com.pack1;

// today only we are practice on the control statment
// First task on write a program on print the table of 2 with taking the only one perameter form the method object
/*public class Mon27
{
	void meth1(int num1)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1+" * "+i+" = "+(num1*i));
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1(3);
	}
}*/

//Second task take two parameter formt he object method and write the progrma on betweent two number print he tabel like tke prameter as 2,8 and write the between all number table including the 2 and 8;

/*public class Mon27
{
	void meth1(int num1, int num2)
	{
		for(;num1<=num2;num1++)
		{
			for(int i=1;i<=10;i++)
				System.out.println(num1+" * "+i+" = "+(num1*i));
			System.out.println("-----------------------------");
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1(2, 8);
	}
}*/

// Third task perint the counting form 1 to 100 without using the loop 

/*public class Mon27
{
	static int num1=101;
	
	void meth1()
	{
		if(num1<=100)
		{
			System.out.println(num1++);
			new Mon27().meth1();
		}
		else
		{
			System.out.println("Wirte a numer between 1 to 100");
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1();
	}
}*/

//Third task write a program using the switch case or pass the three parameter two parameter are the int or therid perameter was on opetrator (+,*,/,-) or perform the artmetic opertion taking the two int value

/*public class Mon27
{
	void meth1(int num1, int num2, char O)
	{
		switch(O)
		{
		case '+':
			System.out.println("Add the number"+(num1+num2));
		break;
		
		case '*':
			System.out.println("Multiplay the number"+(num1*num2));
		break;
		
		case '/':
			System.out.println("Divide the number"+(num1/num2));
		break;
		
		case '-':
			System.out.println("Subtract the number"+(num1-num2));
		break;
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1(20, 30, '+');
	}
}*/

// Fourth code write the factorial program

/*public class Mon27
{
	void meth1(int num1)
	{
		for(int i=1;i<=num1;i++)
		{
			System.out.println("Factorial of "+num1+" = "+(i*num1));
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1(6);
	}
}*/

/*public class Mon27
{
    void meth1(int num1)
    {
        int fact = 1;

        for(int i = 1; i <= num1; i++)
        {
            fact = fact * i;
            System.out.println(fact);
        }

        System.out.println("Factorial of " + num1 + " = " + fact);
    }

    public static void main(String[] args)
    {
        Mon27 obj = new Mon27();
        obj.meth1(5);
    }
}*/

// find the output

public class Mon27
{
	void meth1()
	{
		int i=0,j=0;
		while(i<3)//1<3
		{
			do
			{
				j++;//1,2,3,4
				System.out.print(j+" ");
			}
			while(j<2);
			i++; // 1,2 3,
		}
	}
	public static void main(String[] args) {
		Mon27 obj=new Mon27();
		obj.meth1();
	}
}