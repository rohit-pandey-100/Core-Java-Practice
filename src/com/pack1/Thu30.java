package com.pack1;

//import com.pack2.ClassB;// This is the first way import package name.ClassName;
                        // This is the highly recommended
//import com.pack2.*;// This is the second way import packageName.*;
                   // But this method are not recommended
import com.pack2.ClassD;

public class Thu30 extends ClassD
{
	public static void main(String[] args) 
	{
		
		// Code one for the calling the another class method into anohter class but it in the same package
		
		/*ClassA obj=new ClassA(); // A method are present in the anothe calss but this both are present in the same package
		// So we dont need to import that class we can directy called int he another class   
        // It aslo depends on the access modifire
		obj.meth1();*/             		
		
		//Code second for the calling the another class method into anohter class but it in the different package
		
		
		//com.pack2.ClassB obj=new com.pack2.ClassB(); // When we are calling the class method from another class which is present in the another package so we need to the import them inot the calling class
		// This is the thered way with there fully qualified class name
		//obj.meth1(400,200);
		// There are three way to import the class:
		
		Thu30 obj=new Thu30();
		obj.meth1(10, 5, 25);// There showing the error because the ClassD method are protected so we need to inherit them
		obj.meth1(10, 5000, 25);
	}
}
