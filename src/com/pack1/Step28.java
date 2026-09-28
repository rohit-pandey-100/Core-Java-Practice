package com.pack1;

import java.util.Arrays;

public class Step28 
{
	void meth1()
	{
		System.out.println("Implementing prallel Array Sorting");
		
		int arr[]= {1,2,4,6,5,3,7};
		System.out.println("Before array sorting:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After array sorting:"+Arrays.toString(arr));
		
		int arr2[]= {1,3,2,5,7,6,4,8,10,9};
		System.out.println("\nBefore sorting the arr:"+Arrays.toString(arr2));
		Arrays.parallelSort(arr2,1,4);
		Arrays.parallelSort(arr2,5,10);
		System.out.println("After Prallel sorting the arr:"+Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		Step28 obj=new Step28();
		obj.meth1();
	}

}
