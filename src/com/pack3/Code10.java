package com.pack3;

//import java.util.*;

/*public class Code10 {

    int y=50000;



    public void method_setSalary()
    {
        int x=60000;


        System.out.println("Local Salary: "+x);
        System.out.println("Instance Salary: "+y);
    }
    public static void main(String[] args) {
        
        Main aboj=new Main();
        aboj.method_setSalary();
    }
}*/


// And second code for the same output but is correct format of the code

//import java.util.*;

/*public class Code10 {

    int Salary=50000;



    public void method_setSalary(int Salary)
    {
        
        System.out.println("Local Salary: "+Salary);
        System.out.println("Instance Salary: "+new Code10().Salary);
    }
    public static void main(String[] args) {
        
    	Code10 aboj=new Code10();
        aboj.method_setSalary(60000);
    }
}*/

// Third code as given by the ChatGpt

public class Code10
{
    int salary = 50000;

    public void method_setSalary(int salary)
    {
        System.out.println("Local Salary: " + salary);
        System.out.println("Instance Salary: " + this.salary);
    }

    public static void main(String[] args)
    {
    	Code10 obj = new Code10();
        obj.method_setSalary(60000);
    }
}


