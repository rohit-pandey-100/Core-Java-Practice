# ClassA.java - Complete Explanation

## 📌 Program Overview

This Java program demonstrates the basic concepts of:

- Package declaration
- Class creation
- Instance method
- `void` return type
- `main()` method
- Object creation
- Anonymous object
- Method calling
- Program execution flow

The main purpose of this program is to understand how an instance method can be called by creating an object of a class.

---

## 💻 Source Code

```java
package com.pack1;

public class ClassA
{
    public void meth1()
    {
        System.out.println("Hello world");
    }

    public static void main(String[] args)
    {
        new ClassA().meth1();
    }
}
```

---

# 🔍 Complete Line-by-Line Explanation

## 1. Package Declaration

```java
package com.pack1;
```

### Explanation

The `package` keyword is used to place related Java classes inside a particular package.

Here:

```java
com.pack1
```

is the name of the package.

The `ClassA` class belongs to the `com.pack1` package.

### Why do we use packages?

Packages are used to:

- Organize Java classes
- Avoid class name conflicts
- Make large projects easier to manage
- Provide better code structure

---

## 2. Class Declaration

```java
public class ClassA
```

This statement creates a class named `ClassA`.

Let us understand each keyword separately.

### `public`

`public` is an access modifier.

It means that the `ClassA` class can be accessed from other packages and classes.

### `class`

The `class` keyword is used to create a class in Java.

A class is a blueprint or template used to define data and behavior.

### `ClassA`

`ClassA` is the name of the class.

Because the class is declared as `public`, the filename must be:

```text
ClassA.java
```

---

## 3. Opening Curly Brace

```java
{
```

The opening curly brace marks the beginning of the `ClassA` class body.

All variables, methods, constructors, and blocks belonging to the class are written inside the class body.

---

## 4. Instance Method Declaration

```java
public void meth1()
```

This statement creates a method named `meth1()`.

Let us understand each part.

### `public`

The `public` keyword is an access modifier.

It means that this method can be accessed from other classes.

### `void`

`void` is the return type of the method.

It means that the method does not return any value.

For example:

```java
public void meth1()
```

The method performs an operation but does not send any value back to the caller.

### `meth1`

`meth1` is the name of the method.

### `()`

The parentheses represent the parameter list of the method.

In this program, the parentheses are empty:

```java
()
```

Therefore, the method does not accept any parameters.

---

# ⭐ Why is `meth1()` an Instance Method?

```java
public void meth1()
```

The `meth1()` method does not contain the `static` keyword.

Therefore, it is an **instance method**.

An instance method belongs to an object of the class.

To call an instance method, we normally need to create an object.

Example:

```java
ClassA obj = new ClassA();

obj.meth1();
```

In this program, an anonymous object is used instead.

---

## 5. Print Statement

```java
System.out.println("Hello world");
```

This statement prints:

```text
Hello world
```

on the console.

Let us understand each part.

### `System`

`System` is a predefined class available in Java.

### `out`

`out` is a static member of the `System` class.

It represents the standard output stream.

### `println()`

`println()` is a method used to print data on the console.

After printing the data, it moves the cursor to the next line.

### `"Hello world"`

This is a String literal.

The text written inside double quotation marks is considered a String in Java.

---

# 🚀 main() Method

```java
public static void main(String[] args)
```

The `main()` method is the entry point of this Java program.

When the program is executed, the JVM starts execution from the `main()` method.

Let us understand every part.

---

## `public`

```java
public
```

The `main()` method is declared `public` so that the JVM can access it.

---

## `static`

```java
static
```

The `static` keyword means that the `main()` method belongs to the class rather than an object.

Therefore, the JVM can call the `main()` method without creating an object of `ClassA`.

---

## `void`

```java
void
```

The `main()` method does not return any value.

Therefore, its return type is `void`.

---

## `main`

```java
main
```

`main` is the name of the method from which program execution starts.

---

## `String[] args`

```java
String[] args
```

This is used to receive command-line arguments.

### `String`

`String` is a predefined class in Java.

### `[]`

The square brackets indicate an array.

### `args`

`args` is the name of the reference variable.

Therefore:

```java
String[] args
```

means that `args` can refer to an array of String values.

---

# 🧱 Object Creation and Method Calling

The most important statement in this program is:

```java
new ClassA().meth1();
```

Let us understand it step by step.

---

## Step 1: `new` Keyword

```java
new
```

The `new` keyword is used to create an object in Java.

When the `new` keyword is executed, memory is allocated for the object.

---

## Step 2: Constructor Call

```java
ClassA()
```

This represents a constructor call.

You did not explicitly write a constructor inside the `ClassA` class.

Therefore, Java provides a default constructor automatically, provided no constructor is explicitly declared.

Conceptually, the object creation statement is:

```java
new ClassA()
```

---

## Step 3: Anonymous Object

```java
new ClassA()
```

This creates an anonymous object.

### Why is it called an anonymous object?

Normally, an object is created and its reference is stored in a reference variable.

Example:

```java
ClassA obj = new ClassA();
```

Here:

```java
obj
```

is the reference variable.

But your program uses:

```java
new ClassA()
```

There is no reference variable storing the reference to this newly created object.

Therefore, it is called an **anonymous object**.

---

# 🔄 Method Calling

```java
.meth1();
```

After creating the anonymous object, the `meth1()` method is called using that object.

The complete statement is:

```java
new ClassA().meth1();
```

It performs two operations:

1. Creates an object of `ClassA`
2. Calls the `meth1()` method using that object

---

# 🔁 Normal Object vs Anonymous Object

## Normal Object Creation

```java
ClassA obj = new ClassA();

obj.meth1();
```

Here:

- `ClassA` is the class name
- `obj` is the reference variable
- `new` creates the object
- `ClassA()` calls the constructor
- `obj.meth1()` calls the method

---

## Anonymous Object Creation

```java
new ClassA().meth1();
```

Here:

- `new ClassA()` creates the object
- No reference variable is used
- `.meth1()` immediately calls the method

Both approaches can call the `meth1()` method.

---

# ⚙️ Complete Program Execution Flow

When the program runs, the following steps occur:

### Step 1

The JVM looks for the `main()` method.

```java
public static void main(String[] args)
```

### Step 2

Program execution starts from the `main()` method.

### Step 3

The following statement executes:

```java
new ClassA().meth1();
```

### Step 4

The `new` keyword creates an object of `ClassA`.

### Step 5

The default constructor of `ClassA` is called during object creation.

### Step 6

The `meth1()` instance method is called using the newly created anonymous object.

### Step 7

Control moves to:

```java
public void meth1()
```

### Step 8

The following statement executes:

```java
System.out.println("Hello world");
```

### Step 9

The output is displayed on the console.

### Step 10

The `meth1()` method completes its execution.

### Step 11

Control returns to the `main()` method.

### Step 12

The `main()` method completes, and the program terminates.

---

# 📤 Program Output

```text
Hello world
```

---

# 📊 Important Elements Used in the Program

| Code | Meaning |
|---|---|
| `package com.pack1` | Package declaration |
| `public` | Access modifier |
| `class` | Keyword used to declare a class |
| `ClassA` | Class name |
| `void` | Method does not return a value |
| `meth1()` | Instance method |
| `System.out.println()` | Prints output on the console |
| `static` | Member belongs to the class |
| `main()` | Entry point of the program |
| `String[] args` | Stores command-line arguments |
| `new` | Creates an object |
| `ClassA()` | Constructor call |
| `new ClassA()` | Anonymous object creation |
| `.meth1()` | Instance method calling |

---

# 🎯 Concepts Demonstrated

This program demonstrates:

- Package
- Public Access Modifier
- Class
- Instance Method
- `void` Return Type
- `main()` Method
- `static` Keyword
- `String[] args`
- Object Creation
- `new` Keyword
- Default Constructor
- Anonymous Object
- Method Calling
- Console Output
- Program Execution Flow

---

# 💡 Key Learning Point

The most important concept demonstrated by this program is:

```java
new ClassA().meth1();
```

This statement creates an anonymous object of the `ClassA` class and immediately uses that object to call the `meth1()` instance method.

The same operation can also be written using a reference variable:

```java
ClassA obj = new ClassA();

obj.meth1();
```

The difference is that the first approach uses an anonymous object, while the second approach stores the object's reference in a reference variable.
