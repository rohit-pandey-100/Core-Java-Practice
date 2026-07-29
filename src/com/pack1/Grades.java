package com.pack1;

import java.util.Scanner;

public class Grades
{	
	Scanner sc=new Scanner(System.in);
	
	public void Reports()
	{
		for(int i=1;i<=4;i++)
		{
			while(true)
			{
				System.out.println("Enter the marks for student "+i+":");
				int Marks=sc.nextInt();
				
				String grade = null;
				
				if(Marks>=90)
				{
					grade="A";
					//System.out.println("Grade: "+grade);
				}
				else if(Marks>=75)
				{
					grade="B";
					//System.out.println("Grade: "+grade);
				}
				else if(Marks>=60)
				{
					grade="C";
					//System.out.println("Grade: "+grade);
				}
				else if(Marks<60)
				{
					grade="D";
					//System.out.println("Grade: "+grade);
				}
				
				switch(grade)
				{
				case "A":
					System.out.println("Grade: "+grade+" - Excellent");
					break;
				case "B":
					System.out.println("Grade: "+grade+" - Good");
					break;
				case "C":
					System.out.println("Grade: "+grade+" - Average");
					break;
				case "D":
					System.out.println("Grade: "+grade+" - Needs Improvement");
					break;
				}
				break;
			}
		}
	}
	public static void main(String[] args) {
		Grades obj=new Grades();
		obj.Reports();
	}
}