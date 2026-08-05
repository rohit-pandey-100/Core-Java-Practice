// array practice 
//Task(1):
/*Given an int array length 3, if there is 2 in the array immediately followed by a 3, change the element 3 to 0, and return the changed array.
123---120
234---204
122---122

int[] meth1()
{
    //write your logic here
}*/

/*package com.pack1;

import java.util.Arrays;

public class Aug5 
{
	int[] meth1(int[] arr)
	{
		if(arr[0]==2 && arr[1]==3 )
		{
			arr[1]=0;
		}
		else if(arr[1]==2 && arr[2]==3)
		{
			arr[2]=0;
		}
		return arr;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int[] result=obj.meth1(new int[]{2,3,2,3});
		System.out.println(Arrays.toString(result));
		//System.out.println(result);
	}
}*/


// second code

/*package com.pack1;

import java.util.Arrays;

public class Aug5
{
	int[] meth1(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[i+1]==3)
			{
				arr[i+1]=0;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int[] result=obj.meth1(new int[] {2,3,4});
		int[] result1=obj.meth1(new int[] {2,3,2,3});
		int[] result2=obj.meth1(new int[] {2,3,4,5,2,3});
		int[] result3=obj.meth1(new int[] {2,3,4,3,2,3,2,3,2,3});
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));
	}
}*/

// Second Task
/*
 Given an array of integer, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, return 0 if the array length is 0.
1,2,3---3
5,5---10
8,2,1,4---10

int meth3(int []arr)
{
   //write your logic here
}
 */

/*package com.pack1;

public class Aug5
{
	int meth1(int[] arr)
	{
		if(arr.length>=2)
		{
			return arr[0]+arr[1];
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Aug5 obj=new Aug5();
		int result=obj.meth1(new int[] {2,3,4});
		//System.out.println(Arrays.toString(result));
		System.out.println(result);
	}
}*/

//Third Task

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) ? true
firstLast6([6, 1, 2, 3]) ? true
firstLast6([13, 6, 1, 2, 3]) ? false

public boolean firstLast6(int[] nums)
{
  //write your logic here
}
 */

/*package com.pack1;

public class Aug5
{
	public boolean firstLast(int[] arr)
	{
		if(arr[0]==6 || arr[arr.length-1]==6)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		boolean result=obj.firstLast(new int[] {6,2,3});
		boolean result1=obj.firstLast(new int[] {1,2,3,6});
		boolean result2=obj.firstLast(new int[] {1,2,4,5,7,8});
		boolean result3=obj.firstLast(new int[] {1,6,7,4,6,7,9,6,1});
		boolean result4=obj.firstLast(new int[] {1,2,3,4,5,6});
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}*/

//Fourth Task

/*
  Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) ? false
sameFirstLast([1, 2, 3, 1]) ? true
sameFirstLast([1, 2, 1]) ? true

public boolean sameFirstLast(int[] nums)
{  
    //write your logic here
}
 */

/*package com.pack1;

public class Aug5
{
	public boolean  sameFirstLast(int[] arr)
	{
		if(arr[0]==arr[arr.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		boolean result=obj.sameFirstLast(new int[] {2,3,4,2});
		boolean result1=obj.sameFirstLast(new int[] {2,3,4,2,4});
		boolean result2=obj.sameFirstLast(new int[] {2,3,4,2,5,7,2});
		boolean result3=obj.sameFirstLast(new int[] {2,3,4,2,4,5,6,7,8,9});
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}*/

//Fiveth Task
/*
  Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

makePi() ? [3, 1, 4]

public int[] makePi()
{
     // write your logic here
}
 */

/*package com.pack1;

import java.util.Arrays;

public class Aug5
{
	public int[] makePi()
	{
		return new int[] {3,1,4};
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int[] result=obj.makePi();
		System.out.println(Arrays.toString(result));
	}
}*/

// Sixth Task
/*
 Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) ? true
commonEnd([1, 2, 3], [7, 3, 2]) ? false
commonEnd([1, 2, 3], [1, 3]) ? true

public boolean commonEnd(int[] a, int[] b)
{

    // write your logic here
}
 */

/*package com.pack1;


public class Aug5
{
	public boolean commonEnd(int[] a, int[] b)
	{
		if(a[0]==b[0] && a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		boolean result=obj.commonEnd(new int[] {2,3,4,5,6}, new int[] {2,3,8,9,6});
		boolean result1=obj.commonEnd(new int[] {1,2,3}, new int[] {1,4,5,3,7,3});
		boolean result2=obj.commonEnd(new int[] {0,4,8,9,0,1}, new int[] {0,4,5,2,6,1});
		boolean result3=obj.commonEnd(new int[] {2,3,4,5,6,7}, new int[] {1});
		boolean result4=obj.commonEnd(new int[] {1,2,3,4,5}, new int[] {0,9,8,7});
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
}*/

//Second code

/*package com.pack1;


public class Aug5
{
	public boolean commonEnd(int[] a, int[] b)
	{
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		boolean result=obj.commonEnd(new int[] {2,3,4,5,6}, new int[] {2,3,8,9,6});
		boolean result1=obj.commonEnd(new int[] {1,2,3}, new int[] {1,4,5,3,7,3});
		boolean result2=obj.commonEnd(new int[] {0,4,8,9,0,1}, new int[] {0,4,5,2,6,1});
		boolean result3=obj.commonEnd(new int[] {2,3,4,5,6,7}, new int[] {1});
		boolean result4=obj.commonEnd(new int[] {1,2,3,4,5}, new int[] {0,9,8,7});
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
}*/

//Seventh Task
/*
 
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) ? 6
sum3([5, 11, 2]) ? 18
sum3([7, 0, 0]) ? 7

public int sum3(int[] nums)
{
    // write your logic here

}
*/

/*package com.pack1;

public class Aug5
{
	public int sum3(int[] nums)
	{
		//return nums[0]+nums[1]+nums[3];
		return nums[0]+nums[1]+nums[nums.length-1];
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int result=obj.sum3(new int[] {4,5,6});
		System.out.println(result);
	}
}*/

/*package com.pack1;

public class Aug5
{
	public int sum3(int[] nums)
	{
		int sum=0;
		
		for(int i=0;i<=nums.length-1;i++)
		{
			sum=sum+nums[i];
		}
			
		return sum;
		
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int result=obj.sum3(new int[] {4,5,6,10});
		System.out.println(result);
	}
}*/

// Eighth Task

/*
 Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) ? [2, 3, 1]
rotateLeft3([5, 11, 9]) ? [11, 9, 5]
rotateLeft3([7, 0, 0]) ? [0, 0, 7]

public int[] rotateLeft3(int[] nums)
{
    // write your logic here    
}
 */

/*package com.pack1;

import java.util.Arrays;

public class Aug5
{
	public int[] rotateLeft(int[] nums)
	{
		int temp=nums[0];
		nums[0]=nums[1];
		nums[1]=nums[2];
		//nums[2]=nums[3];
		nums[2]=temp;
		
		return  nums;
	}
	public static void main(String[] args) {
		Aug5 obj=new Aug5();
		int[] result=obj.rotateLeft(new int[] {1,2,3});
		System.out.println(Arrays.toString(result));
	}
}*/


