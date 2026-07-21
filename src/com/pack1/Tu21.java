// Tsak for if else condtion 


// Task 1 write the program wiht the three parameter and the output never chneged the whne the value are chgedn mean the always the bugest value are coming on the output
package com.pack1;

/*public class Tu21
{
    public void big_value(int x, int y, int z)
    {
        if (x > y)
        {
            if (x > z)
            {
                System.out.println("The biggest value is x: " + x);
            }
            else
            {
                System.out.println("The biggest value is z: " + z);
            }
        }
        else
        {
            if (y > z)
            {
                System.out.println("The biggest value is y: " + y);
            }
            else
            {
                System.out.println("The biggest value is z: " + z);
            }
        }
    }

    public static void main(String[] args)
    {
        Tu21 obj = new Tu21();

        //obj.big_value(50, 10, 30);   // x = 50
        obj.big_value(20, 80, 40);   // y = 80
        //obj.big_value(10, 20, 90);   // z = 90
        //obj.big_value(100, 90, 80);  // x = 100
        //obj.big_value(30, 70, 50);   // y = 70
    }
}*/


// Second task to find the the strutre are the reactangle or the square on the parameter the length or breath

/*public class Tu21
{
	public void structure(int length, int bradth)
	{
		if (length==bradth)
		{
			System.out.println("This structure is the square");
		}
		else 
		{
			System.out.println("This structure is the reactangle");
		}
	}
	public static void main(String[] args) {
		Tu21 obg=new Tu21();
		obg.structure(10, 20);
	}
}*/


// Thired task when the customer buy the a unit of the product and the cutoerm bill gone to graterthen 1000 then applyed the 10% discount eh on there bill and aslo the one unit of the product price is the 100RS

/*public class Tu21
{
	public void Bill(int units)
	{
		int bill=units*100;
		
		if (bill>=1000)
		{
			int discount=(bill*10)/100;
			int actualPrice=bill-discount;
			
			
			System.out.println("Total Bill Amount : Rs." + bill);
			System.out.println("Discount (10%) : Rs." + discount);
			System.out.println("Final Bill Amount : Rs." + actualPrice);
			System.out.println("Congratulations! You have received a 10% discount on your bill.");
		}
		else 
		{
			System.out.println("Total Bill Amount : Rs." + bill);
			System.out.println("Sorry! You are not eligible for the 10% discount.");
			System.out.println("Shop for Rs." + (1000 - bill) + " more to get the discount on your bill.");
		} 
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		obj.Bill(4);
	}
}*/


// Task Fourth Principle asking for the student grade so write the code for finding the student grade like:
// Which studne get the below 25 marks his grade is the 'F'
// Which studne get the below 25 or below 45 marks his grade is the 'E'
// Which studne get the below 45 or below 50 marks his grade is the 'D'
// Which studne get the below 50 or below 60 marks his grade is the 'C'
// Which studne get the below 60 or below 80 marks his grade is the 'B'
// Which studne get the grater tehn 80 marks his grade is the 'A'

/*public class Tu21
{
	public void Marks(int marks)
	{
		if(marks<25) 
			System.out.println("The student grade is: F ");
			else if(marks==25 || marks<45)
			{
				System.out.println("The student grade is: E ");
			}
			else if(marks<=45 || marks<50)
			{
				System.out.println("The student grade is: D ");
			}
			else if(marks<=50 || marks<60)
			{
				System.out.println("The student grade is: C ");
			}
			else if(marks<=60 || marks<80)
			{
				System.out.println("The student grade is: B ");
			}
			else if(marks>=80)
			{
				System.out.println("The student grade is: A ");
			}
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		obj.Marks(30);
	}
}*/


// Second code for the finding the grade 

/*public class Tu21
{
	public void Marks(int marks)
	{
		if(marks<25) 
			System.out.println("The student grade is: F ");
			else if(marks>=25 && marks<45)
			{
				System.out.println("The student grade is: E ");
			}
			else if(marks>=45 && marks<50)
			{
				System.out.println("The student grade is: D ");
			}
			else if(marks>=50 && marks<60)
			{
				System.out.println("The student grade is: C ");
			}
			else if(marks>=60 && marks<80)
			{
				System.out.println("The student grade is: B ");
			}
			else if(marks>=80)
			{
				System.out.println("The student grade is: A ");
			}
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		obj.Marks(49);
	}
}*/

// Fiveth taask To find the weird condtion like when the int n value si the even print the not weird or odd print eh wried 
// if the int value is rnaged in the n<=5 ofr not woried or eh n<=20 weird hen it is odd print the odd

/*public class Tu21
{
	public void weird(int n)
	{
		if(n%2==0)
		{
			if(n>=2 && n<=5)
			{
				System.out.println("NOt weird");
			}
			if(n>=6 && n<=20)
			{
				System.out.println("weird");
			}
			if(n>20)
			{
				System.out.println("NOt weird");
			}
		}
		else 
		{
			System.out.println("Number is odd");
		}	
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		obj.weird(6);
	}
}*/

// Second code for finding the weird print value

/*public class Tu21
{
	public void weird(int n)
	{
		boolean iseven=(n%2==0);
		
		if(iseven)
		{
			if(n>=2 && n<=5)
			{
				System.out.println("NOt weird");
			}
			if(n>=6 && n<=20)
			{
				System.out.println("weird");
			}
			if(n>20)
			{
				System.out.println("NOt weird");
			}
		}
		else 
		{
			System.out.println("Number is odd");
		}	
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		obj.weird(6);
	}
}*/


// Sixeth task find the output

public class Tu21
{
	public String meth1(int a, int b, int c, int d)
	{
		if(a<=10)
		{
			System.out.println("hi");
			if((a+b)==50)
				return "Hi";
			    return "Hello";
		}
		else 
		{
			if(c>=0)
			{
				if(true)
					return "Tuesday";
				return "Wenesday";
			}
			else
			{
				if(d>0)
					System.out.println(d+"is a positive Number");
				else if(d<0)
					System.out.println(d+"is a negative Number");
				else
					System.out.println(d+"is a equal to zero");
				return "JAVA is awesome";
			}
		}
	}
	public static void main(String[] args) {
		Tu21 obj=new Tu21();
		String result1=obj.meth1(5, 45, 0, 0);
		System.out.println("Meth1() is returning ===>"+result1);
		
		String result2=obj.meth1(11, 20, 30, -5);
		System.out.println("Meth1() is returning ===>"+result2);
		
		String result3=obj.meth1(15, 20, 10, 5);
		System.out.println("Meth1() is returning ===>"+result3);
		
		String result4=obj.meth1(0, 20, 30, 0);
		System.out.println("Meth1() is returning ===>"+result4);
		
		
	}
}
