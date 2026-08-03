package com.pack1;

import java.util.Arrays;

public class Sat1 
{
	void meth1()
	{
		System.out.println("Implementing Array\n");
		
		int arr1[];
		arr1=new int[5];
		int arr2[]=new int[4];
		int arr3[]= {11,22,33};
		int arr4[]=new int[] {10,20,30,40,50,60};
		String s="Java";
		
		System.out.println("arr1: "+arr1.length);
		System.out.println("arr2: "+arr2.length);
		System.out.println("arr3: "+arr3.length);
		System.out.println("arr4: "+arr4.length);
		System.out.println("s: "+s.length());
		
		System.out.println("\narr1: "+arr1);
		System.out.println("arr2: "+arr2);
		System.out.println("arr3: "+arr3);
		System.out.println("arr4: "+arr4);
		
		System.out.println("\n arr1: "+Arrays.toString(arr1)); //[0,0,0,0,0]
		System.out.println("arr2: "+Arrays.toString(arr2)); //[0,0,0,0,0]
		System.out.println("arr3: "+Arrays.toString(arr3)); //[11,22,33,]
		System.out.println("arr4: "+Arrays.toString(arr4)); //[10,20,30,40,50,60]
		
		arr1[1]=15;
		arr1[3]=35;
		
		//arr1[j]=100; //It generates AIOB EXCEPTION
		
		System.out.println("\narr1: "+Arrays.toString(arr1)); //[0,15,0,35,0]
		
		System.out.println("----------------------------");
		
		System.out.println(arr1[arr1.length-2]);
		System.out.println(arr3[arr1.length-arr2.length]);
		System.out.println(arr4[(arr2.length)/2]);
		System.out.println(arr1[1]+(arr4[2]/2));
		System.out.println(arr4[arr4.length-1]);
		
		System.out.println("----------------------");
		System.out.println("Reteriving the elements by using for loop");
		for(int i=0;i<=arr4.length-1;i++)
			System.out.print(arr4[i]+" ");
		System.out.println();
		
		for(int i=arr4.length-1;i>=0;i--)
			System.out.print(arr4[i]+" ");
		System.out.println("\n\nReteriving the elements by using foreach loop");
		
		for(int data:arr4)
			System.out.print(data+" ");
		
		int nums1[]= {2,3,4,5,6,7,8};
		int nums2[]=new int[4];
		
		int index=0;
		
		for(int data:nums1)
		{
			if(data%2==0)
			{
				nums2[index++]=data;
			}
		}
		System.out.println("\n\nnums1: "+Arrays.toString(nums1));
		System.out.println("nums2: "+Arrays.toString(nums2));
	}
	public static void main(String[] args) {
		Sat1 obj=new Sat1();
		obj.meth1();
	}

}
