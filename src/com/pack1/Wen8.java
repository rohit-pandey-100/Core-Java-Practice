//First Task Completed 


package com.pack1;

 /*public class Wen8 // First point in the task given by the sir are writing the Class name as the "Programming" but i replaced with the Wen8
{
	// Third Task is the when the we doesn't passed any parameter to the object(constructor) then print the "I love programming"
	Wen8()
	{
		System.out.println("I Love Programming");
	}
	// Fourth case when we passed the any parameter then the print value of the parameter 
	Wen8(String s)
	{
		System.out.println("I Love "+s);
	}
	public static void main(String[] args) {
		Wen8 aboj=new Wen8();// second Task to create a object and object are created in the main method
		Wen8 aboj2=new Wen8("Java");
	}
	
} */


// Second Task completed

/*public class Wen8 // Task is to create a class with the "Student_class" Name
{
	Wen8() // Task two when the no parameter passed through the constructor then print the "Unknow"
	{
		System.out.println("Unknow");
	}
	Wen8(String x)// Task three when we passed any value through the constructor then the value is print mean student name is print
	{
		System.out.println("Student Name Is:"+x);
	}
	public static void main(String[] args) {
	 	Wen8 a=new Wen8();
	 	Wen8 b=new Wen8("Rohit");
	}
} */


// Third Task completed

/*public class Wen8
{
	// Task one create a class with the "AddAmount" name
	int amount=500;
	// Task two create a data member named 'amount' with the initial value is 500
	// Task three now create a two constructor for this class
	Wen8()
	{
		System.out.println("Your Current Account Balance Is:"+amount);
	}
	Wen8(int x)
	{
		//amount+=x;
		int z=amount+x;
		System.out.println("Your Current Account Balance Is:"+z);
	}
	public static void main(String[] args) {
		Wen8 balance=new Wen8();
		Wen8 Creadit=new Wen8(1000);
	}
} */


// Fourth Assignment 


public class Wen8
{
    int a = 10;

    public String testMethod1()
    {
        new Wen8(100, 200, "JAVA");
        System.out.println(40);

        return new Wen8().testMethod3(
                new Wen8(50).testMethod2()
        ) + new Wen8().testMethod4("hi");
    }

    Wen8()
    {
        System.out.println("Hi");
    }

    public int testMethod2()
    {
        System.out.println(50);
        return 10 + 15;
    }

    Wen8(int a)
    { 
        System.out.println("JAVA is awesome");
    }

    public String testMethod3(int a)
    {
        System.out.println(18);
        return "is";
    }

    public String testMethod4(String s)
    {
        return s;
    }

    Wen8(int a, int b, String s)
    {
        System.out.println(a + b);
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        Wen8 t1 = new Wen8();
        t1.a = 10;

        Wen8 t2 = new Wen8(50);
        t2.a = 30;

        System.out.println(
            "Java" + t1.testMethod2() + " " + (t1.a + t2.a - 30)
        );
    }
}