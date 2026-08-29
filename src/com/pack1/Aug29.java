
// The entire code are finding the exception handling method fomation or alignment are corect or not or the all methos are invalid or valid

package com.pack1;

/*
//Example 1

public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(ArithmeticException e)
		{
			
		}
	}
}
// It is valid
*/

/*
// Example 2

public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(ArithmeticException e)
		{
			
		}
		catch(NullPointerException e)
		{
			
		}
	}
}
// It is valid
*/


/*
// Example 3
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(ArithmeticException e)
		{
			
		}
		catch(ArithmeticException e)
		{
			
		}
	}
}
// It is invalid because we are not used the same execption handling with catch block for two time.
*/

/*
//Example 4
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
	}
}
// It is invalid becuse we can't used the single try block we must we need to write the catch block or finally with the try block single try block, catch block, or finally block are not allowed.
*/

/*
//Example 5
public class Aug29 
{
	public static void main(String[] args) {
		catch(Exception e)
		{
			
		}
	}
}
//It is invalid becuse we can't used the single try block we must we need to write the catch block or finally with the try block single try block, catch block, or finally block are not allowed.
*/


/*
//Example 6
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		System.out.println("Hello!!!");
		catch(ArithmeticException e)
		{
			
		}
	}
}
// It invalid because we can't used the any statment between the try or catch block, try or finally block.
*/


/*
//Example 7
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}
}
// It is valid
*/


/*
//Example 8
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		finally
		{
			
		}
	}
}
//It is valid
*/



/*
//Example 9
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		finally
		{
			
		}
		finally
		{
			
		}
	}
}
// It is the invalid because we can used only one finally block in the try-catch-finally block
*/



/*
//Example 10
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Hello!!!");
		finally
		{
			
		}
	}
}
//It invalid because we can't used the any statment between the try or catch block, try or finally block.
*/



/*
//Example 11
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		finally
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
}
// It is the invalid because we are must be followed the arrangment of the try-catch-finally bloks meanse in the order first try then catch or then fianlly.
*/



/*
//Example 12
public class Aug29 
{
	public static void main(String[] args) {
		finally
		{
			
		}
	}
}
//It is invalid becuse we can't used the single try block we must we need to write the catch block or finally with the try block single try block, catch block, or finally block are not allowed.
*/


/*
//Example 13
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			try
			{
				
			}
			catch(Exception e)
			{
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
//It is the valid
*/



/*
//Example 14
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(Exception e)
		{
			try
			{
				
			}
			finally
			{
				
			}
		}
	}
}
// It is the valid
*/



/*
//Example 15
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(Exception e)
		{
			try
			{
				
			}
			catch(Exception e)
			{
				
			}
		}
		finally
		{
			finally
			{
				
			}
		}
	}
}
//It is the invalid we can used only one the finally block
*/




/*
//Example 16
public class Aug29 
{
	public static void main(String[] args) {
		
		finally
		{
			
		}
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
}
// it is invalid order not menttend
*/



//Example 17
public class Aug29 
{
	public static void main(String[] args) {
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try
			{
				
			}
			catch(Exception e)
			{
				
			}
			finally
			{
				
			}
		}
	}
}
//It is the valid