// This code in the other object creating line of the code ( Class name and any word used to name the object; ) then write in next line (object name = new class name)



/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() { System.out.println("Rohit"); }
 * public static void main(String[] args) { Mon29 R; R=new Mon29(); R.meth1(); }
 * }
 */


// second code in the normal class code line  

/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() { System.out.println("Java"); }
 * public static void main(String[] arg) { Mon29 obj=new Mon29(); obj.meth1(); }
 * }
 */



// Third code is the null practice 

/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() {
 * System.out.println("Java is the grate "); } public static void main(String[]
 * args) { Mon29 obj=new Mon29(); if(obj != null) {
 * System.out.println("NULL practice"); } } }
 */

// Fourth code is practice to the null code include the obj is the null 

/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() {
 * System.out.println("Java is the grate "); } public static void main(String[]
 * args) { Mon29 obj = null; obj.meth1(); if(obj != null) {
 * System.out.println("NULL practice"); } } }
 */


// fifth code where we used the (object == null)

/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() {
 * System.out.println("Java null value"); } public static void main(String[]
 * args) { Mon29 obj=null; if (obj == null) {
 * System.out.println("Null is printing"); } } }
 */

// Sixth code is the with the null object created the new object to print the meth1 

/*
 * package com.pack1;
 * 
 * public class Mon29 { public void meth1() {
 * System.out.println("Java null value"); } public static void main(String[]
 * args) { Mon29 obj=null; if (obj == null) {
 * System.out.println("Null is printing"); obj=new Mon29(); obj.meth1(); } } }
 */

// Seventh code is the filed and method content by the class


/*
 * package com.pack1;
 * 
 * public class Mon29 { // Field int Student_ID=10023; String
 * Student_Name="Rohit";
 * 
 * // method public void meth1() { System.out.println("Student ID:" +
 * Student_ID); System.out.println("Student name:"+Student_Name); } public
 * static void main(String[] args) { Mon29 R=new Mon29(); R.meth1(); } }
 */

// Eighth code on, What is the default value of an uninitialized object reference? is that ocreet answer is the null


/*
 * package com.pack1;
 * 
 * public class Mon29 { //String Student_Name="Rohit"; String Student_Name; //
 * Not initialized int Student_ID=1001; Mon29 R; // Object reference
 * 
 * public void meth1() { System.out.println("Student Name:"+Student_Name);
 * System.out.println("Student ID:"+Student_ID); System.out.println(R); } public
 * static void main(String[] args) { Mon29 obj=new Mon29(); obj.meth1(); } }
 */


// Ninth code 

/*
 * package com.pack1;
 * 
 * public class Mon29 { //String Student_Name="Rohit"; String Student_Name; //
 * Not initialized int Student_ID=1001; Mon29 R; // Object reference
 * 
 * public void meth1() { System.out.println("Student Name:"+Student_Name);
 * System.out.println("Student ID:"+Student_ID); System.out.println(R); } public
 * void meth2() { System.out.println("Not null"); } public static void
 * main(String[] args) { Mon29 obj=new Mon29(); obj.meth1(); Mon29 R=new
 * Mon29(); R.meth2(); } }
 */