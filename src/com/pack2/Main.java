package com.pack2;

public class Main
{
	/*public static void main(String[] args) 
    {
        int a = 9;
        int b = 10;
        // What will be the output of the following Java program?
        System.out.println(a < b);
    }*/
	
	// Second question
	
	/*public static void main(String[] args) {
        System.out.println(1 & 3);
        // What is the output
    }*/
	
	// Third question guess the output
	
	 /*public static void main(String[] args) {
		 int a = 5;
		 a += a++; //a = (int)(a + a++);
		 int y=a;
		 System.out.println(a);
		 // what is the output
		 System.out.println(y);
		 }*/
	
	// Fourth question
	
	/*public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 11;
        int x = ++a * b / ++c;//11*30/12=27.5
        
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }*/
	
	// Fifth question
	
	/*public static void main(String[] args) {
		 int a = 2, b = 3;
		 System.out.println(a * b);
		 }*/
	
	// Sixth question 
	
	/*public static void main(String[] args)
	{
		int a = 5;

		if (a > 10 && ++a > 6) {
		    System.out.println("Hello");
		}
		// The && operator are skip  the evaluating right hand operand?
		System.out.println(a);

		if (a > 10 & ++a > 6) {
		    System.out.println("Hello");
		}
		System.out.println(a);
	}*/
	
	// Seventh question
	
	/*public static void main(String[] args) {
		 int a = 20, b = 10;
		 
		 if ((a < b) & (++b < 20)) {
			 // The & operator are checked the both side of the condition if right side condition are false so it is also check the left side condition
		 System.out.println("Boolean AND");
		 } else {
		 System.out.println("b value is : " + b);
		 }
		 }*/
	
	// Eighth question
	
	/* public static void main(String[] args) 
	    {
	        int a = 10;
	        int b = 10;
	        System.out.println(a != b);
	    }*/
	
	// Ninth question 
	
	/*public static void main(String[] args) {
		 System.out.print("Y" + "O");
		 System.out.print('L');
		 System.out.print('O');
		 }*/
	
	// tenth question
	
	/*public static void main(String[] args) 
    {
        int a = 9;
        int b = 10;
        int c = 10;
        System.out.println(a != b == (a == c));
    }*/
	
	// eleventh question
	
	/*static {
		System.out.print("Hello");
		}

		public static void main(String[] args) {
		System.out.print("World");
		}*/
	
	
	// Twelfth question
	
	
	/*static String college = "Naresh IT";

    String name;

    Main(String n) {
        name = n;
    }

    public static void main(String[] args) {

    	Main s1 = new Main("Rohit");
    	Main s2 = new Main("Amit");
    	Main s3 = new Main("Rahul");

        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println(s3.college);
    }*/
	
	
	// Thirteen question
	
	/*static {
		System.out.print("X");
		}

		public static void main(String[] args) {
		System.out.print("Y");
		}

		static {
		System.out.print("Z");
		}*/
	
	// Fourteen question
	
	/*static int n;
	public static void main(String[] a) {
	System.out.print(n);
	}*/
	
	
	// Fifteen question
	
	/*static void show() {
		System.out.print("Hi ");
		}

		public static void main(String[] args) {
		show();
		}*/
	
	
	// sixteen question
	
	 static int count = 0;

	    Main() {
	        count++;
	        System.out.println("Count = " + count);
	    }
	    //Initialized only once when class loads of static variables.
	    public static void main(String[] args) {

	        new Main();
	        new Main();
	        new Main();
	    }
}