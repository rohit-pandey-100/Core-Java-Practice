package com.pack2;
// code Ride MCQ code practice
//code number=1
/*public class ClassG 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<2; i++) 
		{
			for(int j=0; j<3; j++)
				System.out.print("*");
		}
	}
}*/

// Second code
/*public class ClassG
{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
				System.out.print(j + " ");
				System.out.println();
		}
		
	}
}*/

// Thrid code 
/*public class ClassG
{
	public static void main(String[] args) 
	{
		for(int i=0; i<2; i++) 
		{
		for(int j=0; j<2; j++)
		System.out.print(i+j);
		}
	}
}*/

// Fourth code

/*public class ClassG
{
	public static void main(String[] args)
	{
		int a[] = {3, 1, 2};
		int max = a[0];
		for(int x : a)
		if(x > max) max = x;
		System.out.print(max);
	}
}*/

// Fivth code
/*public class ClassG
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i=1; i<=3; i++) // 2,3,4
		{
		for(int j=1; j<=i; j++)
		sum += i * j;// sum= sum+(i*j)
		}
		System.out.print(sum);// 2,9,24
		}
}*/

// Sixth code

/*public class ClassG
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=3; i++) 
		{
		for(int j=i; j<=3; j++)
		System.out.print(j + " ");
		}
	}
}*/

// Seventh code 

/*public class ClassG
{
	public static void main(String[] args)
	{
		char a[] = {'x', 'y', 'z'};
		String s = "";
		for(char c : a)
		s += c;
		System.out.print(s);
	}
}*/

//Eight code

/*public class ClassG
{
	public static void main(String[] args) 
	{
		int i = 1, sum = 0;
		do 
		{
		sum += i;//sum=sum+i = 0+1=1/1+2=3/3+3=6/4+6=10
		i++;//2,3,4
		} 
		while(i <= 4);
		System.out.println(sum);//1,3,6,10
	}
}*/

// Ninth code

/*public class ClassG
{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++)
		{
		for(int j=1; j<=i; j++)
		System.out.print("*");
		System.out.println();
		}
	}
}*/

// tenth code

/*public class ClassG
{
	public static void main(String[] args) 
	{

		int a = 10, b = 20;

		if (a++ > 10)
		if (b++ > 20)
		System.out.println("X");
		else if (++a == 12)
		System.out.println("Y");
		else
		System.out.println("Z");
		else if (++b == 21)
		System.out.println("P");
		else
		System.out.println("Q");

		System.out.println("a=" + a + ", b=" + b);
	}
}*/

// eleventh code

/*public class ClassG
{
	public static void main(String[] args) 
	{

		int a = 8;

		if (a > 10) 
		{
		System.out.println("Large");
		} 
		else if (a >= 8 && a <= 10) 
		{
		System.out.println("Medium");
		} 
		else if (a > 5) 
		{
		System.out.println("Small");
		} 
		else 
		{
		System.out.println("Very Small");
		}
		}
}*/

// Tweleth code

/*public class ClassG
{
	public static void main(String[] args) 
	{

		int num = 11;

		if (num % 2 == 0) 
		{
		System.out.println("Even");
		} 
		else if (num > 10) 
		{
		System.out.println("Odd > 10");
		} 
		else if (num > 5) 
		{
		System.out.println("Odd > 5");
		} else 
		{
		System.out.println("Others");
		}
	}
}*/

// Thieteenth code
/*public class ClassG
{
	public static void main(String[] args) 
	{

		int x = 2;

		if ((x = x + 2) == 5)
		System.out.println("A");
		else if ((x = x * 2) == 8)
		System.out.println("B");
		else if ((x += 3) == 13)
		System.out.println("C");
		else
		System.out.println("D");

		System.out.println("x=" + x);
	}
}*/

// Forteenth code
/*public class ClassG
{
	public static void main(String[] args) 
	{

		int x = 15;

		if (x > 20) 
		{
		System.out.println("P");
		} 
		else if (x >= 15) {
		System.out.println("Q");
		} 
		else if (x > 10) {
		System.out.println("R");
		} 
		else 
		{
		System.out.println("S");
		}
	}
}*/

//fivettenth code

/*public class ClassG
{
	public static void main(String[] args) 
	{

		int n = 0;

		if (n > 0) 
		{
		System.out.println("Positive");
		} 
		else if (n < 0) 
		{
		System.out.println("Negative");
		} 
		else 
		{
		System.out.println("Zero");
		}
	}
}*/

//Sixteenth code

/*public class ClassG
{
	public static void main(String[] args) 
	{

		int score = 75;

		if (score > 80)
		System.out.println("Excellent");
		else if (score >= 75)
		System.out.println("Very Good");
		else if (score >= 75 && score < 90)
		System.out.println("Confusing Range");
		else
		System.out.println("Average");
		}
}*/

// Seventeenth code
/*public class ClassG
{
	public static void main(String[] args) 
	{
		int x = 10;

		if (x > 5) 
		{
		System.out.println("A");
		} 
		else if (x > 8) 
		{
		System.out.println("B");
		} else 
		{
		System.out.println("C");
		}
	}
}*/

// Eighteenth code

public class ClassG
{
	public static void main(String[] args) 
	{

		int n = -5;

		if (n > 0) 
		{
		System.out.println("Positive");
		} 
		else if (n % 2 == 0) 
		{
		System.out.println("Even Negative");
		} 
		else 
		{
		System.out.println("Odd Negative");
		}
	}
}
