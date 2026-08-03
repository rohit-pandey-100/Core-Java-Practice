package com.pack1;

public class Fri31Fiveth 
{
	String name; // Abdul kalam sir
	
	Fri31Fiveth()
	{
		this("Abdul kalam sir");
		this.display();
	}
	Fri31Fiveth(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Person Name is: "+name);
		
	}
	public static void main(String[] args) {
		new Fri31Fiveth();
	}

}
