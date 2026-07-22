package com.pack1;

public class We22
{
	public void meth1(int age, String name, char gender)
	{
		System.out.println("Methd1() called");
		// break; // C.E because break can't be used outside of a loop or the switch
		
		final int i=40;
		byte b=30;
		//i++;// C.E because final variables are compile time constants
		
		switch(b+35) //30+35===>65 it is int type datatype
		{
			// System.out.println("Methd1() called"); // not used inside the switch case indiviual case
			case 10:
				System.out.println("Case 10 will be executed");
				break;
			case 20:
				System.out.println("Case 20 will be executed");
				break;
			case 'A':
				System.out.println("Case 65 will be executed");
				System.out.println("int & Char both are compatable datatypes");
				// i++; // C.E because final variables are compile time constants
				
				switch(gender)
				{
					case 'F','f':
						System.out.println(name+" is Female");
						if(age>=26)
						{
							System.out.println(name+" you can start searching for your soul partner ");
						}
						else
						{
							System.out.println(name+" you need to wait "+(26-age)+" years");
						}
					break;
					
					case 'M','m':
						System.out.println(name+" is Male");
					
					if(age>=28)
					{
						System.out.println(name+" you can start searching for your soul partner");
					}
					else
					{
						System.out.println(name+" you need to wait "+(28-age)+" years");
					}
				break;
				
				}
				
				
				break;
			case 40:
				System.out.println("Case 40 will be executed");
				break;
			case 50:
				System.out.println("Case 50 will be executed");
				break;
			default:
				System.out.println("Invalid value");
		}
	}
	public static void main(String[] args) {
		We22 obj=new We22();
		obj.meth1(21, "Rohit", 'M');
	}
}