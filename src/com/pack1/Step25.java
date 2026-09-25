package com.pack1;

public class Step25 
{
	void display()
	{
		System.out.println("Implementing Lambda Expresion\n");
		
		//SecondStep25 iaobj=(int num)->System.out.println("Num Value: "+num); //1st way
		//SecondStep25 iaobj=(num)->System.out.println("Num Value: "+num); //2nd way
		SecondStep25 iaobj=num->System.out.println("Num Value: "+num); //3rd way (Allowed only for one parameter)
		iaobj.msg(10);
	}
	public static void main(String[] args) {
		Step25 aobj=new Step25();
		aobj.display();
	}

}
