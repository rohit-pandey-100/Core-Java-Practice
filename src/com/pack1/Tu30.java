/*
 * package com.pack1;

 * 
 * public class Tu30 { public int meth1(int x, int y) { System.out.println();
 * return meth2(x+y, y); } public int meth2(int sum, int y) {
 * System.out.println(); return meth3(sum-y, y); } public int meth3(int sub, int
 * y) { System.out.println(); return meth4(sub*y, y); } public int meth4(int
 * mul, int y) { System.out.println(); return meth5(mul/y ,mul%y); } public int
 * meth5(int div, int mod) { System.out.println("Reult:"+div);
 * System.out.println("Result:"+mod);
 * 
 * return div; } public static void main(String[] args) { Tu30 obj=new Tu30();
 * obj.meth1(20,10); } }
 */



// Second code on same to first code, for code practice



/*
 * package com.pack1;
 * 
 * public class Tu30 { public int meth1(int x, int y, int z) {
 * System.out.println(); return meth2(x+y, z); } public int meth2(int sum, int
 * z) { System.out.println(); return meth3(sum-z, z); } public int meth3(int
 * sub, int z) { System.out.println(); return meth4(sub*z, z); } public int
 * meth4(int mul, int z) { System.out.println(); return meth5(mul/z ,mul%z); }
 * public int meth5(int div, int mod) { System.out.println("Reult:"+div);
 * System.out.println("Result:"+mod);
 * 
 * return div; } public static void main(String[] args) { Tu30 obj=new Tu30();
 * obj.meth1(20,10, 30); } }
 */






// Third code on the same as first code to improved the practice 


/*
 * package com.pack1;
 * 
 * public class Tu30 { public int meth1(int x, int y) {
 * System.out.println("Sum"); return meth2(x+y, y); } public int meth2(int sum,
 * int y) { System.out.println("Sub"); return meth3(sum-y, y); } public int
 * meth3(int sub, int y) { System.out.println("Multiplication"); return
 * meth4(sub*y, y); } public int meth4(int mul, int y) {
 * System.out.println("Division"); return meth5(mul/y ,mul%y); } public int
 * meth5(int div, int mod) { System.out.println("Reult:"+div);
 * System.out.println("Result:"+mod);
 * 
 * return div; } public static void main(String[] args) { Tu30 obj=new Tu30();
 * obj.meth1(20,10); } }
 */


// Fourth code on the task 



  package com.pack1;
  
  
  public class Tu30 
  { 
	  public int meth1(int x, int y)
	  {
		  System.out.println("Sum"); 
		  return new Tu30().meth2(x+y, y);  
	  } 
	  public int meth2(int sum, int y)
	  { 
		  System.out.println("Sub"); 
		  return new Tu30().meth3(sum-y, y); 
	  } 
	  public int meth3(int sub, int y) 
	  {
		  System.out.println("mul"); 
		  return new Tu30().meth4(sub*y,y); 
	  } 
	  public int meth4(int mul, int y) 
	  { 
		  System.out.println("Result:"+mul);
		  System.out.println("Last Number:"+y); 
		  return mul; 
		 
	  } 
	  public static void main(String[] args) 
	  { 
		  Tu30 obj=new Tu30(); 
		  obj.meth1(50,20);   
	  }  
  }
 


// Taking the task form the ChatGpt on the Student marks processing


/*
 * package com.pack1;
 * 
 * public class Tu30 { public int Total_Marks(int x, int y) { return
 * Percentage(x+y, y); } public int Percentage(int sum, int y) { return
 * Bonus_Percentage(sum/2); } public int Bonus_Percentage(int div) { int
 * Bonus1=5; if (Bonus_Percentage>=85+Bonus1) { return
 * Final_Percentage(Bonus_Percentage/2); } } public static void main(String[]
 * args) { Tu30 obj=new Tu30(); obj.Total_Marks(85,95); }
 * 
 * }
 */


/*
 * package com.pack1;
 * 
 * public class Tu30 { public void meth1(String name) {
 * System.out.println(name); }
 * 
 * public static void main(String[] args) { Tu30 obj = new Tu30();
 * obj.meth1(args[0]); } }
 */

//package com.pack1;

/*
 * public class Tu30 { public boolean isPositive(int n){ return n > 0; }
 * 
 * public static void main(String[] args){ System.out.println(new
 * Tu30().isPositive(-3)); } }
 */

/*
 * class Tu30 { int getValue() { return 5; }
 * 
 * public static void main(String[] args) { System.out.println(new
 * Tu30().getValue()); } }
 */
